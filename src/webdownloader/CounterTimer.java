package webdownloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.TimerTask;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

class CounterTimer extends TimerTask {
        
        private InputStream is;
        private int total = 0;
        private char chosenChar;
        private int chosenCharCount = 0;
        private Home midlet;
        
        public CounterTimer(Home mid, String URL, String delimeter) {
            midlet = mid;
            try {
                is = ((HttpConnection) Connector.open(URL)).openInputStream();
                chosenChar = delimeter.charAt(0);
            } catch (Exception e) {
                midlet.getTicker().setString("Something bad happened. Can not count letters. Go back a valid URL");
                this.cancel();
            }
        }
        
        public void run() {
            try {
               // while(true){
                int c = is.read();
                if(c==-1){
                    //break;
                    throw new Exception("Done");
                }
                char letter = (char)c;
                //System.out.print(letter);
                if (letter == chosenChar) {
                    chosenCharCount++;
                }
                total++;
                
                float fractionComplete = (float)total / is.available();
                int percentComplete = (int) (fractionComplete * 100f);
                
                midlet.getCompleteGuage().setValue(percentComplete);
                if(percentComplete > 100){
                    midlet.getTicker().setString("Still counting, hang tight!");
                }
               // }
                  
            } catch (IOException ex) {
                midlet.getTicker().setString("Something weird happened.");
                this.cancel();
                
            } catch (Exception e){
                midlet.getTicker().setString("Completed counting...");
                midlet.switchDisplayable(null, midlet.getResults());
                
                float fraction = (float)chosenCharCount / (float)total;
                int percentOfDelimeter = (int) (fraction * 100f);
           
                midlet.getTotalCountedString().setText(String.valueOf(total));
                
                midlet.getDelimeterCountedString().setText(String.valueOf(chosenCharCount));
                midlet.getPercentageString().setText(percentOfDelimeter + "%");
                this.cancel();
            }
        }
    }
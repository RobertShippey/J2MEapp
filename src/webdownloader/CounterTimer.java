package webdownloader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

class CounterThread extends Thread {

    private static final String counting = "Counting...";
    private static final String error = "Something bad happened!";
    private static final String URLerror = "Try a different URL.";
    private static final String stillCounting = "Still counting, hang tight!";
    private static final String tickerDefault = "Ready to start counting!";
    private static final String noPiesForYou = "Unable to load pie chart, sorry!";
    
    private InputStream is;
    private int total = 0;
    private char chosenChar;
    private int chosenCharCount = 0;
    private Home midlet;
    private boolean running;
    private int f = 0;

    public CounterThread(Home mid, String URL, String delimeter) {
        midlet = mid;
        try {
            is = ((HttpConnection) Connector.open(URL)).openInputStream();
            chosenChar = delimeter.charAt(0);
            running = true;
            midlet.getTicker().setString(counting);
        } catch (Exception e) {
            midlet.getTicker().setString(error + " " + URLerror);
        }
    }

    public void stopCounting() {
        running = false;
        midlet.getCompleteGuage().setValue(0);
        midlet.getTicker().setString(tickerDefault);
        midlet = null;
        is = null;
    }

    public void run() {
        while (running) {
            try {
                int c = is.read();
                if (c == -1) {
                    //break;
                    throw new Exception("Done");
                }
                char letter = (char) c;
                //System.out.print(letter);
                if (letter == chosenChar) {
                    chosenCharCount++;
                }
                total++;

                float fractionComplete = (float) total / is.available();
                int percentComplete = (int) (fractionComplete * 100f);

                midlet.getCompleteGuage().setValue(percentComplete);
                if (percentComplete > 100) {
                    midlet.getTicker().setString(stillCounting);
                } else {  //BAD CODE START HERE
                    if ((f++ % 15) == 0) {
                        Thread.sleep(1);
                    }
                } //BAD CODE ENDS, PHEW!


            } catch (IOException ex) {
                //Probably lost internet connection
                midlet.getTicker().setString(error);
                return;
            } catch (Exception e) {
                midlet.switchDisplayable(null, midlet.getResults());
                midlet.getTicker().setString(tickerDefault);

                float fraction = (float) chosenCharCount / (float) total;
                int percentOfDelimeter = (int) (fraction * 100f);

                midlet.getTotalCountedString().setText(String.valueOf(total));

                midlet.getDelimeterCountedString().setText(String.valueOf(chosenCharCount));
                midlet.getPercentageString().setText(percentOfDelimeter + "%");

                try {
                    int image_height = 150;
                    int image_width = 225;
                    String url = "http://chart.googleapis.com/chart?chs=" + image_width + "x" + image_height + "&cht=p&chd=t:" + percentOfDelimeter + "," + (100 - percentOfDelimeter) + "&chp=0.1"
                            + "&chdl=" + chosenChar;
                    HttpConnection hpc;
                    hpc = (HttpConnection) Connector.open(url);
                    int length = (int) hpc.getLength();
                    byte[] data = new byte[length];
                    DataInputStream dis = new DataInputStream(hpc.openInputStream());
                    dis.readFully(data);
                    Image pic = Image.createImage(data, 0, data.length);
                    midlet.getImageItem().setImage(pic);
                } catch (Exception ee) {
                    midlet.getImageItem().setAltText(noPiesForYou);
                }
                return;
            }
        }
    }
}
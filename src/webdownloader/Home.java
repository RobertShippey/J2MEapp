/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webdownloader;

import java.util.Timer;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author n0305434
 */
public class Home extends MIDlet implements CommandListener {
    
    private Timer timer;
    private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form Home;
    private TextField urlTextField;
    private TextField charTextField;
    private Form Results;
    private StringItem totalCountedString;
    private StringItem delimeterCountedString;
    private StringItem percentageString;
    private Form Loading;
    private Gauge completeGuage;
    private Command okCommand;
    private Command exitCommand;
    private Command exitCommand1;
    private Command cancelCommand;
    private Command okCommand1;
    private Command backCommand;
    private Command exitCommand2;
    private Command exitCommand3;
    private Command okCommand2;
    private Command cancelCommand1;
    private Ticker ticker;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The Home constructor.
     */
    public Home() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getHome());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display;
     * if <code>null</code>, then <code>nextDisplayable</code> is set
     * immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Home ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of Home component.
     *
     * @return the initialized component instance
     */
    public Form getHome() {
        if (Home == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            Home = new Form("Welcome", new Item[]{getUrlTextField(), getCharTextField()});//GEN-BEGIN:|14-getter|1|14-postInit
            Home.addCommand(getOkCommand1());
            Home.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return Home;
    }
//</editor-fold>//GEN-END:|14-getter|2|

    // write pre-action user code here
    // write post-action user code here
//<editor-fold defaultstate="collapsed" desc=" Generated Getter: urlTextField ">//GEN-BEGIN:|17-getter|0|17-preInit
    /**
     * Returns an initialized instance of urlTextField component.
     *
     * @return the initialized component instance
     */
    public TextField getUrlTextField() {
        if (urlTextField == null) {//GEN-END:|17-getter|0|17-preInit
            // write pre-init user code here
            urlTextField = new TextField("Enter a URL to test:", "http://www.google.co.uk/", 32, TextField.ANY);//GEN-LINE:|17-getter|1|17-postInit
            // write post-init user code here
        }//GEN-BEGIN:|17-getter|2|
        return urlTextField;
    }
//</editor-fold>//GEN-END:|17-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: charTextField ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initialized instance of charTextField component.
     *
     * @return the initialized component instance
     */
    public TextField getCharTextField() {
        if (charTextField == null) {//GEN-END:|19-getter|0|19-preInit
            // write pre-init user code here
            charTextField = new TextField("Enter two chatacters to test for:", "a", 32, TextField.ANY);//GEN-LINE:|19-getter|1|19-postInit
            // write post-init user code here
        }//GEN-BEGIN:|19-getter|2|
        return charTextField;
    }
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|21-getter|1|21-postInit
            // write post-init user code here
        }//GEN-BEGIN:|21-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelCommand ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of cancelCommand component.
     *
     * @return the initialized component instance
     */
    public Command getCancelCommand() {
        if (cancelCommand == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            cancelCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return cancelCommand;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == Home) {//GEN-BEGIN:|7-commandAction|1|33-preAction
            if (command == okCommand1) {//GEN-END:|7-commandAction|1|33-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoading());//GEN-LINE:|7-commandAction|2|33-postAction
                // write post-action user code here
                timer = new Timer();
            
            String url = this.getUrlTextField().getString();
            String chars = this.getCharTextField().getString();
            CounterTimer task = new CounterTimer(this, url, chars);
            
            timer.schedule(task, 0, 1);
            }//GEN-BEGIN:|7-commandAction|3|57-preAction
        } else if (displayable == Loading) {
            if (command == cancelCommand1) {//GEN-END:|7-commandAction|3|57-preAction
                // write pre-action user code here
                switchDisplayable(null, getHome());//GEN-LINE:|7-commandAction|4|57-postAction
                // write post-action user code here
                timer.cancel();
                this.getCompleteGuage().setValue(0);
            }//GEN-BEGIN:|7-commandAction|5|40-preAction
        } else if (displayable == Results) {
            if (command == backCommand) {//GEN-END:|7-commandAction|5|40-preAction
                // write pre-action user code here
                this.getCompleteGuage().setValue(0);
                timer.cancel();
                switchDisplayable(null, getHome());//GEN-LINE:|7-commandAction|6|40-postAction
                // write post-action user code here
            } else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|7|43-preAction
                // write pre-action user code here
                this.getCompleteGuage().setValue(0);
                this.getTotalCountedString().setText("0");
                timer.cancel();
                exitMIDlet();//GEN-LINE:|7-commandAction|8|43-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|7-postCommandAction
        }//GEN-END:|7-commandAction|9|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|10|
//</editor-fold>//GEN-END:|7-commandAction|10|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Results ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of Results component.
     *
     * @return the initialized component instance
     */
    public Form getResults() {
        if (Results == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            Results = new Form("Results", new Item[]{getTotalCountedString(), getDelimeterCountedString(), getPercentageString()});//GEN-BEGIN:|31-getter|1|31-postInit
            Results.addCommand(getBackCommand());
            Results.addCommand(getExitCommand2());
            Results.setCommandListener(this);//GEN-END:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return Results;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: totalCountedString ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of totalCountedString component.
     *
     * @return the initialized component instance
     */
    public StringItem getTotalCountedString() {
        if (totalCountedString == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            totalCountedString = new StringItem("Total characters counted:", "0");//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return totalCountedString;
    }
//</editor-fold>//GEN-END:|35-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|32-getter|0|32-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|32-getter|1|32-postInit
            // write post-init user code here
        }//GEN-BEGIN:|32-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|39-getter|0|39-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|39-getter|1|39-postInit
            // write post-init user code here
        }//GEN-BEGIN:|39-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|39-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initialized instance of exitCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return exitCommand2;
    }
//</editor-fold>//GEN-END:|42-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of exitCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand3() {
        if (exitCommand3 == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            exitCommand3 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|45-getter|1|45-postInit
            // write post-init user code here
        }//GEN-BEGIN:|45-getter|2|
        return exitCommand3;
    }
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of ticker component.
     *
     * @return the initialized component instance
     */
    public Ticker getTicker() {
        if (ticker == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            ticker = new Ticker("Counting...");//GEN-LINE:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return ticker;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: delimeterCountedString ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initialized instance of delimeterCountedString component.
     *
     * @return the initialized component instance
     */
    public StringItem getDelimeterCountedString() {
        if (delimeterCountedString == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            delimeterCountedString = new StringItem("Delimeter characters counted:", "0");//GEN-LINE:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return delimeterCountedString;
    }
//</editor-fold>//GEN-END:|48-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: percentageString ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initialized instance of percentageString component.
     *
     * @return the initialized component instance
     */
    public StringItem getPercentageString() {
        if (percentageString == null) {//GEN-END:|49-getter|0|49-preInit
            // write pre-init user code here
            percentageString = new StringItem("Percentage of delimeters in file:", "0");//GEN-LINE:|49-getter|1|49-postInit
            // write post-init user code here
        }//GEN-BEGIN:|49-getter|2|
        return percentageString;
    }
//</editor-fold>//GEN-END:|49-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Loading ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initialized instance of Loading component.
     *
     * @return the initialized component instance
     */
    public Form getLoading() {
        if (Loading == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            Loading = new Form("Loading", new Item[]{getCompleteGuage()});//GEN-BEGIN:|50-getter|1|50-postInit
            Loading.setTicker(getTicker());
            Loading.addCommand(getCancelCommand1());
            Loading.setCommandListener(this);//GEN-END:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return Loading;
    }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: completeGuage ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of completeGuage component.
     *
     * @return the initialized component instance
     */
    public Gauge getCompleteGuage() {
        if (completeGuage == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            completeGuage = new Gauge("Counting in progress", false, 100, 0);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return completeGuage;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|53-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelCommand1 ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initialized instance of cancelCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getCancelCommand1() {
        if (cancelCommand1 == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            cancelCommand1 = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return cancelCommand1;
    }
//</editor-fold>//GEN-END:|56-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
}

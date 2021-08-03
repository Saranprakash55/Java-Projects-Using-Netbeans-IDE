/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.clock.project.pkg2;

    import java.util.Date;


public class ClockThread extends Thread {
    DigitalClockProject2 dc;
    String time;
    
    public ClockThread(DigitalClockProject2 dc) {
        
        this.dc = dc;
        start();
    
    }
    public void run() {
        while(true) {
            time = "" + new Date();
            dc.jlabClock.setText(time);
        }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.clock.project.pkg2;
    import java.awt.FlowLayout;
    import java.awt.Font;
    import java.awt.Color;
    import javax.swing.JFrame;
    import javax.swing.JLabel;

public class DigitalClockProject2 extends JFrame {
    
    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClockProject2() {
        jlabClock = new JLabel("");
        setLayout (new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,50));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.green);
        add(jlabClock);
        setSize(1200,120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    
    }

    
    public static void main(String[] args) {
        
        new DigitalClockProject2();
    }
    
}

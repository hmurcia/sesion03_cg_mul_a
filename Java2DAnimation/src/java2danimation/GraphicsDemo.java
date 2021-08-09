package java2danimation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsDemo extends JPanel implements ActionListener {
    
    Timer timer = new Timer(1000, this);
    int seconds = 0;
    
    public GraphicsDemo() {
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        seconds++;
        System.out.println(seconds + " second/s have passed.");
    }
}

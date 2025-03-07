import java.awt.*;
import javax.swing.*;

public class FanLinesTopLeft extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int steps = 20;  // Number of steps

        for (int i = 0; i <= steps; i++) {
            int x = i * width / steps;  // Moving right
            int y = height - (i * height / steps);  // Moving up
            // g.drawLine(0, 0, x, y); //assignment---------------1



            
            g.drawLine(0, 0, x, y);     // // Top-left corner      //assignment---------------2
            g.drawLine(0, height, x, height - y);       // // Bottom-left corner
            g.drawLine(width, 0, width - x, y);     // // Top-right corner
            g.drawLine(width, height, width - x, height - y);    // // Bottom-right corner
        }
 
    
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fan Lines from Top-Left");
        FanLinesTopLeft panel = new FanLinesTopLeft();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

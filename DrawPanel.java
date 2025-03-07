import java.awt.*;
import javax.swing.*;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();




        
        // Random rand = new Random();

        // // Draw 50 random lines
        // for (int i = 0; i < 500; i++) {
        //     int x1 = rand.nextInt(width);
        //     int y1 = rand.nextInt(height);
        //     int x2 = rand.nextInt(width);
        //     int y2 = rand.nextInt(height);
        //     g.drawLine(x1, y1, x2, y2);
        // }








        // int centerX = width / 2;
        // int centerY = height / 2;
        // int step = 20;

        // // Draw lines radiating from the center
        // for (int i = 0; i <= width; i += step) {
        //     g.drawLine(centerX, centerY, 0, i);
        //     g.drawLine(centerX, centerY, height, i);
        //     g.drawLine(centerX, centerY, i, 0);
        //     g.drawLine(centerX, centerY, i, width);
        // }





        // int step = 20; // Spacing between lines

        // // Vertical lines
        // for (int x = 0; x <= width; x += 20) {
        //     g.drawLine(x, 0, x, height);
        // }

        // // Horizontal lines
        // for (int y = 0; y <= height; y += 20) {
        //     g.drawLine(0, y, width, y);
        // }






         // Draw multiple diagonal lines
        //  for (int i = 0; i <= width; i +=20) {
        //     g.drawLine(i, 0, width - i, height);
        //     g.drawLine(0, i, width, height - i);
        // }




        //Draw diagonal lines
        g.drawLine(0, 0, width, height);
        g.drawLine(width, 0, 0, height);



        //  // Draw vertical lines
        //  for (int i = 0; i <= width; i += 5) {
        //     g.drawLine(i, 0, i, height);
        // }
        // // Draw horizontal lines
        // for (int i = 0; i <= height; i += 5) {
        //     g.drawLine(0, i, width, i);
        // }




        // // Draw diamond shape
        // int[] xPoints = {width / 2, width, width / 2, 0};
        // int[] yPoints = {0, height / 2, height, height / 2};
        // g.drawPolygon(xPoints, yPoints, 4);
    }

    

    public static void main(String[] args) {
    DrawPanel panel = new DrawPanel();
    JFrame frame = new JFrame();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 250);
    frame.add(panel);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null); // Center the frame on the screen

 }
}
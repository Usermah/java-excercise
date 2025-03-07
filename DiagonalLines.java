import java.awt.*;
import javax.swing.*;

public class DiagonalLines extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int steps =20;

        for (int i = 0; i <= steps; i++) {
            int xStart = 0; // Always on the left edge
            int yStart = i * height / steps; // Moving down the left edge

            int xEnd = i * width / steps; // Moving right on the bottom edge
            int yEnd = height; // Always at the bottom edge

            g.drawLine(xStart, yStart, xEnd, yEnd);
        

            





            // for (int i = 0; i <= steps; i++) {
            //     int xOffset = i * width / steps;
            //     int yOffset = i * height / steps;
            // // Top-left to bottom edge
            // g.drawLine(0, yOffset, xOffset, height);
            // // Bottom-left to right edge
            // g.drawLine(0, height - yOffset, xOffset, 0);
            // // Top-right to bottom edge
            // g.drawLine(width, yOffset, width - xOffset, height);
            // // Bottom-right to left edge
            // g.drawLine(width, height - yOffset, width - xOffset, 0);
        
        }
    }

    


    public static void main(String[] args) {
        JFrame frame = new JFrame("Diagonal Lines from Top-Left");
        DiagonalLines panel = new DiagonalLines();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
   }


}
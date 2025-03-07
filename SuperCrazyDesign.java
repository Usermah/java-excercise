import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.*;

public class SuperCrazyDesign extends JPanel {
    private int steps = 30;
    private int animationStep = 0;
    private Random random = new Random();

    public SuperCrazyDesign() {
        Timer timer = new Timer(50, e -> {
            animationStep++;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Rotation effect
        AffineTransform oldTransform = g2d.getTransform();
        g2d.rotate(Math.toRadians(animationStep * 2), width / 2.0, height / 2.0);

        // Dynamic steps change
        int dynamicSteps = steps + (int) (Math.sin(animationStep * 0.1) * 10);

        for (int i = 0; i <= dynamicSteps; i++) {
            int x = i * width / dynamicSteps;
            int y = i * height / dynamicSteps;

            // RGB color shifting effect
            int red = (int) ((Math.sin(animationStep * 0.1 + i) + 1) * 127);
            int green = (int) ((Math.cos(animationStep * 0.1 + i) + 1) * 127);
            int blue = (int) ((Math.sin(animationStep * 0.05 + i) + 1) * 127);
            g2d.setColor(new Color(red, green, blue));

            // Random shaking effect for added craziness
            int shakeX = random.nextInt(5) - 2; 
            int shakeY = random.nextInt(5) - 2;

            // Draw intersecting crazy lines
            g2d.drawLine(0 + shakeX, y + shakeY, x + shakeX, height);
            g2d.drawLine(x + shakeX, 0 + shakeY, width, y + shakeY);
            g2d.drawLine(width - x + shakeX, 0 + shakeY, 0, height - y + shakeY);
            g2d.drawLine(width, height - y + shakeY, width - x + shakeX, height);
        }

        // Restore original transform
        g2d.setTransform(oldTransform);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("💥💥 Super Crazy Animated Design 💥💥");
        SuperCrazyDesign panel = new SuperCrazyDesign();
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

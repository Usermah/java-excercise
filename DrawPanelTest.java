import javax.swing.*;
public class DrawPanelTest{
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.add(panel);
        frame.setVisible(true);

     }
}
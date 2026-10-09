
import java.awt.*;
import javax.swing.*;

public class ShapesApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(20, 30, 100, 60);
        g.drawOval(150, 30, 70, 70);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometric Shapes");

        f.add(new ShapesApplet());
        f.setSize(300, 320);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

import java.awt.*;
import javax.swing.*;

public class ColorApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(30, 30, 120, 60);

        g.setColor(Color.BLUE);
        g.fillOval(180, 30, 100, 60);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Applet");

        f.add(new ColorApplet());
        f.setSize(350, 220);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
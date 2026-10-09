
import java.awt.*;
import javax.swing.*;

public class FaceApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(50, 30, 150, 180);

        g.fillOval(85, 80, 15, 15);
        g.fillOval(150, 80, 15, 15);

        g.drawLine(125, 100, 115, 135);
        g.drawLine(115, 135, 130, 135);

        g.drawArc(90, 135, 70, 40, 180, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");

        f.add(new FaceApplet());
        f.setSize(300, 280);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
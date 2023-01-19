//64050699 สรวิศ วงศ์ษา

import java.awt.*;
import javax.swing.*;

class GraphicsSwing extends JPanel
{
    public static void main(String[] args)
    {
        GraphicsSwing m = new GraphicsSwing();

        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        g.drawString("Hello", 40, 40);
        g.setColor(Color.BLUE);
        g.fillRect(130, 30, 100, 80);
        g.drawOval(30, 130, 50, 60);
        g.setColor(Color.RED);
        g.drawLine(0, 0, 200, 30);
        g.fillOval(130, 130, 50, 60);
        g.drawArc(30, 200, 40, 50, 90, 60);
        g.fillArc(30, 130, 40, 50, 180, 40);

        g.fillRect(300, 300, 10, 10);
        g.setColor(Color.ORANGE);
        g.fillRect(270, 360, 10, 10);
        g.setColor(Color.YELLOW);
        g.fillRect(330, 360, 10, 10);
        g.setColor(Color.GREEN);
        g.fillRect(240, 420, 10, 10);
        g.setColor(Color.CYAN);
        g.fillRect(300, 420, 10, 10);
        g.setColor(Color.BLUE);
        g.fillRect(360, 420, 10, 10);
        g.setColor(Color.MAGENTA);
        g.fillRect(210, 480, 10, 10);
        g.setColor(Color.PINK);
        g.fillRect(270, 480, 10, 10);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(330, 480, 10, 10);
        g.setColor(Color.BLACK);
        g.fillRect(390, 480, 10, 10);
    }

}
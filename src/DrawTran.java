import javax.swing.*;
import java.awt.*;

public class DrawTran extends JFrame {

    public DrawTran(){
        setTitle("My first Frame");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.drawLine(100,60,100,200);
        g.drawLine(100,60,180,200);
        g.drawLine(200,60,100,200);

    }

    public static void main(String[] args) {
        new DrawTran();
    }
}

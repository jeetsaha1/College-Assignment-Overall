
import javax.swing.*;
import java.awt.*;

public class main extends JPanel {
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawString("Hello World!", 20, 20);
}

public static void main(String[] args) {
JFrame frame = new JFrame("Java Swing App");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(new main());
frame.setSize(300, 100);
frame.setVisible(true);
}
}
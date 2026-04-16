10:
        1.
import javax.swing.*;
import java.awt.*;

public class tamspma1 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 60, 45);
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 210, 45);
        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 100, 140);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");
        f.add(new tamspma1());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
2.
        import javax.swing.*;
        import java.awt.event.*;

public class tamspma2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        JLabel label = new JLabel();
        b.addActionListener(e -> label.setText("Hello Java"));
        f.setLayout(new java.awt.FlowLayout());
        f.add(b);
        f.add(label);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
3.
        import javax.swing.*;

public class tamspma3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField(10);
        JButton b = new JButton("OK");
        JLabel label = new JLabel();
        b.addActionListener(e ->
                label.setText("Сәлем, " + tf.getText())
        );
        f.setLayout(new java.awt.FlowLayout());
        f.add(tf);
        f.add(b);
        f.add(label);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
4.
        import javax.swing.*;
        import java.awt.*;

public class tamspma4 extends JPanel {
    Color c = Color.RED;
    public tamspma4() {
        JButton btn = new JButton("Change");
        btn.addActionListener(e -> {
            if (c == Color.RED) c = Color.GREEN;
            else if (c == Color.GREEN) c = Color.BLUE;
            else c = Color.RED;
            repaint();
        });
        add(btn);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(100, 50, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tamspma4());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
5.
        import javax.swing.*;
        import java.awt.*;

public class tamspma5 extends JPanel {
    int x = 50, y = 50;
    public tamspma5() {
        JTextField tx = new JTextField(5);
        JTextField ty = new JTextField(5);
        JButton btn = new JButton("Draw");
        btn.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });
        add(tx);
        add(ty);
        add(btn);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Coords");
        f.add(new tamspma5());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
6.
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class tamspma6 extends JPanel {
    int x = 0, y = 0;
    public tamspma6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 5, 5);
        g.drawString("X=" + x + " Y=" + y, 20, 20);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse");
        f.add(new tamspma6());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
7.
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class tamspma7 extends JPanel implements KeyListener {
    char ch = ' ';

    public tamspma7() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar();
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Symbol: " + ch, 100, 100);
    }

    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}

    public static void main(String[] args) {
        JFrame f = new JFrame("Key");
        f.add(new tamspma7());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
8.
        import javax.swing.*;

public class tamspma8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calc");
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton btn = new JButton("+");
        JLabel result = new JLabel("Result:");
        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b));
        });
        f.setLayout(new java.awt.FlowLayout());
        f.add(t1);
        f.add(t2);
        f.add(btn);
        f.add(result);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
9.
        import javax.swing.*;
        import java.awt.*;

public class tamspma9 extends JPanel {
    int x = 0;
    public tamspma9() {
        Timer t = new Timer(100, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        });
        t.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Animation");
        f.add(new tamspma9());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
10.
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class tamspma10 extends JPanel {
    Color c = Color.RED;
    public tamspma10() {
        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");
        ItemListener listener = e -> {
            if (red.isSelected()) c = Color.RED;
            if (green.isSelected()) c = Color.GREEN;
            if (blue.isSelected()) c = Color.BLUE;
            repaint();
        };
        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);
        add(red);
        add(green);
        add(blue);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillRect(100, 80, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox");
        f.add(new tamspma10());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
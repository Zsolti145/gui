import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

  private int count = 0;
  private JLabel label;
  private JFrame frame;
  private JPanel panel;

  public GUI() {
    frame = new JFrame();

    JButton gomb = new JButton("Click Me!");
    gomb.addActionListener(this);
    label = new JLabel("Number of clicks: 0");

    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(gomb);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Our Gui");
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) throws Exception {
    new GUI();
    System.out.println("HELOO");
  }

  @Override
  public void actionPerformed(java.awt.event.ActionEvent e) {
    count++;
    label.setText("Number of clicks: " + count);
  }
}

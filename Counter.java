import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCounter;
  int rightCounter;

  Counter(){
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    leftCounter = 0;
    rightCounter = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count: " + leftCounter);
    rightLabel = new JLabel("Count: " + rightCounter);
    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")){
      leftCounter ++;
      leftLabel.setText("Count: " + leftCounter);
    }
    if(ae.getActionCommand().equals("Right")){
      rightCounter ++;
      rightLabel.setText("Count: " + rightCounter);
    }
    if(ae.getActionCommand().equals("Reset")){
      leftCounter = 0;
      rightCounter = 0;
      leftLabel.setText("Count: " + leftCounter);
      rightLabel.setText("Count: " + rightCounter);
    }
  }
}
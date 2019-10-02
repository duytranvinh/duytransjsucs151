package lab2;

import java.awt.*;
import javax.swing.*;

public class FrameTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      final CircleIcon circle = new CircleIcon(50);
      final JLabel label = new JLabel(circle);
      
      JButton greenBtn = new JButton("Repaint Green ");
      greenBtn.addActionListener(event -> circle.changeColor(Color.GREEN));
      JButton redBtn = new JButton("Repaint Red");
      JButton blueBtn = new JButton("Repaint Blue ");

      frame.setLayout(new FlowLayout());

      frame.add(label);
      frame.add(greenBtn);
      frame.add(redBtn);
      frame.add(blueBtn);

      frame.setSize(500, 550);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}

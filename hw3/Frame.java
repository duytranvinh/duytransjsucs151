package chap4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame
{
	private JFrame frame = new JFrame();
	private JButton zoomIn;
	private JButton zoomOut;

	public Frame()
	{
		prepareGUI();
	}
	
	private void prepareGUI()
	{
		frame = new JFrame("Car");
		frame.setSize(500, 500);
		zoomIn = new JButton("Zoom In");
		zoomOut = new JButton ("Zoom Out");
		CarIcon carIcon = new CarIcon(100);
		JLabel label = new JLabel(carIcon, JLabel.CENTER); // place the car icon inside a label
		label.setPreferredSize(new Dimension(200,200));

		// main panel that contains 2 sub-panels
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));// panels are placed vertically

		// sub-panel 1: 2 buttons
		JPanel subPanel1 = new JPanel();
		subPanel1.add(zoomIn);
		subPanel1.add(zoomOut);

		// sub-panel: car icon
		JPanel subPanel2 = new JPanel();
		subPanel2.add(label);

		// put sub-panels inside main panel, then put main panel inside main frame
		mainPanel.add(subPanel1);
		mainPanel.add(subPanel2);
		frame.add(mainPanel);

		// action: if user clicks "Zoom In" button
		zoomIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int width = carIcon.getIconWidth();
				if (width<200){ // increase width by 20 each zooming in
					carIcon.setWidth(width+20);
				}
				label.repaint();
			}
		});
		// if user clicks "Zoom Out" button
		zoomOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int width = carIcon.getIconWidth();
				if (width >= 60){ // decrease width by 20 each zooming out
					carIcon.setWidth(width-20);
				}
				label.repaint();
			}
		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showGUI()
	{
        frame.setVisible(true);
    }
}

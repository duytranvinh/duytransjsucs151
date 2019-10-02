package lab2;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
   An icon that has the shape of the planet Mars.
 */
public class CircleIcon implements Icon
{
	private int size;
	private Color color;
	
	/**
      Constructs a Mars icon of a given size.
      @param aSize the size of the icon
	 */
	public CircleIcon(int aSize)
	{
		size = aSize;
		color = Color.RED;
	}

	public int getIconWidth()
	{
		return size;
	}

	public int getIconHeight()
	{
		return size;
	}
	
	public void changeColor(Color c)
	{
		color = c;
	}
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
				size, size);
		g2.setColor(this.color);
		g2.fill(circle);
	}

}


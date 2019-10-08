package chap5;

/**
A html invoice formatter.
*/
public class HTMLFormatter
{
	private double total;
	
	public String formatHeader()
	{
		total = 0;
		return "<html><center><b><font size=5 color=red>INVOICE</font></b></center><br><BLOCKQUOTE>";
	}

	public String formatLineItem(LineItem item)
	{
		// if current line item has more than 1 duplicate
		int count = item.getQuantity();
		while(count > 0){ // sum of all duplicates
			total += item.getPrice();
			count--;
		}

		return (String.format("%s: <b>$%.2f</b> <font color = green>x%d</font><br>",item.toString(),item.getPrice(),item.getQuantity()));
	}

	public String formatFooter()
	{
		return (String.format("<br><font color=blue><b>TOTAL DUE: $%.2f</b></font></BLOCKQUOTE></html>", total));
	}
}

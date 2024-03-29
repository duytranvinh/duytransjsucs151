package chap5;

/**
A simple invoice formatter.
 */
public class SimpleFormatter implements InvoiceFormatter
{
	public String formatHeader()
	{
		total = 0;
		return "     I N V O I C E\n\n\n";
	}

	public String formatLineItem(LineItem item)
	{
		int count = item.getQuantity();
        while(count > 0)
        {
            total += item.getPrice();
            count--;
        }		
//		return (String.format(
//				"%s: $%.2f\n",item.toString(),item.getPrice()));
		return (String.format("%s: $%.2f \t x%d\n", item.toString(), item.getPrice(), item.getQuantity()));
	}

	public String formatFooter()
	{
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}

	private double total;
}

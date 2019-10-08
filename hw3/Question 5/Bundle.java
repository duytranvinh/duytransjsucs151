package chap5;

import java.util.*;

/**
   A bundle of line items that is again a line item.
 */
public class Bundle implements LineItem
{
    private int quantity;
	private ArrayList<LineItem> items;
	
	/**
      Constructs a bundle with no items.
	 */
	public Bundle()
	{
		items = new ArrayList<>();
		quantity = 1;
	}

	/**
      Adds an item to the bundle.
      @param item the item to add
	 */
	public void add(LineItem item) { items.add(item); }

	public double getPrice()
	{
		double price = 0;

		for (LineItem item : items)
			price += item.getPrice();
		return price;
	}

	public String toString()
	{
		String description = "Bundle: ";
		for (int i = 0; i < items.size(); i++)
		{
			if (i > 0) description += ", ";
			description += items.get(i).toString();
		}
		return description;
	}
	
	 public int getQuantity()
	 {
		 return quantity;
	 }
	 
	 public void addQuantity()
	 {
		 quantity++;
	 }
}

package chap5;

/**
A product with a price and description.
 */
public class Product implements LineItem
{
	private String description;
	private int quantity;
	private double price;

	/**
   Constructs a product.
   @param description the description
   @param price the price
	 */
	public Product(String description, double price)
	{
		this.description = description;
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void addQuantity()
	{
		quantity++;
	}
	public String toString()
	{
		return description;
	}

}

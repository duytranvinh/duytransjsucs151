package chap5;

/**
A line item in an invoice.
 */
public interface LineItem
{
	/**
   Gets the price of this line item.
   @return the price
	 */
	double getPrice();
	
	/**
   Gets the description of this line item.
   @return the description
	 */   
	
	String toString();
	
	/**
     * Gets the quantity of this line item.
     * @return the quantity
     */
    int getQuantity();
    
    /**
     * Increases the quantity of this line item by 1.
     */
    void addQuantity();
}


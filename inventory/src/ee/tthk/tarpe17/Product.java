package ee.tthk.tarpe17;

public class Product {
	 //Instance field declarations 
	private int id; //item number 
	private String name; //the name of the product 
	private int qtyInStock ; //the number of units in stock 
	private double price; //the price of each unit 
	
	/**
	 * default constructor which initializes instance variables
	 * numeric values to 0 (zero) and String values to "" (null)
	 * 
	 */
	
	public Product () {
		/**
		 * Constructor  that allows the setting of initial values for product 
		 * @param id
		 * @param name
		 * @param qtyInStock
		 * @param price
		 */
		}
	public Product(int id, String name, int qtyInStock, double price) {
		this.id = id;
		this.name = name;
		this.qtyInStock = qtyInStock;
		this.price = price;
	}
	@Override
	public String toString() {
		return "item number \t	: " + id 
				+ "\nName \t\t\t: " + name 
				+ "\nQuantity in stock \t: " + qtyInStock
				+ "\nPrice	\t\t: " + price + "\n\n";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}
	/**
	 * @param qtyInStock the qtyInStock to set
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	


}

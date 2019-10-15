/**
 * 
 */
package ee.tthk.tarpe17;

/**
 * @author opilane
 *
 */
public class ProductTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product CopyPaper = new Product();
		System.out.println(CopyPaper);
		
		Product Salt = new Product();
		System.out.println(Salt);
		
		
		Product Sugar = new Product(1, "maxima sugar",6000, 0.99);
		System.out.println(Sugar);
		
		Product Keyboard = new Product(2,"HP keyboard", 800,10.99);
		System.out.println(Keyboard);
		
		Product Soda = new Product(3,"J&P soda",653,6.5);
		System.out.println(Soda);
		
		Product Soap = new Product(4, "Palmolive handsoap",1000, 3.54);
		System.out.println(Soap);
	}

}

package Prob2; //package Prob2
/**
 * set and get menu class
 */
public class Chicken {
	String name; //declare name
	int price; //declare price 
	int rate; // declare rate
	
	/**
	 * Chicken's conductor
	 * 
	 * @param name
	 * @param price
	 * @param rate
	 */
	public Chicken(String name, int price, int rate){
		this.name=name;
		this.price=price;
		this.rate=rate;
	}
	
	/**
	 * set name method
	 * @param name
	 */
	public void setname(String name) {
		this.name=name;
	}
	/**
	 * set price method
	 * @param name
	 */
	public void setprice(int name) {
		this.price=price;
	}
	/**
	 * set rate method
	 * @param rate
	 */
	public void setrate(int rate) {
		this.rate=rate;
	}
	/**
	 * return this.name method
	 * @return this.name
	 */
	public String getname() {
		return this.name;
	}
	/**
	 * return this.price method
	 * @return this.price
	 */
	public int getprice() {
		return this.price;
	}
	/**
	 * return this.rate method
	 * @return this.rate
	 */
	public int getrate() {
		return this.rate;
	}
}

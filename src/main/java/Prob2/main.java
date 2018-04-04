package Prob2;
/**
 * main class, set and print menu
 */
public class main {

/**
 * main fuction, set and print menu
 */
	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Fired_chicken",9000,5); // make object menu1 of Chicken
		Chicken menu2 = new Chicken("Smoke_chicken",12000,5); // make object menu2 of Chicken
		Chicken menu3 = new Chicken("Curry_chicken",11000,4); // make object menu3 of Chicken
		
		System.out.println(menu1.getname()+"'s rating is "+menu1.rate); //print menu1's name and rating
		System.out.println(menu2.getname()+"'s rating is "+menu2.rate); //print menu2's name and rating
		System.out.println(menu3.getname()+"'s rating is "+menu3.rate); //print menu3's name and rating
	}

}


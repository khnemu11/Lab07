package Prob1; // package Prob1
import java.util.Scanner; //java.util.Scanner
/**
 * main class, input year and output century
 */
public class Main {
/**
 * 
 * main fuction, input year and output century
 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in); //make object scanf of Scanner
		YearToCentury ytc = new YearToCentury(); // make object ytc of YearToCentury
		
		System.out.println("Input year:"); // print Input year:
		ytc.input=scanf.nextInt(); // save input number to ytc.input
		
		System.out.println(ytc.input+" is "+ytc.calculcentury()+"th century"); //print century
	}

}

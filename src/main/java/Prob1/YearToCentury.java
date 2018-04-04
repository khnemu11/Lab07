package Prob1; // package Prob1
/**
 * Calculate year to century class
 */
public class YearToCentury {
	int century,input; // declare century and input
	
	/**
	 * calculate year to century function, return century
	 */
	public int calculcentury() {
		century=input/100; //century=input/100

		if(input % 100 != 0)	century++;  //if input is end to '00', plus 1 century
		return century; //return century
	}
}

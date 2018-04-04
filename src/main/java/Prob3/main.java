package Prob3; //package Prob3
import java.util.Random; //import random

/**
 * main class of Prob3
 * @author khnem
 *
 */
public class main {
	/**
	 * set student's information and distinguish between fail or not 
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random(); // make object random of Random
		Student student1 = new Student(); // make object student1 of Student
		Student student2 = new Student(); // make object student2 of Student
		Student student3 = new Student(); // make object student3 of Student
		Student student4 = new Student(); // make object student4 of Student
		
		student1.set("Jess",4,21400999,random.nextInt(10)); //set student1
		student2.set("Kent",2,21700111,random.nextInt(10)); //set student2
		student3.set("Lucas",1,21833222,random.nextInt(10)); //set student3
		student4.set("Martha",2,21733444,random.nextInt(10)); //set student4
		
		if(student1.getfail()==1)	System.out.println("I'm sorry, <<"+student1.getname()+">> You failed this course"); //if student1.getfail==1, print who is fail
		if(student2.getfail()==1)	System.out.println("I'm sorry, <<"+student2.getname()+">> You failed this course"); //if student2.getfail==1, print who is fail
		if(student3.getfail()==1)	System.out.println("I'm sorry, <<"+student3.getname()+">> You failed this course"); //if student3.getfail==1, print who is fail
		if(student4.getfail()==1)	System.out.println("I'm sorry, <<"+student4.getname()+">> You failed this course"); //if student4.getfail==1, print who is fail
	}
}

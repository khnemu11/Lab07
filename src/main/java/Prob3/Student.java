package Prob3; //package Prob3
/**
 * 
 * student list class ,name, grade,student_number,attendance, fail
 */
public class Student {
	String name; //declare name
	int grade; //declare grade 
	int student_number; //declare student_number
	int attendance; //declare attendance
	int fail;        //fail
	
	/**
	 * conductor
	 */
	public Student() {
		this.name=null; //initialize name to null
		this.grade=0; //initialize name to 0
		this.student_number=0; //initialize name to 0
		this.attendance=0; //initialize name to 0
		this.fail=0; //initialize name to 0
	}
	
	/**
	 * setting student's information
	 * 
	 * @param name
	 * @param grade
	 * @param student_number
	 * @param random
	 */
	public void set(String name, int grade,int student_number,int random) {
		this.name=name; //save name value in this.name
		this.grade=grade; ////save grade value in this.grade
		this.student_number=student_number; ////save student_number value in this.student_number
		this.attendance=random; ////save attendance value in this.attendance
		
		if(this.attendance>6)	this.fail=1; // if this.attendance > 6 , save 1 in this.fail
		else this.fail=0; // else, save 0 in this.fail
	}
	
	/**
	 * get name value method
	 * @return this.name
	 */
	public String getname() {
		return this.name;	//return this.name
	}
	
	/**
	 * get fail value method
	 * @return
	 */
	public int getfail() {
		return this.fail; //return this.fail
	}
	
}

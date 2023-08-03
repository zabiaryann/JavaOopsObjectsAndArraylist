package mainPackage;

public class Student extends Person {
	   
	
	//
	int gradYear;
	boolean enrolled = true;
	
	public Student(String name, int age, String address,int gradYear, boolean enrolled){
		super(name, age, address);
		this.gradYear = gradYear;
		this.enrolled = false;
		
	}

}

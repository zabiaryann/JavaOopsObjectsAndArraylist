package mainPackage;

public class Person {
	// Attributes or variables
	String name;
	int age;
	String address;
	
	// Constructor
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//method
	public void displayInfo(String name) {
		System.out.println("Hello "+name);
	}
	//method
	public int birthDay() {
		return (age + 1);
	}
	//method
	public int birthYear(int currentYear) {
		
		int birthYear = currentYear - age;
		return birthYear;
	
	}
}

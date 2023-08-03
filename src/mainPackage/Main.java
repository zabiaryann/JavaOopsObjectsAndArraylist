package mainPackage;
import java.util.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// SECTION 1:
		//Student s1 = new Student("Zabi",29,"california",2023,true);
		/*System.out.println("Name:"+s1.name+"\nAge:"+s1.age+
				"\nAddress:"+s1.address+"\nGrad Year:"+s1.gradYear
				+"\nIs enrolled?:"+s1.enrolled);*/
		ArrayList<Person> pList = new ArrayList<Person>();
		Person person0 = new Person("Zabi", 32, "Sacramento");
		Person person1 = new Person("Zabi", 32, "Sacramento");
		pList.add(person0);
		pList.add(person1);
		
		for(Person p : pList) {
			System.out.println("---------------------------");
			System.out.println("Name:"+p.name+"\nAge:"+p.age
					+"\nAdress:"+p.address);
		}
		// SECTION 2: Lets use ArrayList to print all at once;
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		
		Student s1 = new Student("Zabi",29,"california",2023,true);
		Student s2 = new Student("Ryan",28,"Sac State",1997,true);
		Student s3 = new Student("Aman",27,"Los Angles",2019,false);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		
		for(Student s : studentList) {
			System.out.println("------------------------------");
			System.out.println("Name:"+s.name+"\nAge:"+s.age+"\nAddress:"+s.address
					+"\nGrad Year:"+s.gradYear+"\nEnrollment status:"+s.enrolled);
			
		}

	}
}

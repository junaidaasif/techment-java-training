package TechmentTrainingDay8.collections;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;
 

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.age==o.age){
			return 0;
		}
		else if(this.age>o.age) {
			return 1;
		}
		else return -1;
		
	}
	
	
}

public class UserDefinedExamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee e = new Employee(1, "ramesh", "hr", 34);

		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "ramesh", "hr", 34));
		employee.add(new Employee(2, "sachin", "Manager", 45));
		employee.add(new Employee(3, "sunil", "hr", 26));
		employee.add(new Employee(4, "Manoj", "Developer", 30));
		
		for(Employee emp : employee) {
			System.out.println(emp.id+" "+emp.name+ " " + emp.dept+ " "+ emp.age);
		}
		System.out.println("after sorting");
		Collections.sort(employee);
		
		for(Employee emp : employee) {
			System.out.println(emp.id+" "+emp.name+ " " + emp.dept+ " "+ emp.age);
		}

	}

}

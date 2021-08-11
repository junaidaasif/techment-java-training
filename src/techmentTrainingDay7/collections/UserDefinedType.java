package techmentTrainingDay7.collections;

import java.util.ArrayList;
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee (1, "Junaid", "hr");
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		
		for(Employee emp : employees) {
			System.out.println(emp.id+ " "+ emp.name + " " + emp.dept);
		}
	}

}

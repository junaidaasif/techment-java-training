package techmentTrainingDay11.utility;

import java.util.HashMap;
import java.util.Map;

import techmentTrainingDay11.modal.Employee;

public class CollectionUtil {
	
	static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	static {
		employees.put(1, new Employee(1, "john", "hr", 32000));
		employees.put(2, new Employee(2, "johnny", "hr", 32000));
		employees.put(3, new Employee(3, "manish", "manager", 35000));
		employees.put(4, new Employee(4, "amit", "hr", 12000));
	}
	
	public static Map<Integer, Employee> getEmployeeList(){
		return employees;
	}
	
	
	public static void main(String[] args) {
		System.out.println(employees);
	}
}

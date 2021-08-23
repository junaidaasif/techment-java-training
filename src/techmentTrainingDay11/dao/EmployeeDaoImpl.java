package techmentTrainingDay11.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import techmentTrainingDay11.modal.Employee;
import techmentTrainingDay11.utility.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	
	
	
	CollectionUtil collectionUtil = new CollectionUtil();
	
	
	
	
	
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> empMap = collectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
		return employee;
	}
	
	
	


	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		
		//List is declard to store all the employee based on dept
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Map<Integer, Employee> empMap = collectionUtil.getEmployeeList();
		
		for(Employee employee : empMap.values()) {
			if(employee.getDept().equalsIgnoreCase(dept)) {
				employeeList.add(employee);
			}
		}
		return null; 
	}

}

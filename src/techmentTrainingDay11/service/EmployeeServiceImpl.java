package techmentTrainingDay11.service;
import java.util.List;

import techmentTrainingDay11.dao.EmployeeDaoImpl;
import techmentTrainingDay11.dao.IEmployeeDao;
import techmentTrainingDay11.modal.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	IEmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByDept(dept);
	}
	
}

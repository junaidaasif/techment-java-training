package techmentTrainingDay11.service;

import java.util.List;

import techmentTrainingDay11.modal.Employee;

public interface IEmployeeService {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
}

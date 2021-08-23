package techmentTrainingDay11.dao;

import java.util.List;

import techmentTrainingDay11.modal.Employee;

public interface IEmployeeDao {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
}

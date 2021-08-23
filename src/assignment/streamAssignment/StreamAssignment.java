package assignment.streamAssignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;

class Department
{
	int departmentId;
	String departmentName;
	int managerId;
	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * @param departmentId
	 * @param departmentName
	 * @param managerId
	 */
	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	
	
}

class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
//	private LocalDate hireDate;
	private String designation;
	private Double salary;
	private int managerId;
	Department department;
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			 String designation, Double salary, int managerId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
//		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
//		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
//	public LocalDate getHireDate() {
//		return hireDate;
//	}
//	public void setHireDate(LocalDate hireDate) {
//		this.hireDate = hireDate;
//	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getManager() {
		return managerId
				;
	}
	public void setManager(int managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
//				+ email + ", phoneNumber=" + phoneNumber  + ", designation=" + designation
//				+ ", salary=" + salary + ", manager=" + manager + ", department=" + department + "]";
//	}
//	
	
	
	
	
}


public class StreamAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
	
		
		employees.add(new Employee(1, "Junaid", "Sheikh", "junaidaasif@gmail.com", "7865156", "HR", 1.0, 11));
		employees.add(new Employee(2, "aashu", "Sheikh", "aasif@gmail.com", "746556", "Software developer", 1.0, 12));
		employees.add(new Employee(3, "ankit", "sahu", "ankitsahu@gmail.com", "165156", "HR", 1.0, 13));
		employees.add(new Employee(4, "asmit", "singh", "asmit@gmail.com", "74646", "Tester", 1.0, 14));
		employees.add(new Employee(5, "manish", "shah", "manish@gmail.com", "74654", "HR", 1.0, 15));
		
//		System.out.println("list of employees :"+employees);
		
		ArrayList<Department> department = new ArrayList<Department>();
		department.add(new Department(1,"Hr Department",20));
		department.add(new Department(2,"Front end",25));
		department.add(new Department(3,"Back end",30));
		department.add(new Department(4,"consultancy",35));
		
		StreamAssignment assignment = new StreamAssignment();
		
		
		System.out.println("=========================");
			double sumSalary = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		System.out.println("The sum of the salary is :" + sumSalary);
			
		System.out.println("===================");
		
		System.out.println();
		
		System.out.println(assignment.noOfEmp(employees));
		System.out.println(assignment.deptName(department));

		
	}
	
	ArrayList<Department> deptName(ArrayList<Department> department)
	{
	 department.stream().map(Department::getDepartmentName).distinct().forEach(System.out::println);
	 return department;
	}
	
	Map<String, Long> noOfEmp(ArrayList<Employee> employees)
	{
		Map<String, Long> noemp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		return noemp;
	}
}

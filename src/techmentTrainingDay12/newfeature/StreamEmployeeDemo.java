package techmentTrainingDay12.newfeature;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Shikha","Developer",23000,24));
		employees.add(new Employee(2,"Ashish","Manager",42000,26));
		employees.add(new Employee(3,"Anup","Sales Executive",34000,25));
		employees.add(new Employee(4,"Raina","Developer",28000,29));
		employees.add(new Employee(5,"Shubham","HR",30000,24));

		employees.stream().forEach(s->System.out.println(s));
		System.out.println("------------------------------------------------------------");
		//to count no of employee
		Long empCount=employees.stream().count();
		System.out.println("Total number of employee are: "+empCount);

		System.out.println("-------------------------------------------------------------");

		Long devpCount= employees.stream().filter(e->e.getDept().equals("Developer")).count();
		System.out.println("Developer Count : "+devpCount);
		System.out.println("-------------------------------------------------------------");

		employees.stream().filter(e->e.getDept().equals("Developer")).forEach(e->System.out.println("Name:" +e));
        
		System.out.println("---------------------------------------------------------------------");
		List<Employee>emp= employees.stream().filter(e->e.getDept().equals("Developer")).collect(Collectors.toList());
		
		System.out.println(emp);
		System.out.println("---------------------------------------------------------------------");
		
		Long noOfEmployees= employees.stream().collect(Collectors.counting());
		System.out.println("Number of Employees are: "+noOfEmployees);
		System.out.println("-----------------------------------------------------------------");
		
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
		List<Employee>empDepts=obj.filterDept(employees, "Developer");
		System.out.println(empDepts);
		
		System.out.println("---------------------------------------------------------------------");
		Long totalSalary= employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		
		System.out.println("Total Salary of Employee: "+totalSalary);
		System.out.println("----------------------------------------------------------------------");
		
		int maxSalary = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		System.out.println("Max salary: "+maxSalary);
	}

	List filterDept(ArrayList<Employee>empList,String dept)
	{
		List emp= empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return emp;
	}

}

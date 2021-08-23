package techmentTrainingDay13.newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Shikha","Developer",23000,24));
		employees.add(new Employee(2,"Ashish","Manager",42000,26));
		employees.add(new Employee(3,"Anup","Sales Executive",34000,25));
		employees.add(new Employee(4,"Raina","Developer",28000,29));
		employees.add(new Employee(5,"Shubham","HR",30000,24));
		
		employees.stream().map(e->"Name : "+e.getName()+" Salary :"+e.getSalary()+" Salary increased by 20% = "+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
		List<Employee>li=employees.stream().collect(Collectors.toList());
				
		StreamDemo4 streamdemo4= new StreamDemo4();
		Long hrsummary=streamdemo4.deptWiseSumSalary(employees,"Developer");
		System.out.println("Total HR Sum Salary: "+hrsummary);
				
	}
	Long deptWiseSumSalary(ArrayList<Employee>employees, String dept)
	{
		Long sumSalary = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		return sumSalary;
	}

}

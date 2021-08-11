package TechmentTrainingDay8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Student{
	int id;
	String name;
	 int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
		
}

class AgeSorting implements Comparator<Student>{
	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		return -1;
	}
}

class NameSorting implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}


public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1, "mahesh", 23));
		stuList.add(new Student(2, "ankit", 43));
		stuList.add(new Student(3, "rohit", 13));
		stuList.add(new Student(4, "junaid", 25));
		
		for(Student emp : stuList) {
			System.out.println(emp.id+" "+emp.name+ " "+ emp.age);
		}
		System.out.println("============after sorting==============");
		Collections.sort(stuList, new AgeSorting());
		
		for(Student emp : stuList) {
			System.out.println(emp.id+" "+emp.name+ " " +  " "+ emp.age);
		}
		System.out.println("===============after name sorting=================");
		Collections.sort(stuList, new NameSorting());
		
		for(Student emp : stuList) {
			System.out.println(emp.id+" "+emp.name+ " " +  " "+ emp.age);
		}
 	}

}

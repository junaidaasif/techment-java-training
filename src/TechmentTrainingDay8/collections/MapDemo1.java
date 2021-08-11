package TechmentTrainingDay8.collections;

import java.util.HashMap;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1, "Junaid", 18);
		Student student2 = new Student(1, "Junaid", 18);
	
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student(1, "Junaid", 18), "cse");
		hm.put(new Student(1, "Junaid", 18), "cse");
		
//		for(Entry<Student, String> stu : hm.entrySet()) {
//			System.out.println(stu);
//		}
//	
	
	
	}

}

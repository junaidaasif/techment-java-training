package techmentTrainingDay9.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee{
	int id;
	transient String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
     Employee emp1=new Employee(1,"Shikha");
     System.out.println("Serialisation");
     FileOutputStream fos= new FileOutputStream ("hello.ser");
     ObjectOutputStream oos= new ObjectOutputStream(fos);
     oos.writeObject(emp1);
     System.out.println("Serailisation Complete");
	}

}

//Note :If we don't want to serialize any variable use keyword called transient then it will give default value like null,90

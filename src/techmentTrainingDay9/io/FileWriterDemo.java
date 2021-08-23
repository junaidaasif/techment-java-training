package techmentTrainingDay9.io;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("abc.txt", true);
		
		fw.write("Hello \n");
		fw.write("92");
		fw.write("2");
		System.out.println("written successfully.....");
		fw.close();
	}

}

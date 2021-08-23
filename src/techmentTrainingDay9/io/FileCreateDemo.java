package techmentTrainingDay9.io;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("abc.txt");
		System.out.println(file.exists());
		file.createNewFile();
		file.mkdir();
		System.out.println(file.exists());
	}

}

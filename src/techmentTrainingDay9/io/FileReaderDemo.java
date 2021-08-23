package techmentTrainingDay9.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("abc.txt");
		System.out.print((char)fr.read());
			
		int ch = fr.read();
		System.out.print(ch);
		while(ch!=-1) {
			System.out.print(ch);
			ch = fr.read();
		}
	}

}

package techmentTrainingDay9.io;


import java.io.*;
class PrintWriterDemo {
	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("cricket.txt");
		PrintWriter out=new PrintWriter(fw);
		out.write(100);out.println(100);
		out.println(true);
		out.println('c');
		out.println("bhaskar");
		out.flush();
		out.close();
		
	}
}
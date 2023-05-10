package fileHandling;
import java.io.*;
public class fileWrite {
       
	public static void main(String[] args) {
		//Write to file
		System.out.println("Write to file : ");
		try {
			FileWriter f = new FileWriter("C:\\Users\\hp\\Desktop\\example.txt");
			try {
				f.write("Welcome to the world of Java.....");
			}
			finally
			{
				f.close();
			}
			System.out.println("Successfully wrote data in the file!!");
		}
		catch(IOException i)
		{
			System.out.println(i);
			i.printStackTrace();
		}
		
		//Read from file
		System.out.println("Read from file :  ");
		try {
		FileReader r = new FileReader("C:\\Users\\hp\\Desktop\\example.txt");
		try {
			int a;
			while((a=r.read())!=-1)
			{
				System.out.print((char)a);
			}
		}
		finally {
			r.close();
			
		}
		System.out.println("\nSuccessfully read from the file!!");
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled!!");
	    }
		
		//Append to file
				System.out.println("Append to file :  ");
				try {
					FileWriter c = new FileWriter("C:\\Users\\hp\\Desktop\\example.txt", true);
					try {
						c.write("\nJava is a High-level programming language\n");
					}
					finally {
						c.close();
					}
					System.out.println("Successfully appended in the file !!");
				}
				catch(IOException i)
				{
					System.out.println("An error occured while appended to the file");
				}
}
}
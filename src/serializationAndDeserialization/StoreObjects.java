package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreObjects {

	public static void main(String[] args) throws IOException {
		var fout =new FileOutputStream("D:\\outstream\\Student.txt");
		var oos=new ObjectOutputStream(fout);
		var scanner =new Scanner(System.in);
		
		try(oos;fout;scanner) {
			
			System.out.println("How many objects you want to write:");
			int noOfObj=scanner.nextInt();
			for(int i=1;i<=noOfObj;i++)
			{
				Student student=Student.getStudentObject();
				oos.writeObject(student);
			
			}
			System.out.println("Object Data stored Successfull!!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

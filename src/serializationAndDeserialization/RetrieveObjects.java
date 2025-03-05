package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fin=new FileInputStream("D:\\outstream\\Student.txt");
		var ois=new ObjectInputStream(fin);
		
		try(ois;fin) {
			
			Student st=null;
			while((st=(Student) ois.readObject())!=null)
			{
				System.out.println(st);
			}
			
		} catch (java.io.EOFException e) {
			
			System.err.println("End of file is reached!!!!!");
		}

	}

}

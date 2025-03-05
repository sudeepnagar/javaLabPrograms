package serializationAndDeserialization;

import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {
     
			private Integer studentId;
             private String studentName;
             private Double studentFees;
             private Date dateOfAdmission;
			
             public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
				super();
				this.studentId = studentId;
				this.studentName = studentName;
				this.studentFees = studentFees;
				this.dateOfAdmission = dateOfAdmission;
			}
             
             public static Student getStudentObject() {
            	Scanner s=new Scanner(System.in);
            	System.out.println("Enter Student Id:");
            	int sid=s.nextInt();
            	System.out.println("Enter Student Name:");
            	String sname=s.nextLine();
            	sname=s.nextLine();
            	System.out.println("Enter Student fees:");
            	double sfees=s.nextDouble();
            	Date d=new Date(2024,02,20);
         
            	 return new Student(sid,sname,sfees,d);
             }
             
             @Override
         	public String toString() {
         		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
         				+ ", dateOfAdmission=" + dateOfAdmission + "]";
         	}

             
             
}

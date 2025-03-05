package D_23_OCT;

public class Student_BLC {
               private int studentId;
               private String studentName;
               private int marks;
               private char grade;
                
  

				public void calculateGrade() {
                	if(marks>=90) {
                		grade='A';
                	}
                	else if(marks>=81&&marks<90) {
                		grade='B';
                	}
                	else if(marks>=71&&marks<80) {
                		grade='C';
                	}
                	else if(marks>=61&&marks<70) {
                		grade='D';
                	}
                	else {
                		grade='E';
                	}
                		
                }
              
                public void setStudentData(int studentId,String studentName,int marks) {
                	this.studentId=studentId;
                	this.studentName=studentName;
                	this.marks=marks;
                
                }
                public void displayDetails() {
                	System.out.println("Student Name: "+studentName);
                	System.out.println("Student id: "+studentId);
                	System.out.println("Stdent marks: "+marks);
                	System.out.println("Student grade: "+grade);
                }
}

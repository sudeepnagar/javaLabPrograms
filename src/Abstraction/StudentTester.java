package Abstraction;

public class StudentTester {

	public static void main(String[] args) {
		
		System.out.println("Science Students Percentage:");
          ScienceStudent sc=new ScienceStudent("soumy","12th",90,95,97);
          sc.getStudentDetails();
          System.out.println("Percetage:"+sc.getPercentage());
          
          System.out.println("===========================");
          
         System.out.println("History student Percentage:");
         HistoryStudent h=new HistoryStudent("suraj","12th",65,85);
         h.getStudentDetails();
         System.out.println("Percetage:"+ h.getPercentage());
         
         System.out.println("===========================");
         System.out.println("total no of students:"+Student.getTotalNoStudents());
          
	}

}

package Abstraction;

abstract class Student {
        protected String studentName;
        protected String studentClass;
        protected static int totalNoOfStudents;
        
        public abstract int getPercentage();
        
        public static int getTotalNoStudents() {
        	return totalNoOfStudents;
        }

		public Student(String studentName, String studentClass) {
			super();
			this.studentName = studentName;
			this.studentClass = studentClass;
			Student.totalNoOfStudents+=1;
		}
		
		public void getStudentDetails() {
			System.out.println("Name:"+studentName);
			System.out.println("Class:"+studentClass);
			
		}
        
        
}

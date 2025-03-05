package com.nit.multithreading_09JAN;



class Course {
	int courseId;
	String courseName;
	double courseFee;

	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}

}

class Offer {
	String offerText;

	public Offer(String offerText) {
		super();
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}

}

class EducationInstitute{
	Course[] courses;
	Offer[] offers;
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
     
	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}
    
	public void enrollStudentInCourse(int courseId, String studentName) {
		System.out.println("Student name:"+ studentName+" is enrolled");
		System.out.println("Course Id:"+ courseId);
		for(Course c:courses) {
			if(c.getCourseId()==courseId) {
				System.out.println("couses name:"+c.getCourseName());
			}
		}
		
	}
	
}

class Student{
	 String name;
	 EducationInstitute institute;

	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public  void viewCoursesAndFees() {
		for(Course c:institute.getCourses()) {
			System.out.println("Course:"+c.getCourseName());
			System.out.println("Fee:"+c.getCourseFee());
		}
	}
	
    public  void viewOffers() {
    	System.out.println("Offers Available!");
		for(Offer o:institute.getOffers()) {
			System.out.println(o.getOfferText());
		}
	}
    public  void enrollInCourse(int courseId) {
		 institute.enrollStudentInCourse(courseId, this.name);
	}
	
}

public class CourseEnrollment {

	public static void main(String[] args) throws InterruptedException {
		Course[] c= {new Course(1,"Java",5000),new Course(2,"SpringBoot",2000),new Course(3,"HTML",3000)};
		Offer[] o= {new Offer("On java 10% off"),new Offer("on HTML 50% off")};
		EducationInstitute nit=new EducationInstitute(c,o);
		
		Student s=new Student("Virat",nit);
		Student s1=new Student("Dhoni",nit);
		Thread t=new Thread() {
			@Override
			public void run() {
				s.viewCoursesAndFees();
				s.viewOffers();
				s.enrollInCourse(1);
				System.out.println("==================================");
				
			}
		};
		Thread t1=new Thread() {
			@Override
			public void run() {
				s1.viewCoursesAndFees();
				s1.viewOffers();
				s1.enrollInCourse(2);
				System.out.println("==================================");
				
			}
		};
		
	   t.start();
	   t.join();
	   t1.start();
		
		
	}

}

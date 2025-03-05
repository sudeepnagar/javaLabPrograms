package inheritance;

public class Student {
	int studentId;
	String name;
	long mobile;
	public Student() {
		
	}
	public Student(int studentId, String name, long mobile) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}

	public void display() {
		System.out.println("name=" + name);
		System.out.println("stid=" + studentId);
		System.out.println("mobile=" + mobile);
	}

}

class JobGuaranteeStudent extends Student {
	boolean placementGuarantee;

	public JobGuaranteeStudent(int studentId, String name, long mobile, boolean placementGuarantee) {
		super(studentId, name, mobile);
		this.placementGuarantee = placementGuarantee;
	}

	public void displayStudentInfo() {
		System.out.println("name=" + name);
		System.out.println("stid=" + studentId);
		System.out.println("mobile=" + mobile);
		System.out.println("placemGuarantee=" + placementGuarantee);
	}
}

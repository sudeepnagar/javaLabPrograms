package D_04_DEC;

class HospitalStaff{
	
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	public void work() {
		System.out.println("name:"+name);
		//System.out.println("age:"+age);
		System.out.println(role+"is working message");
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getRole() {
		return role;
	}

	
	
}

class Doctor extends HospitalStaff{
      private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
      
	public void work() {
		
		System.out.println(getName()+" with specialization in "+this.specialization);
	
	}
	
	
}

class Nurse extends HospitalStaff{
	private int yearsOfExperience;

	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}
	
	
	public void work() {
	   System.out.println("Role"+" "+getRole()+" Name "+" "+getName()+" with "+" "+this.yearsOfExperience+" years of experience is taking care of patients");
	}
	
	
}

public class HospitalManagementSystem {

	public static void main(String[] args) {
             Doctor d=new Doctor("vivek",25,"nurologist","brain");
             d.work();
             Nurse n=new Nurse("vivek",25,"nurologist",5);
             n.work();
	}

}

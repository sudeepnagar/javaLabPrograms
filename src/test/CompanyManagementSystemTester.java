package test;


class Employee {
     String name;
    int id;

    public Employee(String name, int id){
                       this.name=name;
                       this.id=id;
    }

    public void displayInfo(){
        System.out.println("Name="+ this.name);
        System.out.println("id="+ this.id);
    }
   
}
class Manager extends Employee{
   
	String department;
     
     public Manager(String name, int id ,String department){
        super(name,id);
        this.department=department;
     }

     
     @Override
 	public void displayInfo() {
 		// TODO Auto-generated method stub
 		super.displayInfo();
 		System.out.println("department="+ department);
 	}

    
}

class SeniorManage extends Manager{
  
	int numTeams;


    public SeniorManage(String name, int id ,String department,int numTeams){
        super(name,id,department);
        this.numTeams=numTeams;
     }
     
     @Override
 	public void displayInfo() {
 		// TODO Auto-generated method stub
 		   super.displayInfo();
 		 System.out.println("Number of teams="+ numTeams);
 	}

     
}

public class CompanyManagementSystemTester{
    public static void main(String[] args){
        Employee e=new Employee("SUDe",111);
        e.displayInfo();
     
    
        Manager c= new Manager("kkj",111,"it");
        c.displayInfo();
        
        SeniorManage s=new SeniorManage("Sudeep",111,"it",5);
        s.displayInfo();;
    }
}

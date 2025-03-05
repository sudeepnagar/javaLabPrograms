package D_05_DEC;

public class ZooSimulation {

	public static void main(String[] args) {
           Mammal lion =new Mammal("Lion",true);
           lion.makeSound();
           lion.reproduce();
           System.out.println(lion.toString());
           lion.nurseYoung();
           System.out.println("===========================");
           
           Bird eagle=new Bird("Eagle",true);
           eagle.makeSound();
           eagle.reproduce();
           System.out.println(eagle);
           eagle.buildNest();
          
	}

}

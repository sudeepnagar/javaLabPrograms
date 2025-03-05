package Predefined_functional_interface3;

import java.util.function.Consumer;

public class Student {
     

		private int id;
        private String name;
        
        public Student(int id,String name) {
        	this.id=id;
        	this.name=name;
        }
        
        public void updateName(Consumer<String> nameUpdater)
        {
        	nameUpdater.accept(this.name);
        	
        }
        
        @Override
    	public String toString() {
    		return "Student [id=" + id + ", name=" + name + "]";
    	}

	
    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

        
}

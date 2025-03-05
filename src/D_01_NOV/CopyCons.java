package D_01_NOV;

public class CopyCons {
	int id;
	String name;
	public CopyCons(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CopyCons(CopyCons cc){
		 id=cc.id;
		 name=cc.name;
	}
	@Override
	public String toString() {
		return "CopyCons [id=" + id + ", name=" + name + "]";
	}
	
	

}

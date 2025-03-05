package Test2;

class Theater{
	protected String theaterName;
	protected boolean is3DEnabled;
	public Theater(String theaterName, boolean is3dEnabled) {
		super();
		this.theaterName = theaterName;
		this.is3DEnabled = is3dEnabled;
	}
	public Theater getTheaterDetails() {
		System.out.println("theater name:"+theaterName);
		System.out.println("3D enabled or not:"+(is3DEnabled ?"Yes": "No"));
		return this;
	}
}

class IMAXTheater extends Theater{
	
	
	public IMAXTheater(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
		
	}

	@Override 
	public IMAXTheater getTheaterDetails() {
//		System.out.println("theater name:"+theaterName);
//		System.out.println("3D enabled or not:"+is3DEnabled);
		super.getTheaterDetails();
		 System.out.println("Unique Features: IMAX screen, advanced sound system, premium seating.");
		return this;
	}
}


class PremiumTheater extends Theater{

	public PremiumTheater(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
	}
	@Override
	public PremiumTheater getTheaterDetails() {
		super.getTheaterDetails();
		 System.out.println("Unique Features: Recliner seats, gourmet snacks, luxury ambiance.");		return this;
	}
}
class RegularTickects extends Theater{

	
	public RegularTickects(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
		// TODO Auto-generated constructor stub
	}
     @Override
	public RegularTickects getTheaterDetails() {
		super.getTheaterDetails();
		System.out.println("Unique Features: Standard seating, affordable ticket prices.");
		return this;
	}
}

public class MovieExperienceSimulator {

	public static void main(String[] args) {
		
         Theater t=new Theater("General theater",false);
         System.out.println("General theater details:");
         t.getTheaterDetails();
         
         System.out.println("================================");
         
         IMAXTheater i=new IMAXTheater("IMAX Theater",true);
         System.out.println("IMAX theater details:");
         i.getTheaterDetails();
         System.out.println("===============================");
         
         PremiumTheater p=new PremiumTheater("Premium Theater",true);
         System.out.println("Premium theater details:");
         p.getTheaterDetails();
         
         System.out.println("===============================");
         
         RegularTickects r=new RegularTickects("rajaBhoj",true);
         System.out.println("Regular Theater details:");
         r.getTheaterDetails();
	}

}
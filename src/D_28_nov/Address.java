package D_28_nov;

class Address {
  
	private String cityName;
     private String districtName;
     private String stateName;
     
     public Address(String c, String d, String s) {
    	 this.cityName=c;
    	 this.districtName=d;
    	 this.stateName=s;
     }
     
     @Override
 	public String toString() {
 		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", stateName=" + stateName + "]";
 	}     
}

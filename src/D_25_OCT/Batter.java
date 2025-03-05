package D_25_OCT;

public class Batter {
       private String name;
       private int runs;
       private int matches;
       private float batting_avg;
       
       public void batterDetails(String name,int runs,int matches) {
    	   this.name=name;
    	   this.runs=runs;
    	   this.matches=matches;
       }
       
       public void computeBattingAverage() {
    	   if(runs<0||matches<0) {
    		   System.err.println("error");
    	   }
    	   else if(runs>0&&matches<=0) {
    		   System.err.println("error");
    	   }
    	   else {
    		   System.out.println("Name:"+name);
    		   batting_avg=(float)runs/matches;
    		   System.out.println("batting avg:"+batting_avg);
    	   }
       }
       
       public void getStatistics() {
    	   if(runs<0||matches<0) {
    		   System.err.println("error");
    	   }
    	   else if(runs>0&&matches<=0) {
    		   System.err.println("error");
    	   }
    	   else {
    		   System.out.println("Name:"+name);
    		   System.out.println("Runs:"+runs);
    		   System.out.println("Matches:"+matches);
    	   }
       }
}

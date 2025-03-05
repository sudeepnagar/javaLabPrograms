package D_25_OCT;

public class Bowler {
          private String name;
          private int wickets;
          private int matches;
          private int balls_bowled;
          private int runs_conceded;
          
          public void bowlerDetails(String name,int wickets,int matches,int balls_bowled,int runs_conceded) {
        	  this.name=name;
        	  this.wickets=wickets;
        	  this.matches=matches;
        	  this.balls_bowled=balls_bowled;
        	  this.runs_conceded=runs_conceded;
          }
          
          public void computeBowlingAverage() {
        	  if(runs_conceded<0||balls_bowled<0||matches<=0||wickets<0) {
        		  System.err.println("Error");
        	  }
        	  else {
        	  System.out.println("Name: "+name);
        	  System.out.println("bowling avg:"+((double)runs_conceded/wickets));
        	  }
        	  
          }
          
          public void computeStrikeRate() {
        	  if(runs_conceded<0||balls_bowled<0||matches<=0||wickets<0) {
        		  System.err.println("Error");
        	  }
        	  else {
        	  System.out.println("Name: "+name);
        	  System.out.println("Strike_rate:"+((double)runs_conceded/balls_bowled));
        	  }
          }
          
          public void showStatistics() {
        	  if(runs_conceded<0||balls_bowled<0||matches<=0||wickets<0) {
        		  System.err.println("Error");
        	  }
        	  else {
        	  System.out.println("Name: "+name);
        	  System.out.println("Wickets: "+wickets);
        	  System.out.println("Matches:"+matches);
        	  System.out.println("Balls_boweled: "+balls_bowled);
        	  System.out.println("Runs conceded: "+runs_conceded);
        	  }
          }
         
}

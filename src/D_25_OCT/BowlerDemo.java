package D_25_OCT;

public class BowlerDemo {

	public static void main(String[] args) {
		Bowler b=new Bowler();
		b.bowlerDetails("Sachin", 10, 5, 750, 463);
		b.computeBowlingAverage();
		b.computeStrikeRate();
		b.showStatistics();
	}

}

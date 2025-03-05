package Abstraction;

class HistoryStudent extends Student{
	private int historyMarks;
	private int civicsMarks;
	

	@Override
	public int getPercentage() {
		  return (historyMarks+civicsMarks)/2;
	}


	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}


	
	
	

}

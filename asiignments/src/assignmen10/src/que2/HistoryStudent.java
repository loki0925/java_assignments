package que2;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	

	public HistoryStudent(String name, String adrress, int historyMarks, int civicsMarks) {
		super(name, adrress);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double perCentage = (this.historyMarks+this.civicsMarks)/2;
		return perCentage;
	}

}

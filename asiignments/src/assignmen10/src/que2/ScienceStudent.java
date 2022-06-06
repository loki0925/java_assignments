package que2;

public class ScienceStudent extends Student {

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent(String name, String adrress, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, adrress);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double perCentage = (this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/3;
		return perCentage;
	}

}

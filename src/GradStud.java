public class GradStud extends Student{
	private int gradID;
	
	public GradStud(String studName, int[] studTests, String studGrade, int gradStudID) {
		super(studName, studTests, studGrade);
		gradID = gradStudID;
	}
	
	public int getID() {
		return gradID;
	}
	
	public void computeGrade() {
		super.computeGrade();
		if (getAvg() >= 90) {
			setGrade("Pass with distinction");
		}
	}
}

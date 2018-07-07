public class UnderGrad extends Student{

	public UnderGrad(String name, int[] tests, String grade) {
		super(name, tests, grade);
	}
	
	public UnderGrad() {
		super();
	}
	
	public void computeGrade() {
		if (getAvg() >= 70) {
			setGrade("Pass");
		} else {
			setGrade("Fail");
		}
	}
}

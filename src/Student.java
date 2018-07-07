public class Student {
	public final static int NUM_TESTS = 3;
	private String name;
	private int[] tests;
	private String grade;
	
	public Student() {
		name = "";
		tests = new int[NUM_TESTS];
		grade = "";
	}
	
	public Student(String name, int[] tests, String grade) {
		this.name = name;
		this.tests = tests;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String newGrade) {
		grade = newGrade;
	}
	
	public double getAvg() {
		int sum = 0;
		
		for (int e : tests) {
			sum += e;
		}
		
		return (double)sum/tests.length;
	}
	
	public void computeGrade() {
		if (name.equals("")) {
			grade = "No grade";
		} else if (getAvg() >= 65) { 
			grade = "Pass";
		} else {
			grade = "Fail";
		}
	}
}

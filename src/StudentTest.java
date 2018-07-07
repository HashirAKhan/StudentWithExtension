import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student brian = new Student("Brian", new int[] {90, 94, 99}, "none");	
		Student tim = new UnderGrad("Tim", new int[] {70, 70, 60}, "none");	
		Student kevin = new GradStud("kevin", new int[] {95, 90, 90}, "none", 1234);	
		
		System.out.println(((GradStud)kevin).getID());
	}

}

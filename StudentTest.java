package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "모니카";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}

package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "���ī";
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}

}

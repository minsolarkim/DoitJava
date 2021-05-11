package arraylistalone;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 50);
		studentKim.addSubject("영어", 30);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

	}

}

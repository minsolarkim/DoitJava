package classpart;

public class Student {	//class = 예약어
	
	//Field
	int studentID;		//학번
	String studentName;	//학생이름		
	int grade;			//학년
	String address;		//사는 곳
	
	//메서드 추가
	public void showStudnetInfo() {
		System.out.println(studentName + ", " + address);  //이름 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	/*
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}//end of main
	*/
	
}//end of class

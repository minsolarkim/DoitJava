package classpart;

public class Student {	//class = �����
	
	//Field
	int studentID;		//�й�
	String studentName;	//�л��̸�		
	int grade;			//�г�
	String address;		//��� ��
	
	//�޼��� �߰�
	public void showStudnetInfo() {
		System.out.println(studentName + ", " + address);  //�̸� �ּ� ���
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
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}//end of main
	*/
	
}//end of class

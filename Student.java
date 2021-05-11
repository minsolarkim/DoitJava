package arraylistalone;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScore();
			System.out.println(studentID + "번 학생" +studentName+ "의 "+s.getSubjectName()+" 과목 점수는 "+s.getScore()+"입니다.");
		}
		System.out.println(studentName+"학생의 총점은 "+total+ "입니다.");
//		System.out.println("학생 "+studentName +"의 과목 "+getSubjectName() + "의 점수는 " + score + "입니다.");
	}

}

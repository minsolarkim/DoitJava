package operator;

public class OperatorEx1 {
	public static void main(String[] args) {
		
		final int subject = 3;
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 80;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / subject;
		System.out.println(avgScore);
	}

}

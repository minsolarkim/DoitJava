package ifElse;

public class IfExample2 {

	public static void main(String[] args) {
		int age;
		int charge;
		
		age = 70;
		
		if(age < 8) {
			charge = 1000;
		} else if (age <14) {
			charge = 2000;
		} else if (age < 20) {
			charge = 2500;
		} else if (age >= 60) {
			charge = 0;
		} else {
			charge = 3000;
		}
		System.out.println("요금은 " + charge + "원 입니다.");

	}

}

package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		num1 = num1 + 5;
		num1 += 5;
		System.out.println(num1);
		
		num1 *= num2;
		System.out.println(num1);
		

	}

}

package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�.");
		
		int minus = minus(num1, num2);
		if (num1 >= num2) {
			System.out.println(num1 + " - " + num2 + " = " + minus + "�Դϴ�.");

		} else {
			System.out.println(num2 + " - " + num1 + " = " + minus + "�Դϴ�.");
		}
		
		int multiplication = multiplication(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + multiplication + "�Դϴ�.");
		
		double division = division(num1, num2);
		if (num1 == 0 || num1 == 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0�� �ƴ� �ٸ� ���� �Է����ּ���.");
		} else {
			if (num1 >= num2) {
				System.out.println(num1 + " / " + num2 + " = " + division + "�Դϴ�.");

			} else {
				System.out.println(num2 + " / " + num1 + " = " + division + "�Դϴ�.");
			}
		}
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static int minus(int n1, int n2) {
		int result;
		if(n1 >= n2) {
			result = n1 - n2;
		} else {
			result = n2 - n1;
		}
		return result;
	}
	
	public static int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double division(double n1, double n2) {
		double result;
		if (n1 == 0 || n2 == 0) {
			result = 0;
		} else {
			if(n1 >= n2) {
				result = (n1 / n2);
			} else {
				result = (n2 / n1);
			}
		}
		
		return result;
	}
}

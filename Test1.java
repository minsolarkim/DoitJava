package chapter4;

public class Test1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		int result = 0;
		
		//if��
		if(operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			if(num1 >= num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if(num1 >= num2) {
				result = num1 / num2;
			} else {
				result = num2 / num1;
			}
		} else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		System.out.println("��� : " + result);
		
		//switch��
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-' :
			if(num1 >= num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num1 >= num2) {
				result = num1 / num2;
			} else {
				result = num2 / num1;
			}
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		System.out.println("��� : " + result);

 
	}

}

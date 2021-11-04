package chapter4;

public class Test1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		int result = 0;
		
		//if문
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
			System.out.println("잘못 입력했습니다.");
		}
		System.out.println("결과 : " + result);
		
		//switch문
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
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		System.out.println("결과 : " + result);

 
	}

}

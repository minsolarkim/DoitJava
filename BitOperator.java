package operator;

public class BitOperator {
	//2진수의 연산자

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2; 
		System.out.println("& : " + result); //비트 더하기
		
		result = num1 | num1; 
		System.out.println("| : " + result); //하나라도 1이면 1이 됨 (흡수)
		
		result = num1 ^ num2;
		System.out.println("^ : " + result); //같으면 1 다르면 0
		
		int num = 10;
		result = ~num;
		System.out.println("~ : " + result); // 0->1 // 1->0
		
		
		
		
		
		




	}

}

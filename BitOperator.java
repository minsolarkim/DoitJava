package operator;

public class BitOperator {
	//2������ ������

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2; 
		System.out.println("& : " + result); //��Ʈ ���ϱ�
		
		result = num1 | num1; 
		System.out.println("| : " + result); //�ϳ��� 1�̸� 1�� �� (���)
		
		result = num1 ^ num2;
		System.out.println("^ : " + result); //������ 1 �ٸ��� 0
		
		int num = 10;
		result = ~num;
		System.out.println("~ : " + result); // 0->1 // 1->0
		
		
		
		
		
		




	}

}

package operator;

public class OperatorEx5 {

	public static void main(String[] args) {

		//��Ʈ �̵� ������ (���� �� ��) why?
		int num = 5;
//		num >>> 2;
		System.out.println(num);
		
		num = 0B00000101;
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
	
		System.out.println(num);
		
		num = num << 2;
		System.err.println(num);
		

	}

}

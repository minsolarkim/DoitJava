package operator;

public class OperatorEx5 {

	public static void main(String[] args) {

		//비트 이동 연산자 (적용 안 됨) why?
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

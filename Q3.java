package array;

public class Q3 {

	public static void main(String[] args) {
		
		int[] five = new int[5];
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) {
				continue;
			}else {
				for(int j = 0; j < five.length; j++) {
					five[j] = i;
					sum += five[j];
				}
			}
		}
		System.out.println("sum : "+ sum);

		
//		int[] number = new int[] {2,4,6,8,10};
//		int total = 0;
//		
//		for(int i = 0; i < number.length; i++) {
//			total += number[i];
//		}
//		System.out.println("total : "+ total);

	}

}

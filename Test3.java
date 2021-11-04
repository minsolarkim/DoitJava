package chapter4;

public class Test3 {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10 ; j++) {
				if(i < j) {
					break;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}

	}

}

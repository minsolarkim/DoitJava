package chapter4;

public class Test2 {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단을 출력합니다.");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}

	}

}

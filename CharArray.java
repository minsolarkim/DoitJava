package array;

public class CharArray {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		
		//아스키 값을 저장 
		for(int i = 0; i<alphabets.length; i++, ch++) { //ch++가 되네?! 이거 빼먹지 말기!!
			alphabets[i] = ch; 
		}
	
		//아스키 값 출력
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]); //int로 형변환 숫자로 출력
		}
	}
	
}

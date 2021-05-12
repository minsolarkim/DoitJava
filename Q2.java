package array;

public class Q2 {

		public static void main(String[] args) {

			char[] upperAlpha = new char[26];
			char ch = 'A';
			
			for(int i = 0; i < upperAlpha.length; i++) {
				upperAlpha[i] = ch;
				ch++;
			}
			
			for(int i = 0; i < upperAlpha.length; i++) {
				System.out.println("upperAlpha Array 의 " + i + "번 째 값 : " + upperAlpha[i]);
			}
			
			
			char[] lowerAlpha = new char[26];
			char lc = 'a';
			
			for(int i = 0; i < lowerAlpha.length; i++) {
				lowerAlpha[i] = lc;
				lc++;
			}
			
			for(int i = 0; i < lowerAlpha.length; i++) {
				System.out.print (lowerAlpha[i]+" - ");
			}
			
//			char[] alphabets = new char[26];
//			char ch = 'A';
//			
//			//아스키 값을 저장 
//			for(int i = 0; i<alphabets.length; i++, ch++) { //ch++가 되네?! 이거 빼먹지 말기!!
//				alphabets[i] = ch; 
//			}
//		
//			//아스키 값 출력
//			for(int i = 0; i < alphabets.length; i++) {
//				System.out.println(alphabets[i] + ", " + (int)alphabets[i]); //int로 형변환 숫자로 출력
//			}
		}
		
	}



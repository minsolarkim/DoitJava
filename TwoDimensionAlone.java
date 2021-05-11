package array;

public class TwoDimensionAlone {

	public static void main(String[] args) {
		
//		String alphabets = "ab";
//		char[][] alphabets = {{'a','b'}, {'c','d'},{'e','f'}, {'g','h'}, {'i','j'}, {'k','l'}};
//		char ch = 'a';
//		char[] alphabets = new char[26];
//		for(int i = 0; i < alphabets.length; i++) {
//			alphabets[i] = ch++;
//		}
//
//		char[][] result = new char[2][2];
//		for(int i = 0; i < 13; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.println(result[i][j]);
//			}
//		}
		
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for(int i = 0; i<alphabets.length; i++) {
			for(int j = 0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				System.out.println(alphabets[i][j]+" ");
				ch++;
			}
			System.out.println();
		}
		
		
		
		
	}

}

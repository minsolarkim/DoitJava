package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("1루수", "양석환");
		bookArray1[1] = new Book("우익수", "김인태");
		bookArray1[2] = new Book("포수", "장승현");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나는 브랜드가 되기로 했다");
		bookArray2[0].setAuthor("김키미");
		
		System.out.println("===bookArray1===");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("===bookArray2===");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//bookArray2도 같이 변경되서 출력됨
		
		
	}

}

package array;
//깊은 복사
public class ObjectCopy3 {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("1루수", "양석환");
		bookArray1[1] = new Book("우익수", "김인태");
		bookArray1[2] = new Book("포수", "장승현");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		//디폴트 생성자로 2 배열 인스턴스 생성
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		//1 배열 요소를 새로 생성한 2 배열 인스턴스에 복사--getter setter 이용
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("좌익수");
		bookArray1[0].setAuthor("김재환");
		
		System.out.println("===bookArray1===");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		//1만 바뀜 왜냐하면 1과 2는 주소가 다르기 때문이다.
		
		System.out.println("===bookArray2===");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		//향상된 for문
		for(Book bookArray3 : bookArray2) {
			System.out.println(bookArray3);
		}
		//주소값만 나오넹 
	}

}







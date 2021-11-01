package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}

//Book인스턴스 5개가 바로 생성되는 것은 아닙니다.
//인스턴스를 생성하면 그 인스턴스를 가리키는 주소 값이 있습니다. 공간 5개를 생성하는 문장임
//그 공간은 자동으로 비어있다는 의미의 null값으로 초기화 됨


package classpart;

public class PurchaseTest {

	public static void main(String[] args) {
		
		Purchase purchase = new Purchase();
		
		purchase.purchaseNumber = "201803120001";
		purchase.ID = "abc123";
		purchase.date = "2018년 3월 12일";
		purchase.name = "홍길순";
		purchase.productNumber = "PD0345-12";
		purchase.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+purchase.purchaseNumber
				+"\n주문자 아이디 : "+purchase.ID
				+"\n주문 날짜 : "+purchase.date
				+"\n주문자 이름 : "+purchase.name
				+"\n주문 상품 번호 : "+purchase.productNumber
				+"\n배송 주소 : "+purchase.address );

	}

}

package classpart;

public class PurchaseTest {

	public static void main(String[] args) {
		
		Purchase purchase = new Purchase();
		
		purchase.purchaseNumber = "201803120001";
		purchase.ID = "abc123";
		purchase.date = "2018�� 3�� 12��";
		purchase.name = "ȫ���";
		purchase.productNumber = "PD0345-12";
		purchase.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+purchase.purchaseNumber
				+"\n�ֹ��� ���̵� : "+purchase.ID
				+"\n�ֹ� ��¥ : "+purchase.date
				+"\n�ֹ��� �̸� : "+purchase.name
				+"\n�ֹ� ��ǰ ��ȣ : "+purchase.productNumber
				+"\n��� �ּ� : "+purchase.address );

	}

}

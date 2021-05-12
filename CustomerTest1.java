package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerHong = new Customer();
		customerHong.setCustomerID(17);
		customerHong.setCustomerName("홍건희");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showCustomerInfo());

		VIPCustomer customerAhn = new VIPCustomer();
		customerAhn.setCustomerID(20);
		customerAhn.setCustomerName("안재석");
		customerAhn.bonusPoint = 10000;
		System.out.println(customerAhn.showCustomerInfo());
	}

}

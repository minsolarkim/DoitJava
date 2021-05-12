package inheritance;

public class VIPCustomer_normal {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer_normal() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer( ) 생성자 호출");

	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusPoint;
		return price - (int)(price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
	}
	
	
	
	
	
	
	
}

package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; //private 이면 오류남
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer( ) 생성자 호출");

	}

}

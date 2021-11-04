package ifElse;

public class SwitchCase {

	public static void main(String[] args) {
		
		int rank = 4;
		
		switch(rank) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
				System.out.println("참가상입니다.");
		}

	}

}

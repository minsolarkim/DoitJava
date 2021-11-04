package ifElse;

public class SwitchCase2 {

	public static void main(String[] args) {
		//Switch조건 안에 문자열도 가능
		String medal = "Silver";
		String medalColor;
		
		switch(medal) {
		
		case "Gold":
			medalColor = "금메달";
			break;
		case "Silver":
			medalColor = "은메달";
			break;
		case "Bronze":
			medalColor = "동메달";
			break;
		default:
			medalColor = "참가상";
			break;
		
		}
		System.out.println(medalColor + "입니다.");
	}

}

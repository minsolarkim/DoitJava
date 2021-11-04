package ifElse;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 6;
		String place;
		
		switch(floor) {
		case 1:
			place = "1Ãþ ¾à±¹";
			break;
		case 2:
			place = "2Ãþ Á¤Çü¿Ü°ú";
			break;
		case 3:
			place = "3Ãþ ÇÇºÎ°ú";
			break;
		case 4:
			place = "4Ãþ Ä¡°ú";
			break;
		case 5:
			place = "5Ãþ Çï½ºÅ¬·´";
			break;
		default:
			place = "Á¸ÀçÇÏÁö ¾Ê´Â Ãþ";
			break;
		}
		System.out.println(place + "ÀÔ´Ï´Ù.");

	}

}

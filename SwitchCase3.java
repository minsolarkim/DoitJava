package ifElse;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 6;
		String place;
		
		switch(floor) {
		case 1:
			place = "1�� �౹";
			break;
		case 2:
			place = "2�� �����ܰ�";
			break;
		case 3:
			place = "3�� �Ǻΰ�";
			break;
		case 4:
			place = "4�� ġ��";
			break;
		case 5:
			place = "5�� �ｺŬ��";
			break;
		default:
			place = "�������� �ʴ� ��";
			break;
		}
		System.out.println(place + "�Դϴ�.");

	}

}

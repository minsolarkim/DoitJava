package ifElse;

public class SwitchCase2 {

	public static void main(String[] args) {
		//Switch���� �ȿ� ���ڿ��� ����
		String medal = "Silver";
		String medalColor;
		
		switch(medal) {
		
		case "Gold":
			medalColor = "�ݸ޴�";
			break;
		case "Silver":
			medalColor = "���޴�";
			break;
		case "Bronze":
			medalColor = "���޴�";
			break;
		default:
			medalColor = "������";
			break;
		
		}
		System.out.println(medalColor + "�Դϴ�.");
	}

}

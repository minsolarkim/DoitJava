package classpart;

public class WomanTest {

	public static void main(String[] args) {
		Woman woman = new Woman();
		woman.age = 33;
		woman.name = "Aiki";
		woman.married = true;
		woman.children = 1;
		
		System.out.println("���� : " + woman.age);
		System.out.println("�̸� : " + woman.name);
		System.out.println("��ȥ ���� : " + woman.married);
		System.out.println("�ڳ� ��  : " + woman.children);

	}

}

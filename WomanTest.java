package classpart;

public class WomanTest {

	public static void main(String[] args) {
		Woman woman = new Woman();
		woman.age = 33;
		woman.name = "Aiki";
		woman.married = true;
		woman.children = 1;
		
		System.out.println("나이 : " + woman.age);
		System.out.println("이름 : " + woman.name);
		System.out.println("결혼 여부 : " + woman.married);
		System.out.println("자녀 수  : " + woman.children);

	}

}

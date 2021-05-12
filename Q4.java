package array;

public class Q4 {
	
	public static void main(String[] args) {
		
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("멍멍이", "치아와");
		dogArray[1] = new Dog("뽀삐", "진돗개");
		dogArray[2] = new Dog("순심이", "삽살개");
		dogArray[3] = new Dog("이슬이", "포메라니안");
		dogArray[4] = new Dog("노콩", "말티즈");
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		System.out.println("--------------------");
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
		
	}

}

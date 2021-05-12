package array;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {

		ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
		dogArrayList.add(new Dog("노콩", "말티즈"));
		dogArrayList.add(new Dog("김탁구", "보더콜리"));
		dogArrayList.add(new Dog("이슬이", "포메라이안"));
		dogArrayList.add(new Dog("뚜비", "요크셔"));
		dogArrayList.add(new Dog("꿈이", "말티즈"));
		dogArrayList.add(new Dog("김또깡", "멋쟁이"));
		
		for(int i = 0; i < dogArrayList.size(); i++) {
			System.out.println(dogArrayList.get(i).showDogInfo());
		}
		
	}

}

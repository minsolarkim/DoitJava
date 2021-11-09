package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println("date2 : " + date1.isValid());
//		date.month = 2;
//		date.day = 31;
//		date.year = 2018;
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println("date2 : " + date2.isValid());
	}

}

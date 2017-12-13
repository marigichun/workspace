public class TestDrive {

	public static void main(String[] args) {
		Student gildong =
			new Student( 200524365, "정상훈", 32, "정보컴퓨터공학부" ,4 );
		String result1 = gildong.study();
		System.out.println (result1);
	
		String result2 = gildong.introduce();
		System.out.println (result2);
	}	
}
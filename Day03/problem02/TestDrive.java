public class TestDrive {
	//프로그램의 시작점
	public static void main(String[] args){
		Person sanghoon =
			new Person(10, 177, "남", 32, "정상훈", "A");
		//배부르다.
		String result1=sanghoon.eat("빵");
		System.out.println(result1);
		
		//꿀잠잤다
		String result2=sanghoon.eat("쇼파");
		System.out.println(result2);
	
		//도로위로 걷는다.
		sanghoon.walk("도로");

		//여러분을 생각한다.
		sanghoon.thing("여러분");

		int result3=sanghoon.add (5, 7);
		System.out.println(result3);
	}
}
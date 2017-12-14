public class TestPerson {
	//객체간 비교
	public static void main(String[] args) {
	
		Person sanghoon = new Person (861201, "정상훈", 32, "상도동");
		Person gildong = new Person (900420, "홍길동", 28, "서울");

		//boolean은 true(진실) false(거짓)으로만 판명할때 사용
		boolean isEqual = sanghoon.equals( gildong);
		System .out.println(isEquals);


		boolean isEqual02 = gildong
		equals(sanghoon);	
		 System .out.println(isEquals02);
		

		if (isEquals) {

		}
	}

}
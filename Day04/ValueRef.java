public class ValueRef {

	public static void main(String[] args) {
	
		String hello01 = "Hello";
		String hello02 = "Hello";
		String hello03 = new String("Hello");

		System.out.println (hello01);
		System.out.println (hello02);
		System.out.println (hello03);

		//hello01과 hello02 변수간의 비교 (==)
		if (hello01 == hello02) {
			System.out.println("hello01과 hello02는 같다");
		}
		else {
			System.out.println("hello01과 hello02는 같지않다");
		}
		
		//hello01과 hello03 변수간의 비교 (==)
		if (hello01 == hello03) {
		System.out.println("hello01과 hello03는 같다");
		}
		else {
			System.out.println("hello01과 hello03는 같지않다");
		}
		
		//hello01과 hello03 변수간의 비교 (equals메서드)
		if (hello01.equals( hello03)) {
		System.out.println("hello01과 hello03는 같다");
		}
		else {
			System.out.println("hello01과 hello03는 같지않다");
		}
		
		
	}
}
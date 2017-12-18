public class TestCalc {

	public static void main(String[] args) {
	
		
		
		//1.객체에(Object)를 생성한다.
		Calc calcA = new Calc();
		int x = integer.parseInt(args[0]);
		int y = integer.parseInt(args[1]);
	
		int result =  calcA.add();
		System.out.println(result);
		
		int result1 =calcA.sub();
		System.out.println(result1);

		int result2 =calcA.mul();
		System.out.println(result2);

		int result3 =calcA.div();
		System.out.println(result3);

	
	}
	


}



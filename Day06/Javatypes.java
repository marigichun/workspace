public class JavaTypes {

	public static void main(String[] args) {

		// int는 정수형만 들어감
		//분류              자료형            상수
		//정수형
		//정수형	       byte               -128 ~ 127
		//정수형           short              -32,768, ~ 32,767
		//정수형           int(기본형)      10진수, 8진수,16진수(int-2,147,483,647~ 2,147,483,647)
		//정수형           long	              32000L(숫자 두에 L을 붙임) (-2^63~2^63-1)
		//실수형
		//실수형           float	              (+,-)1.4E-45 ~ 3.4028235E38(숫자 뒤에 F를 붙임)
		//실수형           double(기본형) (+,-)4.9E-324 ~ 107976931348623157E308
		//문자열           String             큰 따옴표로 표기
		//문자 	       char                작은 따옴표로 한글자만 표기
		//부울	       boolean           true, false만

		int intValue = 0;
		int num01 =10;	           //10진수 10을 표기 
		int num02 = 01750;	           //8진수 1000을 표기 //oto로 표기	
		int num03 = 0x3e8;	           //16진수 1000을 표기
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);

		//실수형
		float floatVal=3014F;
		double doubleVal = 256012;
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		
		//문자형 타입
		String stringValue = "안녕하세요.";
		String bye = "안녕히 계세요.";
		System.out.println(stringValue);
		System.out.println(bye);
		
		//문자
		char character = 'A';
		System.out.println(character);

		// 부울
		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(" " + trueVal +10);
		//	            (trueVal + 10 +" "); 은 안됨-문자열이기 때문, '' ''은 앞에 한칸 띄어짐
		//						   "" 은 앞이 붙음
		
		System.out.println(falseVal);
		boolean result = 1 == 2;     //1과 2는 틀리다.
		boolean result2 = 1 != 2;    //1과 2가 틀리다는  (!는 틀리다는 뜻)
		System.out.println(result);
		System.out.println(result2);

		//if문 (10 == 11 && "삽살개" =="삽살개" && "해피" =="누렁이") 일때
		// if문의 긴 형태를 boolean으로 할때,
		//&&(논리곱) 둘이 참이면 true 둘중에 1개만 거짓이어도 false
		//||(논리합) 하나라도 참이면 true 
		boolean isEqualNumber =10 ==11;
		boolean isEqualType ="삽살개" =="삽살개";
		boolean isEqualName ="해피" =="누렁이";
		if (isEqualNumber && isEqualType&& isEqualName) {
		
		}
		
		//형변환
		byte byteRes = (byte) 128; //int형을 강제로 byte 타입으로 변경
		byte byteRes2 = (byte) 129;//byte형의 넘어서는것은 돌아감-순환형태
		System.out.println(byteRes);
		System.out.println(byteRes2);
		
		short shortRes = (short)32768;//int --> short 형변환
		System.out.println(shortRes);

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;   // float--> int 형변환.소수점은 버림
		System.out.println(intVal01);
	
		int charNum = 'A';    //char  --> int 형변환, 'A'는  int 65로 랩핑(지정)되어있음
		System.out.println(charNum);
	}
}



class Person {
	//속성
	int headSize;     //머리크기(숫자)
	int height;       //키	     (숫자)
	String gender;   //성별     (문자)
	int age;         //나이        (숫자)
	String name;     //성별        (문자)
	String family;    //성별        (문자)
	
	//생성자(constructor) (클래스의 속성 값들을 초기화)
	public Person(int headSize, int height, String gender, int age, String name, String family){
		
		this.headSize = headSize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
	}
	
	//메서드(method)
	//무엇을 먹는다 (배부르다, 배고프다)
		String eat(String food) {
			if (food.equals("빵")) {
				return "배부르다.";
	}
		else {
			return "배고프다.";
	}
	}
	
	//어디에서 잔다 (꿈잠잤다, 피곤하다)
		String sllep(String where) {
			if (where.equals("땅바닥")) {
				return "피곤하다.";
				}
			else {
				return "꿀잠잤다.";
	}
	}		
		
	//어디위로 걷는다 
		void walk(String where) {
			System.out.println(where + "위로 걷는다.");
	}
	//무엇을 생각한다
		void thing(String how) {
			System.out.println(how + "을(를) 생각한다.");
	}
	
	// 숫자 a와 숫자 b를 더하는 메서드
		int add(int a, int b){
			return a = b;
		}
}
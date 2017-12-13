class Person {
	int headSize;      // 머리크기 (숫자)
	int height;          //키           (숫자)
	String gender;    //성별        (숫자)
	int age;              //나이        (숫자)
	String name;      //이름         (숫자)
	String family;     //가족         (숫자)
	
	//생성자(속성 값 초기화)-윗 부분 아래 부분은= 나온값	
	public Person(int headSize, int height, String gender,
		int age, String name, String family) {

		this.headSize = headSize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
	}
		
		

	//무엇을 먹는다(배부르다, 배고프다) 메서드(method)
	String eat(string food) {
		if(food.equals("빵")){
			return"배부르다."
		}
		else{
			return "배고프다."
		}
	//어디에서 잔다 (꿀잠잤다, 피곤하다)
	String sleep(String where) {
		if(where.squals("땅바닥")){
			return "피곤하다.";
		}
		else{
			return "꿀잠잤다."
		}
	}
	//어디위로 걷는다
	void walk(String where) {
		System.out.println(Where +"위로 걷는다.");
	}
	//무엇을 생각한다
	void think(String how) {
		System.out.println(how + "을(를) 생각한다.");
	}
}









}
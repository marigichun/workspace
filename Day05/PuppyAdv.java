class PuppyAdv {

	String type;	
	String name;
	int age;
	String gender;

	//생성자 (construtor)
	public PuppyAdv(String type, String name, int age, String gender) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	//연산자 우선순위
	//0. &&:논리곱, ||: 논리합
	//1. + - * /
	// 비교 메소드 만들기
	boolean equals(PuppyAdv p ) {
		
		if (this.type == p.type && this.name == p.name) {
			return true;
			
		}
		return false;// 강아지 종류가 다르고 이름도 다른 경우
	}
}
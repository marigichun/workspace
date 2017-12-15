class Puppy {

	String type;	
	String name;
	int age;
	String gender;

	//생성자 (construtor)
	public Puppy(String type, String name, int age, String gender) {
		this.type = type;
		this.name = name;
		this.age = age;
		String gender =gender;
	}

	// 비교 메소드 만들기
	boolean equals(Puppy p ) {
		if (this.type == p.type) {
			if (this.name == p.name){
				
				return true;//강아지 종류와 이름이 같은 경우
			}
			return false;//강아지 종류는 같은데 이름이 다른 경우
		}
		return false;// 강아지 종류가 다르고 이름도 다른 경우
	}
}
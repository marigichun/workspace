class PuppyAdv {

	String type;	
	String name;
	int age;
	String gender;

	//������ (construtor)
	public PuppyAdv(String type, String name, int age, String gender) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	//������ �켱����
	//0. &&:����, ||: ����
	//1. + - * /
	// �� �޼ҵ� �����
	boolean equals(PuppyAdv p ) {
		
		if (this.type == p.type && this.name == p.name) {
			return true;
			
		}
		return false;// ������ ������ �ٸ��� �̸��� �ٸ� ���
	}
}
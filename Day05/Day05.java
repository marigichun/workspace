class Puppy {

	String type;	
	String name;
	int age;
	String gender;

	//������ (construtor)
	public Puppy(String type, String name, int age, String gender) {
		this.type = type;
		this.name = name;
		this.age = age;
		String gender =gender;
	}

	// �� �޼ҵ� �����
	boolean equals(Puppy p ) {
		if (this.type == p.type) {
			if (this.name == p.name){
				
				return true;//������ ������ �̸��� ���� ���
			}
			return false;//������ ������ ������ �̸��� �ٸ� ���
		}
		return false;// ������ ������ �ٸ��� �̸��� �ٸ� ���
	}
}
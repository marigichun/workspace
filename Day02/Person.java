class Person {
	int headSize;      // �Ӹ�ũ�� (����)
	int height;          //Ű           (����)
	String gender;    //����        (����)
	int age;              //����        (����)
	String name;      //�̸�         (����)
	String family;     //����         (����)
	
	//������(�Ӽ� �� �ʱ�ȭ)-�� �κ� �Ʒ� �κ���= ���°�	
	public Person(int headSize, int height, String gender,
		int age, String name, String family) {

		this.headSize = headSize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
	}
		
		

	//������ �Դ´�(��θ���, �������) �޼���(method)
	String eat(string food) {
		if(food.equals("��")){
			return"��θ���."
		}
		else{
			return "�������."
		}
	//��𿡼� �ܴ� (�������, �ǰ��ϴ�)
	String sleep(String where) {
		if(where.squals("���ٴ�")){
			return "�ǰ��ϴ�.";
		}
		else{
			return "�������."
		}
	}
	//������� �ȴ´�
	void walk(String where) {
		System.out.println(Where +"���� �ȴ´�.");
	}
	//������ �����Ѵ�
	void think(String how) {
		System.out.println(how + "��(��) �����Ѵ�.");
	}
}









}
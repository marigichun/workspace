class Person {
	//�Ӽ�
	int headSize;     //�Ӹ�ũ��(����)
	int height;       //Ű	     (����)
	String gender;   //����     (����)
	int age;         //����        (����)
	String name;     //����        (����)
	String family;    //����        (����)
	
	//������(constructor) (Ŭ������ �Ӽ� ������ �ʱ�ȭ)
	public Person(int headSize, int height, String gender, int age, String name, String family){
		
		this.headSize = headSize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
	}
	
	//�޼���(method)
	//������ �Դ´� (��θ���, �������)
		String eat(String food) {
			if (food.equals("��")) {
				return "��θ���.";
	}
		else {
			return "�������.";
	}
	}
	
	//��𿡼� �ܴ� (�������, �ǰ��ϴ�)
		String sllep(String where) {
			if (where.equals("���ٴ�")) {
				return "�ǰ��ϴ�.";
				}
			else {
				return "�������.";
	}
	}		
		
	//������� �ȴ´� 
		void walk(String where) {
			System.out.println(where + "���� �ȴ´�.");
	}
	//������ �����Ѵ�
		void thing(String how) {
			System.out.println(how + "��(��) �����Ѵ�.");
	}
	
	// ���� a�� ���� b�� ���ϴ� �޼���
		int add(int a, int b){
			return a = b;
		}
}
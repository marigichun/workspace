class Person {
	int headSize;      // �Ӹ�ũ�� (����)
	int height;          //Ű           (����)
	String gender;    //����        (����)
	int age;              //����        (����)
	String name;      //�̸�         (����)
	String family;     //����         (����)
	
	//������(�Ӽ� �� �ʱ�ȭ)-�� �κ� �Ʒ� �κ���=���°�	
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
	String eat(String food) {
				//�޼ҵ� equals
		if(food.equals("��")){
			return this.name + "��(��) ��θ���.";
		}
		else{
			return this.name + "��(��) �������.";
		}
	}
	//��𿡼� �ܴ� (�������, �ǰ��ϴ�)
	String sleep (String where)  {
		if(where.equals("���ٴ�")){
			return this.name + "��(��) �ǰ��ϴ�.";
		}
		else{
			return this.name + "��(��) �������.";
		}
	}
	//������� �ȴ´�
	void walk (String where)  {
		System.out.println(this.name + "��(��)" + where + "���� �ȴ´�.");
	}
	//������ �����Ѵ�
	void think (String how)  {
		System.out.println(this.name + "��(��)" + how + "��(��) �����Ѵ�.");
	}
	//����(����)���
	 int add(int a, int b) {
		return a + b ;
	
	}
}










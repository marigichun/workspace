class Student{
	//�ν��Ͻ� ����(Instance Variable), ��� ����(Member Variable)
	int studentId;
	String name;
	int age;
	String major;
	int grade;
	
	public Student(int sudentId, String name, int age, String major, int grade) {
		this.studentId = studentId;
		this.name = name; 
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
			
	//��ȣ �ȿ� ���� �͵��� Prameter(Argument)��� �Ѵ�.
	//�޼���
	String study() {
		return this.name + "(��)�� " + this.major + "���θ� �Ѵ�.";
	}
	String introduce() {
		return "����" + this.major + " " +this.grade + "�г�" + "��������" + this.name + "�Դϴ�.";
	}
}
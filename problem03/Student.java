class Student {
	int StudentID;
	String name;
	int age;
	String major;
	int grade;
	
	
	public Student ( int StudentID, String name, int age,
	String major, int grade) {

	this.StudentID = StudentID;
	this.name = name;
	this.age = age; 
	this.major = major;
	this.grade = grade;
	}

	String Student(int where) {
		if(where.equals(1706070)) {
			return "1706070.";
		}
	
		else{
		    return "����.";
		}
	}
	String student(String where) {
		if(where.name("gun")){	
			return "����.";
	}
		else{
		               return "run.";
	
	}
	}
	int Student(int where) {
		if(where.age(20)){	
			return "����������.";
	}
		else{
		               return "20.";
	
	}
	}
	String Student(String where) {
		if(where.major("����������")){	
			return "�����Ѵ�.";
	}
		else{
		               return "����ֳ�.";
		}
	}
	void grade(int where) {
		System.out.println(Where + "1.");
	}
}	

			
	
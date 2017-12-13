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
		    return "경비원.";
		}
	}
	String student(String where) {
		if(where.name("gun")){	
			return "강쥐.";
	}
		else{
		               return "run.";
	
	}
	}
	int Student(int where) {
		if(where.age(20)){	
			return "전공과목을.";
	}
		else{
		               return "20.";
	
	}
	}
	String Student(String where) {
		if(where.major("전공과목을")){	
			return "공부한다.";
	}
		else{
		               return "놀고있네.";
		}
	}
	void grade(int where) {
		System.out.println(Where + "1.");
	}
}	

			
	
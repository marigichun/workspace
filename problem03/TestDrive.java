public class TestDrive {
	public static void main(String[] args) {
		Student gun =
			new Student(1706070, "�̸�", 20, "����", 1);
		String result1=StudentID("�й�");
		System.out.println(result1);
	
		
		
		String result2=gun.name("�̸�");
		System.out.println(result2);
	
		
		gun.age("20��");
		
		gun.tajor("����������");

		int result3=gun.add ("1�г�");
		System.out.println(result3);
	}
}
	

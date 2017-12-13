public class TestDrive {
	public static void main(String[] args) {
		Student gun =
			new Student(1706070, "이름", 20, "전공", 1);
		String result1=StudentID("학번");
		System.out.println(result1);
	
		
		
		String result2=gun.name("이름");
		System.out.println(result2);
	
		
		gun.age("20살");
		
		gun.tajor("전공과목을");

		int result3=gun.add ("1학년");
		System.out.println(result3);
	}
}
	

public class TestAdv {

	public static void main(String[] args) {

		PuppyAdv happy = new PuppyAdv ("��찳", "����", 3, "��");
		PuppyAdv jindo= new PuppyAdv ("��찳", "����", 5, "��");

		
		boolean isEqual = happy.equals(jindo);
			
		if (isEqual) {									System .out.println("����  �������̴�.");
		}
		else{
			System .out.println("�ٸ�  �������̴�.");
		}

	}
}
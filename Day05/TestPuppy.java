public class TestPuppy {

	public static void main(String[] args) {

		Puppy happy = new Puppy ("��찳", "����", 3, "��");
		Puppy jindo= new Puppy ("��찳", "����", 5, "��");

		
		boolean isEqual = happy.equals(jindo);
			
		if (isEqual) {									System .out.println("����  �������̴�.");
		}
		else{
			System .out.println("�ٸ�  �������̴�.");
		}

	}
}
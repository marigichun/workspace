public class TestPuppy {
	
	public static void main(String[] args) {
	
		Puppy puppy = new Puppy ("����", "����", 2, "����");
		Puppy ppoppy= new Puppy ("����", "����", 8, "����");

		
		boolean isEqual = puppy.equals( ppoppy);
		System.out.println(isEqual);


		boolean isEqual02 =  ppoppy.equals(puppy);
                              System.out.println(isEqual02);
		

		if (isEqual) {

		}
	}
}
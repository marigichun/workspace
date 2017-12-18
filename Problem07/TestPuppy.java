public class TestPuppy {
	
	public static void main(String[] args) {
	
		Puppy puppy = new Puppy ("Ω√√Ú", "∂∫¿Ã", 2, "ºˆƒ∆");
		Puppy ppoppy= new Puppy ("Ω√√Ú", "∂∫¿Ã", 8, "æœƒ∆");

		
		boolean isEqual = puppy.equals( ppoppy);
		System.out.println(isEqual);


		boolean isEqual02 =  ppoppy.equals(puppy);
                              System.out.println(isEqual02);
		

		if (isEqual) {

		}
	}
}
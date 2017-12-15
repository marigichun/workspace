public class TestPuppy {

	public static void main(String[] args) {

		Puppy happy = new Puppy ("삽살개", "해피", 3, "남");
		Puppy jindo= new Puppy ("삽살개", "해피", 5, "여");

		
		boolean isEqual = happy.equals(jindo);
			
		if (isEqual) {									System .out.println("같은  강아지이다.");
		}
		else{
			System .out.println("다른  강아지이다.");
		}

	}
}
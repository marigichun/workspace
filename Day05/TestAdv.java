public class TestAdv {

	public static void main(String[] args) {

		PuppyAdv happy = new PuppyAdv ("삽살개", "해피", 3, "남");
		PuppyAdv jindo= new PuppyAdv ("삽살개", "해피", 5, "여");

		
		boolean isEqual = happy.equals(jindo);
			
		if (isEqual) {									System .out.println("같은  강아지이다.");
		}
		else{
			System .out.println("다른  강아지이다.");
		}

	}
}
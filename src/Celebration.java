
public class Celebration {

	// Celebration 
	public void celebrate(){
		String celebration = null;
		int type = (int)(Math.random() * 5);
		switch (type){
		case 1: celebration = " does a backflip with joy after being drafted.";
			break;
		case 2: celebration = " highfives himself with excitement.";
			break;
		case 3: celebration = " updates his Twitter to \"Just got drafted!\".";
			break;
		case 4: celebration = " eats a donut. He feels after being drafted he deserves it.";
			break;
		case 5: celebration = " throws a fist in the air with confidence like John Bender "
				+ "at the end of \"Breakfast Club\".";
			break;
		}
		System.out.print(celebration);
	}
}

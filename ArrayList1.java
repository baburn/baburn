import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("AUDI");
		cars.add("Volvo");
		
		System.out.println(cars);
		System.out.println(cars.get(2));
		
	}

}

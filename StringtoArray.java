import java.util.Scanner;

public class StringtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String s1 = sc.nextLine();
		char[] myArray = s1.toCharArray();
		for (char i: myArray) {
			System.out.println(i);
		}
sc.close();
	}

}

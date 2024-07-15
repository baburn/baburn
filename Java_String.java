import java.util.*;

public class Java_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        sc.close();
       
       System.out.println(A.length() + B.length());
       if (A.compareTo(B) > 0 ){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
       System.out.println(toTitleCase(A + " " + B));
    }
    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
}
}

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String a = scanner.nextLine();

        a = a.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the given string: " + vowelCount);
        scanner.close();
    }
}

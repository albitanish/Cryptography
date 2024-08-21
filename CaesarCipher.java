package caesar;
import java.util.Scanner;
public class Caesarcipher {
   public static String caesar(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char shifted = (char) ('A' + (ch - 'A' + shift) % 26);
                shifted = Character.toUpperCase(shifted);
                result.append(shifted);
            }
            else if (Character.isLowerCase(ch)) {
                char shifted = (char) ('a' + (ch - 'a' + shift) % 26);
                shifted = Character.toUpperCase(shifted);
                result.append(shifted);
            }
            else if (ch ==' ')
            {

            	continue;

            }

            else {

                result.append(ch);

            }

        }
        return result.toString();

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        System.out.print("Enter a word: ");

        String input = sc.nextLine();

        String encryptedText = caesar(input, 3);

        System.out.println("Encrypted: " + encryptedText);
        String decryptedText = caesar(encryptedText, -3); 

        System.out.println("Decrypted: " + input);
        sc.close();

    }

}

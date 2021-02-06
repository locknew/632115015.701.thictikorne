import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//632115015 thictikorne vin//
public class ADTASSIGN {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("test1.txt"));
        int countword = 0, countUNI = 0, countPalin = 0;

        while (input.hasNextLine()) {
            String word = outword(input.next());
            
            if (palindrome(word)) {
                countPalin++;
            }
            if (word.matches("^[a-zA-Z]*$")) {
                countword++;
            }

            String[] character = word.split("");
            for (int i = 0; i < character.length; i++) {
                if (character[i].matches("^[a-zA-Z]*$")) {
                    countUNI++;
                }
            }

        }
        input.close();
        System.out.print("Total #word = " + countword + "\nTotal #unique character = " + countUNI
                + "\nTotal #palindrome = " + countPalin);

    }

    public static boolean palindrome(String check) {
        return (check.equals(new StringBuilder(check).reverse().toString()));
    }

    public static String outword(String word){
        String out = word.replace(",", "");
        return out.replace(".", "");
        
    }

}

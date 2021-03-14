package week10;
import java.util.Scanner;

public class Test {
    public static void main(String[]args){

        int dec;
        int[] bin = new int[100];
        
        Scanner input = new Scanner(System.in);
    
        System.out.println(" Input Convert Number : ");
        dec = input.nextInt();
    
       for(int i = 0;dec>0;i++)
        {
            bin[i] = dec % 2;
            dec /= 2;
           
        }
    
    
        System.out.println("\n Binary value is ");
    
        for(int j = bin.length - 1; j >= 0; j--)
        {
            System.out.print( bin[j]);
        }


}

}

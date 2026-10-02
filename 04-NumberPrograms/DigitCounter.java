import java.util.Scanner;
public class DigitCounter {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input:");

    String input = sc.nextLine();
    int characterCount = input.length();

    System.out.println("It has " + characterCount + " digits.");

    sc.close();
}
}
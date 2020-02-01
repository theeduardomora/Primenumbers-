/** This program asks  the user for an input of two integers and calculates list of all prime numbers between those two integers,
 * inclusive range. Also prints out running total of the count of all prime numbers in this range.
 * @author Eduardo Mora
 * @version 2/1/2020
 */
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("This program will display and count the number of prime numbers between a range of two integers from your inputs");
        System.out.println("Shall we begin? (yes or no)");
        Scanner in = new Scanner(System.in);
        String ans = in.next();
        if (ans.equals("Yes") || (ans.substring(0, 1).equals("y")) || (ans.substring(0, 1).equals("Y"))) {
            System.out.println("OK. Enter two integers below separated by a space (ex: 1 300)");
            boolean term = true;
            while(term) {
                try {
                    int number1 = in.nextInt();
                    int number2 = in.nextInt();
                    B.calcprime(number1, number2);
                    term = false;
                } catch (Exception e) {
                    System.out.println("Please try again following the format listed above (integer space integer).");
                    in.nextLine();
                }
            }
        } else
            System.out.println("Seems like you don't want to cooperate. Good day sir!");

    }

}

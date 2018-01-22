/** FizzBuzz Solution
 * Ayla Wickham
 * 
 * Counts from one to N and outputs "Fizz" if the number is divisible by 3, "Buzz" if the number is divisible by 5
 * and "Fizz Buzz" if the number is divisible by both. Otherwise it just outputs the number.
 * Please note: This assumes integers only. Doubles will be truncated.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

    private final Scanner SC = new Scanner(System.in);
    
    public FizzBuzz() {
        //System.out.print("Input a number: ");
        double num = 0;
        boolean fizzbuzz;
        System.out.print("Input a number: ");
        
        //Ensure input is correct format.
        while(true) {
            try {
                num = SC.nextDouble();
                break;
            } catch(InputMismatchException e) {
                System.err.print("\nInput must be a number. Please try again: ");
                SC.next();  //Clears scanner.
            }
        }
        
        //Fizzbuzz output
        for(int i=1; i <= num; i++) {
            fizzbuzz = false;
            if(i%3 == 0) {
                System.out.print("Fizz");
                fizzbuzz = true;
            }
            if(i%5 == 0) {
                System.out.print("Buzz");
                fizzbuzz = true;
            }
            if(!fizzbuzz) {
                System.out.print(i);
            }
            System.out.print(", ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FizzBuzz();
    }
    
}

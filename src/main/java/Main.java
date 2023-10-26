import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String input = scanner1.next();


        if(input.equalsIgnoreCase("Alice")) {
            System.out.println("Greetings, " + input + "!");
        } else if (input.equalsIgnoreCase("Bob")) {
            System.out.println("Greetings, " + input + "!");
        } else {
            System.out.println("You are neither Alice nor Bob.");
        }
    }
}

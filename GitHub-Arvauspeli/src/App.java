import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String input;
        String rightName = "Sara";

        System.out.println("Guess my name!");
        input = in.nextLine();

        if (input.equals("Sara")) {
            System.out.println("You guessed right!");
        }

    }
}

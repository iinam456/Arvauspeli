import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String input;
        String rightName = "Sara";
        int i = 0;

        do {
            System.out.println("Guess my name! (Write stop if you want to stop)");
            input = in.nextLine();
            i++;

            if (input.equals(rightName)) {
                System.out.println("Congrats! You guessed right!");
                i--;
                break;
            }
            if (input.equals("stop")) {
                i--;
                break;
            }
        } while (input != rightName);

    }
}

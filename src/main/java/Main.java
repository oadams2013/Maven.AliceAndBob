import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.println("Please Enter Your Name Below ");
        name = scanner.nextLine();
        String name1 = "Alice";
        String name2 = "Bob";

        if (name.equals(name1)) {
            System.out.println("Wassup, Alice?!");
        } else if (name.equals(name2)) {
            System.out.println("What it do? Bob! ");
        } else {
            System.out.println("Who Dis? ");
        }
    }
}



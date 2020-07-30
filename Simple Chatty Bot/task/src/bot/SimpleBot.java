package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is John.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = Integer.parseInt(scanner.next());
        int remainder5 = Integer.parseInt(scanner.next());
        int remainder7 = Integer.parseInt(scanner.next());

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is "+ age + "; that's a good time to start programming!");
    }
}

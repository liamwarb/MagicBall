import java.util.Random;

public class MagicBall {

    private static final int MAX_VALUE = 19;
    private static final int MIN_VALUE = 1;

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
    }

    public String predictTheFuture() {

        int choice = generateRandomNumber();

        if (choice == 1) {

            System.out.println("It is certain.");

        } else if (choice == 2) {

            System.out.println("It is decidedly so.");

        } else if (choice == 3) {

            System.out.println("Without a doubt.");

        } else if (choice == 4) {

            System.out.println("Yes - definitely.");

        } else if (choice == 5) {

            System.out.println("You may rely on it.");

        } else if (choice == 6) {

            System.out.println("As I see it, yes.");

        } else if (choice == 7) {

            System.out.println("Most likely.");

        } else if (choice == 8) {

            System.out.println("Outlook good.");

        } else if (choice == 9) {

            System.out.println("Yes.");

        } else if (choice == 10) {

            System.out.println("Signs point to yes.");

        } else if (choice == 11) {

            System.out.println("Reply hazy, try again.");

        } else if (choice == 12) {

            System.out.println("Ask again later.");

        } else if (choice == 13) {

            System.out.println("Better not tell you now.");

        } else if (choice == 14) {

            System.out.println("Cannot predict now.");

        } else if (choice == 15) {

            System.out.println("Concentrate and ask again.");

        } else if (choice == 16) {

            System.out.println("Don't count on it.");

        } else if (choice == 17) {

            System.out.println("My reply is no.");

        } else if (choice == 18) {

            System.out.println("My sources say no.");

        } else if (choice == 19) {

            System.out.println("Outlook not so good.");

        } else {

            System.out.println("Very doubtful.");

        }
        return "banana";

    }

    // 1. Remove system.out.println apart from line 107 and 112
    // 2. Better way of doing if, else-if, else-if, else-if.  Hint, use a hashmap

    public static void main(String[] args) {

        System.out.println("MAGIC 8-BALL: \n");

        MagicBall magicBall = new MagicBall();
        String theFuture = magicBall.predictTheFuture();

        System.out.println(theFuture);

    }

}
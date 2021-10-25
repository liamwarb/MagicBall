import java.util.HashMap;
import java.util.Random;

public class MagicBall {

    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 1;

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
    }

    public String predictTheFuture() {

        HashMap <Integer, String> result = new HashMap <>();

        result.put(1, "It is certain.");
        result.put(2, "It is decidedly so.");
        result.put(3, "Without a doubt.");
        result.put(4, "Yes - definitely.");
        result.put(5, "You may rely on it.");
        result.put(6, "As I see it, yes.");
        result.put(7, "Most likely.");
        result.put(8, "Outlook good.");
        result.put(9, "Yes.");
        result.put(10, "Signs point to yes.");
        result.put(11, "Reply hazy, try again.");
        result.put(12, "Ask again later.");
        result.put(13, "Better not tell you now.");
        result.put(14, "Cannot predict now.");
        result.put(15, "Concentrate and ask again.");
        result.put(16, "Don't count on it.");
        result.put(17, "My reply is no.");
        result.put(18, "My sources say no.");
        result.put(19, "Outlook not so good.");
        result.put(20, "Very doubtful.");

        return result.get(generateRandomNumber());
    }

    public static void main(String[] args) {

        System.out.println("MAGIC 8-BALL: \n");

        MagicBall magicBall = new MagicBall();
        String theFuture = magicBall.predictTheFuture();

        System.out.println(theFuture);

    }

}
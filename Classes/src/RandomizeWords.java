import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int rand = rnd.nextInt(word.length());
            words[i] = words[rand];
            words[rand] = word;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}

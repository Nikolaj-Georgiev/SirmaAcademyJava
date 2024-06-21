import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {
        String inputPath = "D:\\SIRMA\\SIRMA\\Java\\input.txt";
        String regex = "[^\\w']+";
        int linesCount = 0;
        int wordsCount = 0;
        int charsCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line = br.readLine();
            while (line != null) {
                linesCount++;
                String[] words = line.split(regex);
                wordsCount += words.length;
                for (String word : words) {
                    charsCount += word.length();
                }
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(STR."Lines \{linesCount}, Words \{wordsCount}, Characters \{charsCount}.");
    }
}

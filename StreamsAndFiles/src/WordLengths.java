import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordLengths {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "D:\\SIRMA\\SIRMA\\Java\\input.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    System.out.print(i == words.length - 1 ? STR."\{words[i].length()}" : STR."\{words[i].length()}, ");
                }
                line = br.readLine();
                if (line != null) {
                    System.out.print(", ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {

        String inputPath = "D:\\SIRMA\\SIRMA\\Java\\input.txt";

        Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                charFrequencyMap.put(character, charFrequencyMap.getOrDefault(character, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(STR."\{entry.getKey()}: \{entry.getValue()}");
        }
    }
}

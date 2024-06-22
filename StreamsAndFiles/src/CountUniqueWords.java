import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {
    public static void main(String[] args) {
        String relPath = "../input.txt";
        Path path = Paths.get(relPath);

        if (!Files.exists(path)) return;

        try (BufferedReader br = Files.newBufferedReader(path)) {
            Set<String> set = new HashSet<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("[^\\w']+");
                set.addAll(Arrays.asList(words));
            }
            System.out.println(STR."Unique words: \{set.size()}");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

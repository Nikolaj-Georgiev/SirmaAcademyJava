import java.io.*;
import java.util.regex.Pattern;

public class ReplaceWord {
    public static void main(String[] args) {
        String inputPath = "D:\\SIRMA\\SIRMA\\Java\\input.txt";
        String outputPath = "D:\\SIRMA\\SIRMA\\Java\\output.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath)); BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            String line = br.readLine();
            String[] words = line.split(" -> ");
            Pattern pattern = Pattern.compile(STR."\\b\{words[0]}\\b");
            while (line != null) {
                line = br.readLine();
                String newLine = line.replaceAll(words[0], words[1]);
                bw.write(newLine);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

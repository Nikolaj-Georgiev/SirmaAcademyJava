import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseLines {
    public static void main(String[] args) {
        String relativeInputPath = "../input.txt";
        String relativeOutputPath = "../output.txt";
        Path inputPath = Paths.get(relativeInputPath);
        Path outputPath = Paths.get(relativeOutputPath);

        if (Files.notExists(inputPath)) return;

        try (BufferedReader br = Files.newBufferedReader(inputPath);
             BufferedWriter bw = Files.newBufferedWriter(outputPath)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String newLine = new StringBuilder(line).reverse().toString();
                bw.write(newLine);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

import java.io.File;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        printNameExtensionAndSizeOfAFile(filePath);
        sc.close();
    }

    private static void printNameExtensionAndSizeOfAFile(String filePath) {
        File file = new File(filePath);
        String name = file.getName();
        int lastIndexOfDot = filePath.lastIndexOf(".");
        String extension = filePath.substring(lastIndexOfDot + 1);
        System.out.println(STR."File name: \{name}");
        System.out.println(STR."File extension: \{extension}");
        System.out.println(STR."File size: \{file.length()} bytes");
    }
}

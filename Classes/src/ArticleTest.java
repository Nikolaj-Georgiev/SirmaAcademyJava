import java.util.Scanner;

public class ArticleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialLine = sc.nextLine();
        String[] input = initialLine.split("(, )+");
        Article article = new Article(input[0], input[1], input[2]);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandLine = sc.nextLine().split("(: )+");
            String command = commandLine[0];
            switch (command) {
                case "Edit":
                    article.editContent(commandLine[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandLine[1]);
                    break;
                case "Rename":
                    article.rename(commandLine[1]);
                    break;
            }
        }

        System.out.println(article);// вика си само toString();
    }
}

public class Article {
    private String title;
    private String author;
    private String content;

    public Article(String title, String content, String author) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void editContent(String content) {
        this.content = content;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String toString() {
        return STR."\{this.title} - \{this.content}: \{this.author}";
    }
}

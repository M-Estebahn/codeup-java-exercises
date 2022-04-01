class Post {
    private String author;
    private String title;
    private String content;
    private String creationDate;

    private static long totalPosts=0;
    public Post(){
        totalPosts++;
    }

    public String getPost() {
        return  "\nTitle: " + title +  "\n"+
                "Content: " + content + "\n" +
                "Author: " + author + "\n" +
                "CreationDate: " + creationDate +"\n";
    }
    public  Post(String title, String author,String content, String creationDate) {
        this();
        this.title = title;
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
public class PostTest {
    public static void main(String[] args) {
        Post firstPost=new Post();
        System.out.println("firstPost.getPost() = " + firstPost.getPost());
        firstPost.setAuthor("Some Guy");
        firstPost.setContent("Did that thing");
        firstPost.setCreationDate("One Day Soon");
        firstPost.setTitle("Hey");
        System.out.println("firstPost.getPost() = " + firstPost.getPost());
        Post secondPost=new Post("What a day","Other guy","Too Much stuff","Today");
        System.out.println("secondPost.getPost() = " + secondPost.getPost());
    }
}

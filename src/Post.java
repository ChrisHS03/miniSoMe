public class Post {
    private String content;
    private String author;
    private int likes;

    public Post(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void like(){
        likes++;
    }

    @Override
    public String toString() {
        return "content = " + content + "\nauthor=" + author + "\nlikes=" + likes;
    }
}

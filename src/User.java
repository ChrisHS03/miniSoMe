import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> friends = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }
    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
        }
    }
    public void createPost(Post post) {
        posts.add(post);
    }
    public ArrayList<Post> getPosts() {
        return posts;
    }
    public ArrayList<User> getFriends() {
        return friends;
    }

}

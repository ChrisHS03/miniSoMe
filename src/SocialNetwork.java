import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users = new ArrayList<>();

    public SocialNetwork() {

    }

    public void addUser(User user) {
        users.add(user);
    }
    public String showFriendsPost(User user) {
        String printString = "";
        for (User friend : user.getFriends()){
            int counter = 0;
            for (Post post : friend.getPosts()){
                counter++;
                printString += counter +". " + post + "\n";
            }
        }
        return printString;
    }
}

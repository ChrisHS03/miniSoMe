public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        User christoffer = new User("Christoffer");
        User gustav = new User("Gustav");
        User edith = new User("Edith");

        socialNetwork.addUser(christoffer);
        socialNetwork.addUser(gustav);
        socialNetwork.addUser(edith);

        christoffer.createPost(new Post("Hejsa det er en dejlig dag","Christoffer"));
        christoffer.createPost(new Post("Oh yea","Christoffer"));
        gustav.createPost(new Post("Yayayayay","Gustav"));
        edith.createPost(new Post("oh yea yea oh yea yea yea yea","Edith"));

        christoffer.addFriend(gustav);
        gustav.addFriend(christoffer);
        gustav.addFriend(edith);

        System.out.println(socialNetwork.showFriendsPost(gustav));
        System.out.println(socialNetwork.showFriendsPost(christoffer));

        christoffer.getPosts().get(0).like();
        System.out.println(socialNetwork.showFriendsPost(gustav));

    }

}

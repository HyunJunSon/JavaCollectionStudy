package chapter7;

public class Test1 {
    public static void main(String[] args) {

        User user1 = new User()
                .setId(1001)
                .setName("Alice")
                .setVerified(false);

        User user2 = new User()
                .setId(1001)
                .setEmailAddress("alice@fastcampus.co.kr")
                .setVerified(false);

        System.out.println("Same? :" + userEquals(user2, user1));

    }

    public static boolean userEquals(User u1, User u2) {

        return u1.getId() == u2.getId()
                && u1.getName().equals(u2.getName())
                && u1.getEmailAddress().equals(u2.getEmailAddress())
                && u1.isVerified() == u2.isVerified();
    }
}

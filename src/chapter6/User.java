package chapter6;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String emailAddress;
    private boolean isVerified;
    private List<Integer> friendUserIds;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User setId(int id){
        this.id = id;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public User setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public User setVerified(boolean verified) {
        isVerified = verified;
        return this;
    }

    public List<Integer> getFriendUserIds() {
        return friendUserIds;
    }

    public User setFriendUserIds(List<Integer> friendUserIds) {
        this.friendUserIds = friendUserIds;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", isVerified=" + isVerified +
                ", friendUserIds=" + friendUserIds +
                '}';
    }
}
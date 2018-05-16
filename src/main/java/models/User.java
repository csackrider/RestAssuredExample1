package models;

public class User {
    public Integer id;
    public String name;
    public String username;
    public String email;

    public User(){
    }

    public User(String name, String username, String email){
        this.name = name;
        this.username = username;
        this.email = email;
    }
}

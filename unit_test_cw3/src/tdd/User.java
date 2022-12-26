package tdd;

public class User {
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean authentication(String nameUser, String passwordUser) {
        if (name.equals(nameUser) && password.equals(passwordUser)) {
            return true;
        } else {
            return false;
        }
    }
}

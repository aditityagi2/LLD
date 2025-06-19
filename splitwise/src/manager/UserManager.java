package manager;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user != null && !users.contains(user)) {
            users.add(user);
        }
    }

    public User getUserById(long userId) {
        for (User user : users) {
            if (userId == user.getUserId()) {
                return user;
            }
        }
        return null; // or throw an exception
    }
    public List<User> getAllUsers() {
        return new ArrayList<>(users); // Return a copy to prevent external modification
    }
}

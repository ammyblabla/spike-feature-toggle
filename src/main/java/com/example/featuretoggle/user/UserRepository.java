package com.example.featuretoggle.user;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private Map<Integer,User> users = new HashMap<>();

    public UserRepository() {
        users.put(0, User.builder()
                .id(0)
                .name("admin")
                .build());
    }

    public User getUser(Integer id) {
        return users.get(id);
    }

    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
}

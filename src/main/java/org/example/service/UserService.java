package org.example.service;

import org.example.dto.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUserById(Integer id);

    User searchUserById(Integer id);
}

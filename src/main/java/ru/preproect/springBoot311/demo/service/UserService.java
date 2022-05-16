package ru.preproect.springBoot311.demo.service;


import ru.preproect.springBoot311.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(long id);
    void deleteUser(long id);
    void updateUser(User user);

}

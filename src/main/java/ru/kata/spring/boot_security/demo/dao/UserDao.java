package ru.kata.spring.boot_security.demo.dao;



import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void save(User user);
    void delete(User user);
    void edit(User user);
    User getById(long id);
    User getUser(String userName);;
}

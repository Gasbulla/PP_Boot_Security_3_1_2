package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface RoleDao {
    List<User> getAllRoles();
    void add(Role role);
    void edit(Role role);
    Role getById(long id);
    Role getByName(String name);

}

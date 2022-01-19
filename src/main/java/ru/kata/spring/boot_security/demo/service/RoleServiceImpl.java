package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDAOImpl;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDAO;

    @Autowired
    public void setRole(RoleDAOImpl roleDAO) {
        this.roleDAO = roleDAO;
    }


    @Override
    public List<User> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    public void add(Role role) {
        roleDAO.add(role);
    }

    @Override
    public void edit(Role role) {
        roleDAO.edit(role);
    }

    @Override
    public Role getById(long id) {
        return roleDAO.getById(id);
    }

    @Override
    public Role getByName(String name) {
        return roleDAO.getByName(name);
    }
}

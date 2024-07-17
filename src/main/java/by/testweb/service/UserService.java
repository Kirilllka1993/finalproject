package by.testweb.service;

import by.testweb.entity.User;

import java.util.List;

public interface UserService {

    User add(User user);

    List<User> findAllUsers();

    User getUserById(Long id);

    User getUserByName(String name);

    User delete(Long id);

}

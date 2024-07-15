package by.testweb.service;

import by.testweb.entity.User;
import by.testweb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public User delete(Long id) {
        var user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Не найден пользователь с id " + id));
        userRepository.delete(user);
        return user;
    }
}

package by.testweb.controller;

import by.testweb.entity.User;
import by.testweb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.findAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/name")
    public User getUserByName(@RequestParam("name") String userName) {
        return userService.getUserByName(userName);
    }

    @DeleteMapping(value = "/{id}")
    public User delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }


}

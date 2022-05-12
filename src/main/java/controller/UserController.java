package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createEmployee(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> readEmployees() {
        return userService.getUser();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT)
    public User readUser(@PathVariable(value = "userId") Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(value = "userId") Long id) {
        userService.deleteUser(id);
    }
}

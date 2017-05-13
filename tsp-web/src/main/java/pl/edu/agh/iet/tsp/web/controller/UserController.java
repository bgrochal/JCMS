package pl.edu.agh.iet.tsp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.iet.tsp.database.domain.User;
import pl.edu.agh.iet.tsp.service.UserService;
import pl.edu.agh.iet.tsp.service.exception.DuplicateUsernameException;
import pl.edu.agh.iet.tsp.web.controller.json.IdWrapper;

import java.security.Principal;

/**
 * @author Wojciech Pachuta.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/me")
    public Principal user(Principal principal) {
        return principal;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public IdWrapper addUser(@RequestParam String username) throws DuplicateUsernameException {
        User user = new User(username);
        return new IdWrapper(userService.addUser(user));
    }

}

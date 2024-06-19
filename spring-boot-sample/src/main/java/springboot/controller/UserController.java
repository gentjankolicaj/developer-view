package springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.domain.User;
import springboot.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/{userNumber}", method = RequestMethod.GET, produces = "application/json")
  private List<User> showUsers(@PathVariable("userNumber") Integer userNumber) {
    return userService.getUsers(userNumber);
  }

}

package springboot.service;


import java.util.List;
import springboot.domain.User;

public interface UserService {

  List<User> getUsers(int number);

  User getUser(Long userId);


}

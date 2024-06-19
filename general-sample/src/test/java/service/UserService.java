package service;

import domain.User;
import java.util.List;

public interface UserService {

  List<User> getUsers(int number);

  User getUser(Long userId);


}

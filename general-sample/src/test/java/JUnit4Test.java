import domain.User;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.UserServiceImpl;


public class JUnit4Test {

  private final UserServiceImpl userServiceImpl = new UserServiceImpl();

  @Test
  public void testUserNumber() {

    int numberOfUsers = 50;
    List<User> users = userServiceImpl.getUsers(numberOfUsers);

    Assertions.assertEquals(numberOfUsers, users.size());

    Assertions.assertEquals(numberOfUsers + 3, users.size());

  }


}

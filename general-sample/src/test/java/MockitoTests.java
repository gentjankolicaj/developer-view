import domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

  private UserServiceImpl userServiceImpl;

  @Before
  public void setUp() {
    userServiceImpl = Mockito.mock(UserServiceImpl.class);
  }

  @Test
  public void testUser() {
    User user = userServiceImpl.getUser(1L);
    Mockito.when(user).thenReturn(user);

    int numberOfUsers = 10;
    Assert.assertEquals(userServiceImpl.getUsers(numberOfUsers).size(), numberOfUsers);

  }

}

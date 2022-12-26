package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    void userCreation(){
        User user = new User("name", "qwerty");
        user.authentication("name", "qwerty");

        assertTrue(user.authentication("name", "qwerty"));
    }

    @Test
    void userCreationFail(){
        User user = new User("name", "qwerty");
        user.authentication("name", "qwerty");

        assertFalse(user.authentication("name", "12345"));
    }
}

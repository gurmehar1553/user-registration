package userregister;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegisterTest {
    @Test
    public void happyTestCase() throws UserRegistrationException {
        Assert.assertTrue(UserRegisteration.checkValidFname("Aab"));
        Assert.assertTrue(UserRegisteration.checkValidLname("Caxyz"));
        Assert.assertTrue(UserRegisteration.checkValidEmail("abc@co.in"));
        Assert.assertTrue(UserRegisteration.checkValidMobile("99 8291930981"));
        Assert.assertTrue(UserRegisteration.checkValidPassword("ajA2Jkj4%"));
    }
    @Test
    public void sadTestCase() {
        try {
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            UserRegisteration.checkValidFname("abc12");
            UserRegisteration.checkValidLname("Capab");
            UserRegisteration.checkValidEmail("a.kd@@ls");
            UserRegisteration.checkValidMobile("8 8921 293");
            UserRegisteration.checkValidPassword("sjAjd2@@");
        }
        catch (UserRegistrationException e){
        }
    }

}

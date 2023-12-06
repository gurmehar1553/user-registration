package userregister;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterTest {
    @Test
    public void happyTestCase(){
        UserRegisteration obj = new UserRegisteration();
        Assert.assertEquals(obj.checkValidFname("CapabA"),true);
        Assert.assertEquals(obj.checkValidLname("Capxyz"),true);
        Assert.assertEquals(obj.checkValidEmail("abc@co.in"),true);
        Assert.assertEquals(obj.checkValidMobile("99 8291930981"),true);
        Assert.assertEquals(obj.checkValidPassword("ajA2Jkj4%"),true);
    }
    @Test
    public void sadTestCase(){
        UserRegisteration obj = new UserRegisteration();
        Assert.assertEquals(obj.checkValidFname("CapabA12"),false);
        Assert.assertEquals(obj.checkValidLname("Capab"),false);
        Assert.assertEquals(obj.checkValidEmail("a.kd@@ls"),false);
        Assert.assertEquals(obj.checkValidMobile("8 8921 293"),false);
        Assert.assertEquals(obj.checkValidPassword("sjAjd2@@"),false);
    }
}

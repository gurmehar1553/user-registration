package userregister;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestEmail {
    private String email;
    private boolean ans;
    public TestEmail(String email,boolean ans){
        this.email = email;
        this.ans = ans;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc@1.com",true},
                {"abc123@.com",false},
                {".abc@abc.com",false},
                {"abc@gmail.com.com",true}
        });
    }
    @Test
    public void testMail() {
        try {
            Assert.assertEquals(UserRegisteration.checkValidEmail(email),ans);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Enter valid email",e.getMessage());
        }
    }
}

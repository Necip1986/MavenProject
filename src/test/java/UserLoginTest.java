import app.UserLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest {

    @Test
    public void testLogin1(){
        UserLogin myapp=new UserLogin();
        Assert.assertEquals(1,myapp.login("abc","abc123"));

    }
    @Test
    public void testLogin2(){
        UserLogin myapp=new UserLogin();
        Assert.assertEquals(0,myapp.login("abc","abc@123"));

    }
}

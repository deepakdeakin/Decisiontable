package decisiontable;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLoginFormTest {

	@Test
    public void testValidUsernameAndPassword() {
        String result = SimpleLoginForm.Login("testuser", "testpass");
        Assert.assertEquals("success", result);
    }

    @Test
    public void testInvalidUsername() {
        String result = SimpleLoginForm.Login("wronguser", "testpass");
        Assert.assertEquals("username mismatch", result);
    }

    @Test
    public void testInvalidPassword() {
        String result = SimpleLoginForm.Login("testuser", "wrongpass");
        Assert.assertEquals("password mismatch", result);
    }

    @Test
    public void testEmptyUsername() {
        String result = SimpleLoginForm.Login("", "testpass");
        Assert.assertEquals("username mismatch", result);
    }

    @Test
    public void testEmptyPassword() {
        String result = SimpleLoginForm.Login("testuser", "");
        Assert.assertEquals("password mismatch", result);
    }

    @Test
    public void testEmptyUsernameAndPassword() {
        String result = SimpleLoginForm.Login("", "");
        Assert.assertEquals("username mismatch", result);
    }
}

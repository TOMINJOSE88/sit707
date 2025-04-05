package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "224353043";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Tomin Jose";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void test_TC1() {
	    LoginStatus status = LoginForm.login(null, null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test_TC2() {
	    LoginStatus status = LoginForm.login(null, "wrong_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test_TC3() {
	    LoginStatus status = LoginForm.login(null, "tomin_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test_TC4() {
	    LoginStatus status = LoginForm.login("wrong_user", null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void test_TC5() {
	    LoginStatus status = LoginForm.login("wrong_user", "wrong_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test_TC6() {
	    LoginStatus status = LoginForm.login("wrong_user", "tomin_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test_TC7() {
	    LoginStatus status = LoginForm.login("tomin", null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void test_TC8() {
	    LoginStatus status = LoginForm.login("tomin", "wrong_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test_TC9() {
	    LoginStatus status = LoginForm.login("tomin", "tomin_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    boolean codeValidation = LoginForm.validateCode(null);
	    Assert.assertFalse(codeValidation);
	}

	@Test
	public void test_TC10() {
	    LoginStatus status = LoginForm.login("tomin", "tomin_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    boolean codeValidation = LoginForm.validateCode("wrong_code");
	    Assert.assertFalse(codeValidation);
	}

	@Test
	public void test_TC11() {
	    LoginStatus status = LoginForm.login("tomin", "tomin_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    boolean codeValidation = LoginForm.validateCode("123456");
	    Assert.assertTrue(codeValidation);
	}

	
	
}

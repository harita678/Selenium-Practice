package ca.haritagandhi.MavenTest.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ca.haritagandhi.MavenTest.RegisterPage;

public class RegisterPageTest
{
   WebDriver driver;
   static RegisterPage registerPage;

   @BeforeMethod
   public void makeConnection()
   {
      driver = TestBase.stratBrowser("chrome");
      registerPage = new RegisterPage(driver);
      TestBase.startWebsite("http://tutorialsninja.com/demo/index.php?route=account/register");

   }

   @AfterMethod
   public void quitBrowser()
   {

      driver.quit();

   }

   @Test(priority = 2)
   public void testPageTitle()
   {
      registerPage.doRegister("Ram", "Patel", "ram9@gmail.com", "1234567892", "Ram@123", "Ram@123");
      Assert.assertEquals("Your Account Has Been Created!", registerPage.getPageTitle());
   }

   @Test(priority = 0)
   public void testWarningMsg()
   {
      registerPage.doRegister("Ram", "Patel", "ram4@gmail.com", "1234567892", "Ram@123", "Ram@123");
      Assert.assertEquals("Warning: E-Mail Address is already registered!", registerPage.getWarningMsg());

   }

   @Test(priority = 1)
   public void testGetRegisterPageTitle()
   {
      Assert.assertEquals("Register Account", registerPage.getRegisterPageTitle());
   }

}

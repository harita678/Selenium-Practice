package ca.haritagandhi.MavenTest.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ca.haritagandhi.MavenTest.LoginPage;
import ca.haritagandhi.MavenTest.MyAccountPage;

public class LoginPageTest
{
   WebDriver driver;

   LoginPage loginPage;

   @Parameters({"browser"})
   @BeforeMethod
   public void makeConnection(@Optional String browser)
   {
      driver = TestBase.stratBrowser(browser);
      loginPage = new LoginPage(driver);
      TestBase.startWebsite("http://tutorialsninja.com/demo/index.php?route=account/login");

   }

   @AfterMethod
   public void quitBrowser()
   {

      driver.quit();

   }

   @Test(priority = 2)
   public void testDoLoginValid01()
   {

      loginPage.doLoginValid("ram@gmail.com", "Ram@123");
      MyAccountPage myAccountPage = new MyAccountPage(driver);
      Assert.assertEquals("My Account", myAccountPage.getTitle());
   }

   @Test(priority = 0)
   public void testDoLoginInvalid02()
   {
      Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.",
            loginPage.doLoginInValid("ramq@gmail.com", "Ram@123"));
   }

   @Test(priority = 1)
   public void testDoLoginInvalid03()
   {
      Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.",
            loginPage.doLoginInValid("ram@gmail.com", "Rama@123"));
   }
}

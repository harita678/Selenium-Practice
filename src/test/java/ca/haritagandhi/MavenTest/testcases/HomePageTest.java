package ca.haritagandhi.MavenTest.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ca.haritagandhi.MavenTest.HomePage;
import ca.haritagandhi.MavenTest.LoginPage;
import ca.haritagandhi.MavenTest.RegisterPage;

public class HomePageTest
{
   WebDriver driver;
   HomePage homePage;

   @BeforeTest
   public void makeConnection()
   {
      driver = TestBase.stratBrowser("chrome");
      homePage = new HomePage(driver);
      TestBase.startWebsite("http://tutorialsninja.com/demo/index.php?route=common/home");

   }

   @AfterTest
   public void quitBrowser()
   {
      driver.quit();
   }

   @Test
   public void testGetHomePageTitle()
   {
      Assert.assertEquals("The Ninja Store", homePage.getHomePageTitle());
   }

   @Test
   public void testGetRegisterPageTitle()
   {

      homePage.clickRegister();
      RegisterPage registerPage = new RegisterPage(driver);
      Assert.assertEquals("Register Account", registerPage.getRegisterPageTitle());
   }

   @Test
   public void testGetLoginPageTitle()
   {

      homePage.clickLogin();
      LoginPage loginPage = new LoginPage(driver);
      Assert.assertEquals("Account Login", loginPage.getLoginPageTitle());
   }

}

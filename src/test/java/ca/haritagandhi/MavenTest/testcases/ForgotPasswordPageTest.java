package ca.haritagandhi.MavenTest.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ca.haritagandhi.MavenTest.ForgotPasswordPage;
import ca.haritagandhi.MavenTest.LoginPage;

public class ForgotPasswordPageTest
{
   WebDriver driver;

   LoginPage loginPage;

   @BeforeClass
   public void makeConnection()
   {
      driver = TestBase.stratBrowser("chrome");
      loginPage = new LoginPage(driver);
      TestBase.startWebsite("http://tutorialsninja.com/demo/index.php?route=account/login");
   }

   @AfterClass
   public void quitBrowser()
   {

      driver.quit();

   }

   @Test
   public void testDoForgotPwd()
   {
      loginPage.doForgotPwd();
      ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
      File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      Assert.assertEquals("Forgot Your Password?", forgotPasswordPage.getTitle());

      try
      {
         FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Harita\\Desktop\\screenshot\\forgotpwd.png"));
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }
}

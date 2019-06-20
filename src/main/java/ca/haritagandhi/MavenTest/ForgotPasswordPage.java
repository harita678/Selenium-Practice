package ca.haritagandhi.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage
{

   WebDriver driver;

   public ForgotPasswordPage(
         WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getTitle()
   {
      return driver.getTitle();
   }
}

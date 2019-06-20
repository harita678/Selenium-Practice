package ca.haritagandhi.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage
{
   WebDriver driver;

   @FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]")
   WebElement logOut;

   public MyAccountPage(
         WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getTitle()
   {
      return driver.getTitle();
   }

   public void doLogout()
   {
      logOut.click();
   }

   public WebElement getLogout()
   {
      return logOut;
   }
}

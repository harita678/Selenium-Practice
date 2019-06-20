package ca.haritagandhi.MavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
   WebDriver driver;

   @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
   WebElement email;

   @FindBy(how = How.XPATH, using = "//input[@id='input-password']")
   WebElement password;

   @FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
   WebElement login;

   @FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger alert-dismissible']")
   WebElement warning;

   @FindBy(how = How.XPATH, using = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
   WebElement forgotpwd;

   public LoginPage(
         WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getLoginPageTitle()
   {
      return driver.getTitle();
   }

   public void doLoginValid(String email1, String pwd)
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      email.sendKeys(email1);
      password.sendKeys(pwd);

      login.click();

   }

   public String doLoginInValid(String email1, String pwd)
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      email.sendKeys(email1);
      password.sendKeys(pwd);

      login.click();
      return warning.getText();
   }

   public void doForgotPwd()
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      forgotpwd.click();
   }
}

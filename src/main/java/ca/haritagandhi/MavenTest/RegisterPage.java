package ca.haritagandhi.MavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
   WebDriver driver;

   @FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
   WebElement fName;

   @FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
   WebElement lName;

   @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
   WebElement email;

   @FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
   WebElement telephone;

   @FindBy(how = How.XPATH, using = "//input[@id='input-password']")
   WebElement password;

   @FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
   WebElement confPassword;

   @FindBy(how = How.XPATH, using = "//div[@class='form-group']//div[@class='col-sm-10']//label[1]")
   WebElement yes;

   @FindBy(how = How.XPATH, using = "//body//label[2]")
   WebElement no;

   @FindBy(how = How.XPATH, using = "//input[@name='agree']")
   WebElement privacyPolicy;

   @FindBy(how = How.XPATH, using = " //input[@class='btn btn-primary']")
   WebElement continu;

   @FindBy(how = How.XPATH, using = " //div[@class='alert alert-danger alert-dismissible']")
   WebElement warningMsg;

   public RegisterPage(
         WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getRegisterPageTitle()
   {
      return driver.getTitle();
   }

   public void doRegister(String fName1, String lName1, String email1, String telephone1, String password1,
         String confPassword1)
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      fName.sendKeys(fName1);

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      lName.sendKeys(lName1);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      email.sendKeys(email1);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      telephone.sendKeys(telephone1);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      password.sendKeys(password1);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      confPassword.sendKeys(confPassword1);

      yes.click();
      privacyPolicy.click();
      continu.click();

   }

   public String getWarningMsg()
   {
      String warningMessage = warningMsg.getText();
      return warningMessage;
   }

   public String getPageTitle()
   {
      String pageTitle = driver.getTitle();
      return pageTitle;
   }
}

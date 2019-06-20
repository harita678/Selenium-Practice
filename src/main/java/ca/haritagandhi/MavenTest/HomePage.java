package ca.haritagandhi.MavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
   WebDriver driver;

   @FindBy(how = How.XPATH, using = " //ul[@class='list-inline']//li[@class='dropdown']")
   WebElement myAccount;

   @FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
   WebElement register;

   @FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
   WebElement login;

   @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping Cart')]")
   WebElement shoppingCart;

   @FindBy(how = How.XPATH, using = "//span[contains(text(),'Checkout')]")
   WebElement checkOut;

   public HomePage(
         WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getHomePageTitle()
   {
      return driver.getTitle();
   }

   public void clickRegister()
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      myAccount.click();
      register.click();
   }

   public void clickLogin()
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      myAccount.click();
      login.click();
   }

   public void clickShoppingCart()
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      shoppingCart.click();
   }

   public void clickCheckOut()
   {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      checkOut.click();
   }
}

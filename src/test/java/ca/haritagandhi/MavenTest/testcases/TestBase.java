package ca.haritagandhi.MavenTest.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase
{
   static WebDriver driver;

   public static WebDriver stratBrowser(String browserName)
   {
      if (browserName.equals("chrome"))
      {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harita\\Desktop\\Harita\\chromedriver.exe");
         driver = new ChromeDriver();

      }
      else if (browserName.equals("firefox"))
      {
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harita\\Desktop\\Selenium\\geckodriver.exe");
         driver = new FirefoxDriver();
      }
      return driver;
   }

   public static void startWebsite(String url)
   {
      driver.get(url);
   }
}

package ca.haritagandhi.MavenTest.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
   static WebDriver driver;

   public static WebDriver stratBrowser(String browserName)
   {

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harita\\Desktop\\Harita\\chromedriver.exe");
      driver = new ChromeDriver();
      return driver;
   }

   public static void startWebsite(String url)
   {
      driver.get(url);
   }
}

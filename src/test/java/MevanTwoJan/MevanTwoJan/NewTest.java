package MevanTwoJan.MevanTwoJan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws  InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(6000);
	  driver.quit();
  }
}

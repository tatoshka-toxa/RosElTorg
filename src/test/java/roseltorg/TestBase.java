package roseltorg;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {

   public WebDriver driver = new ChromeDriver();

   @Before
   public void setUp() {
      driver.get("https://ya.ru");
   }

   @After
   public void tearDown() {
      driver.quit();
   }

   public void clickAbility(WebDriver driver, By xpath) {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(xpath));
      driver.findElement(xpath).click();
   }

   public void visAbility(WebDriver driver, By locator) {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }

   public void switchWindow() {
      for (String winHandle : driver.getWindowHandles()) {
         driver.switchTo().window(winHandle);
      }
   }

}

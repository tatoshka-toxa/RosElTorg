package roseltorg;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {

   public String company = "росэлторг";
   public By yaInput = By.id("text");
   public By find = By.xpath("//button[@type='submit']");
   public By site = By.xpath("//*[text()='Единая электронная торговая площадка (']");
   public By reg = By.xpath("//header/div/div/button");
   public By post = By.xpath("//img[@alt='Поставщик']");
   public By etp = By.linkText("Единая аккредитация для участия в корпоративных закупках и закупках субъектов 223-ФЗ, аккредитация иностранных поставщиков (в том числе для регистрации в ЕРУЗ)");
   public By fin = By.xpath("//b[text()='Если Вы приобрели новую электронную подпись в связи с истечением срока действия старой, то Вам следует загрузить ее в профиле зарегистрированного пользователя, а не регистрировать нового пользователя']");


   public WebDriver driver = new ChromeDriver();

   @Before
   public void setUp() {
      driver.get("https://ya.ru");
   }

   @After
   public void tearDown() {
      driver.quit();
   }

   public void textInput(WebDriver driver, By locator, String text) {
      clickAbility(driver, locator);
      driver.findElement(locator).clear();
      driver.findElement(locator).sendKeys(text);
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

package roseltorg;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestRosElTorg extends TestBase {

   private By find = By.xpath("//button[@type='submit']");
   private By site = By.xpath("//*[text()='Единая электронная торговая площадка (']");
   private By reg = By.xpath("//header/div/div/button");
   private By post = By.xpath("//img[@alt='Поставщик']");
   private By etp = By.linkText("Единая аккредитация для участия в корпоративных закупках и закупках субъектов 223-ФЗ, аккредитация иностранных поставщиков (в том числе для регистрации в ЕРУЗ)");
   private By fin = By.xpath("//b[text()='Если Вы приобрели новую электронную подпись в связи с истечением срока действия старой, то Вам следует загрузить ее в профиле зарегистрированного пользователя, а не регистрировать нового пользователя']");


   @Test
   public void signUp() throws InterruptedException {

      driver.findElement(By.id("text")).click();
      driver.findElement(By.id("text")).clear();
      driver.findElement(By.id("text")).sendKeys("росэлторг");

      clickAbility(driver, find);
      clickAbility(driver, site);

      switchWindow();

      clickAbility(driver, reg);
      clickAbility(driver, post);
      clickAbility(driver, etp);
      visAbility(driver, fin);
   }

}

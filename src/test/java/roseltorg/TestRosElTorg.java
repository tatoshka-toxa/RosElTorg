package roseltorg;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestRosElTorg extends TestBase {

   @Test
   public void signUp() throws InterruptedException {

      textInput(driver, yaInput, company);

      clickAbility(driver, find);
      clickAbility(driver, site);

      switchWindow();

      clickAbility(driver, reg);
      clickAbility(driver, post);
      clickAbility(driver, etp);
      visAbility(driver, fin);
   }

}

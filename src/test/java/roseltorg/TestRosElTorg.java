package roseltorg;

import org.junit.Test;

public class TestRosElTorg extends TestBase {

   @Test
   public void signUp()  {

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

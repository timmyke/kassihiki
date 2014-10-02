import ohtu.*
import ohtu.authentication.*
import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description """A new record can be added"""

scenario "creation succesfull with correct details", {
    given 'command new viite is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("viite"));       
        element.click(); 
    }
 
    when 'a valid details are entered', {
        /*String heppu = UUID.randomUUID().toString().substring(0, 9);
        element = driver.findElement(By.name("username"));
        element.sendKeys(heppu);
        element = driver.findElement(By.name("password"));
        element.sendKeys("salasana1");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("salasana1");
        element.submit();*/
    }

    then 'new records is registered to system', {
      //driver.getPageSource().contains("continue to application mainpage").shouldBe true
    }
}

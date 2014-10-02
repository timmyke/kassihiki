import ohtu.*
import ohtu.authentication.*
import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description """A new record can be added"""
// turn off htmlunit warnings
java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);


urli = "http://localhost:8090";


scenario "Viite add page exists", {
    given "Index page is found", {
        driver = new HtmlUnitDriver();
        driver.get(urli);
    }

    when 'Viite link is clikced', {
       // element = driver.findElement(By.linkText("viitteet"));       
       // element.click();
    }

    then 'Viite page is shown', {

    }
}

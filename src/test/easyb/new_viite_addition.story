import ohtu.*
import ohtu.authentication.*
import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

description """A new record can be added"""
// js-kirjasto aiheuttaa harmia, joten html warnit otetaan pois näkvyistä
java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);


urli = "http://localhost:8090";


scenario "Viite add page exists", {
    given "Index page is found", {
        driver = new HtmlUnitDriver();
        driver.get(urli);
    }

    when 'Viite link is clikced', {
       element = driver.findElement(By.linkText("viitteet"));       
       element.click();
    }

    then 'Viite page is shown', {

    }
}

scenario "can add a new viite", {
    given "Index page is found", {
        driver = new HtmlUnitDriver();
        driver.get(urli);
        element = driver.findElement(By.linkText("viitteet"));       
        element.click();
    }

    when 'correct values are entered, {
       
    }

    then 'Viite page is added', {

    }
}

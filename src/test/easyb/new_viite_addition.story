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

    when 'Viite link is clicked', {
       element = driver.findElementByCssSelector("input.btn"); 

    }

    then 'Viite page is shown', {
       v = element.getAttribute("value")
       v.shouldBeEqualTo "Add Viite"
    }
}

scenario "can add a new viite", {
    given "Index page is found", {
        driver = new HtmlUnitDriver();
        driver.get(urli);
    }

    when 'correct values are entered', {
        author = driver.findElementById("author")
        author.sendKeys("Random Author")
        book_title = driver.findElementById("book_title")
        book_title.sendKeys("Placeholder Title")
        t = driver.findElementById("title")
        t.sendKeys("The Cited Part of The Book")
        y = driver.findElementById("year")
        y.sendKeys("2014")
        b = driver.findElementByCssSelector("input.btn")
        b.submit()
    }

    then 'Viite page is added', {
        driver.get(urli)
        e = driver.findElementByPartialLinkText("Random Author,")
        e.shouldNotEqual null
    }
}

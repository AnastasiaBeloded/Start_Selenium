import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCss {
    WebDriver wd;

    @Test
    public void startCssLocators(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");


        WebElement el1 = wd.findElement(By.id("root"));
        WebElement el2 = wd.findElement(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.tagName("a"));//3
        wd.findElement(By.className("container"));
        wd.findElement(By.name("name"));

        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));

        /////////css///////
        wd.findElement(By.cssSelector(""));
        //tagname
        wd.findElement(By.xpath(""));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath(""));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.xpath("//input"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.xpath("//button"));
        //atribute
        //id ----#
        wd.findElement(By.xpath("//*[@id='root']"));
        wd.findElement(By.cssSelector("#root"));
        ///class---class
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));
        //atribute
        wd.findElement(By.cssSelector("[href='/home/]'"));
        wd.findElement(By.xpath("//*[@href='/home']"));

        //equals with
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Email']"));
        // start with
        wd.findElement(By.cssSelector("[placeholder^='Em']"));
        wd.findElement(By.xpath("//*[stars-with(@placeholder,'Em')]"));

        //end on "il"
        wd.findElement(By.cssSelector("[placeholder$='il']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ail')]"));///not analogy
        //contains ----'ai
        wd.findElement(By.cssSelector("[placeholder*='ai']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ai')]"));



    }
}

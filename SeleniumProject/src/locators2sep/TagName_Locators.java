package locators2sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locators {
    public static void main(String[] args) {
        tagNameLocator();
    }

//tagName locator example
public static void tagNameLocator() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

        //using tagname enter userName and password
        chrome.findElement(By.tagName("input")).sendKeys("aaaaaaaaaaaaa");
        chrome.findElement(By.tagName("a")).click();
        Thread.sleep(2000);

        chrome.quit();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        chrome = null;
    }
}
}
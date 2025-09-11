package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLink1_Locator {
    public static void main(String[] args) {
        xpath1Link();
    }
    //xpathLink1 locators example
    public static void xpath1Link() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//a")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);

            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}



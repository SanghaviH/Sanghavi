package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {
    public static void main(String[] args) {
        xpathLocator();
    }

    //Xpath Locators Example
    public static void xpathLocator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            String text = chrome.findElement(By.xpath("//h1[text()='Header One']")).getText();
            System.out.println(text);
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

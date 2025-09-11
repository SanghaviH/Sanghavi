package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLink2_Locator {
    public static void main(String[] args) {
        xpath2Link();
    }

    public static void xpath2Link() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //xpathLink locators example
            chrome.findElement(By.xpath("/html/body/a[@id='link2_id']")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}



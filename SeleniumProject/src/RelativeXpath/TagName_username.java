package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_username {
    public static void main(String[] args) {
        tagName_username();
 }
 //Reletivexpath username example
    public static void tagName_username() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

//chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

//using id enter userName and password
            chrome.findElement(By.xpath("//input\n]")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.xpath("//input\n")).sendKeys("bbbbbbbbbbb");
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}
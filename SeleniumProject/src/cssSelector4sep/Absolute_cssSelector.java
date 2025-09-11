package cssSelector4sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_cssSelector {
    public static void main(String[] args) {
        xpathLocator();
    }
    //name locator example
    public static void xpathLocator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using cssSelector enter first userName ?
           // chrome.findElement(By.cssSelector("html body form input")).sendKeys("aaaaaaaaa");
            //Thread.sleep(2000);

            //using CssSelector enter first password values?
            //chrome.findElement(By.cssSelector("input[id='frm1_pwd_id']")).sendKeys("bbbbbbbbbbbb");
            //Thread.sleep(2000);

            //using CssSelector enter second username?
            //chrome.findElement(By.cssSelector("html body form[id='frm2'] input")).sendKeys("cccccccccccccccccc");
            //Thread.sleep(2000);

            //using CssSelector enter second password?
            //chrome.findElement(By.cssSelector("html body form[id='frm2']")).sendKeys("ddddddddd");
            //Thread.sleep(2000);


            //using CssSelector enter second password?
            chrome.findElement(By.cssSelector("input[id='frm1_pwd_id']")).sendKeys("ddddddddd");
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
        }
    }
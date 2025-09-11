package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class preceding_password {
    public static void main(String[] args) {
        preceding();
    }

    //preceding siblings example
    public static void preceding() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_ok_id']/preceding::input[1]\n")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

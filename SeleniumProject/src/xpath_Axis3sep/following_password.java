package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class following_password {
    public static void main(String[] args) {
        following();
    }

    public static void following() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following::input[1]\n")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

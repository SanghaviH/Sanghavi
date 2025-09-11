package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class following_username {
    public static void main(String[] args) {
        followingname();
    }

    //following siblings example
    public static void followingname() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            //using xpath enter userName and password
            String text = chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following::tr[1]/td[1]")).getText();
            System.out.println(text);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

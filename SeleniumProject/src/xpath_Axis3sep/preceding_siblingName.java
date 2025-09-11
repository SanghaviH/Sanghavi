package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class preceding_siblingName {
    public static void main(String[] args) {
        precedingsiblingname();
    }

    //preceding siblings example
    public static void precedingsiblingname() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            //using xpath enter userName and password
            String text = chrome.findElement(By.xpath("//td[text()='Indian Scientist']/preceding-sibling::td[1]")).getText();
            System.out.println(text);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

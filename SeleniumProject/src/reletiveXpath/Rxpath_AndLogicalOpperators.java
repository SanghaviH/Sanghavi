package reletiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath_AndLogicalOpperators {
    public static void main(String[] args) {
        AndLogicalOpperators();
}

public static void AndLogicalOpperators() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

        //And logical operators Example
        chrome.findElement(By.xpath("//input[@name='frm1_un_name' and @placeholder='EnterUserName']")).sendKeys("aaaaaaaaaaaaa");
        Thread.sleep(2000);

        chrome.close();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        chrome = null;
    }
}
}
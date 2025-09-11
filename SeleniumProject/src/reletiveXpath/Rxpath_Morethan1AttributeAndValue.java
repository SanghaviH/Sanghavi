package reletiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath_Morethan1AttributeAndValue {
    public static void main(String[] args) {
        attributrnameandvalue();
    }

public static void attributrnameandvalue() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

        //Morethan 1 Attribute And Value
        chrome.findElement(By.xpath("//input[@name='frm1_un_name'][@placeholder='EnterUserName']")).sendKeys("aaaaaaaaaaaaa");
        Thread.sleep(2000);

        chrome.close();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        chrome = null;
    }
}
}


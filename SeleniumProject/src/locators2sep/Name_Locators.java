package locators2sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locators {
    public static void main(String[] args) {
        nameLocator();
    }
     //name locator example
public static void nameLocator() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

        //using name enter userName and password
        chrome.findElement(By.name("frm1_un_name")).sendKeys("aaaaaaaaaaaaa");
        chrome.findElement(By.name("frm1_pwd_name")).sendKeys("bbbbbbbbbbb");
        Thread.sleep(2000);

        chrome.close();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        chrome = null;
    }
}
}

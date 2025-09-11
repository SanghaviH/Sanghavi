package reletiveXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath_OrLogicalOperators {
    public static void main(String[] args) {
        orlogicaloperators();
    }

    public static void orlogicaloperators() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();


            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //Or logical Operators example
            chrome.findElement(By.xpath("//input[@id='frm1_un_id' or @type='text']\n")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);

            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

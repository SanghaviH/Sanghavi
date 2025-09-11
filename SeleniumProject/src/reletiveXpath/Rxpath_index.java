package reletiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath_index {
    public static void main(String[] args) {
        index();
    }

    public static void index() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

         //index?
            String text = chrome.findElement(By.xpath("(//input[@name='frm1_un_name'])[1]\n")).getText();
            System.out.println(text);
            Thread.sleep(2000);

            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

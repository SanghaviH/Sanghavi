package reletiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath_TextMethods {
    public static void main(String[] args){
        TextMethod();
}
//Text method Example
    public static void TextMethod() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            String text = chrome.findElement(By.xpath("//p[text()='Sample paragraphs One']")).getText();
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
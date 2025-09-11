package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1_username {
    public static void main(String[] args) {
        xpath1username();
    }

    //Xpath Locators Example
    public static void xpath1username() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName
            String text = chrome.findElement(By.xpath("/html/body/form[1]/input")).getText();
            System.out.println(text);
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            chrome = null;
        }
        }
}

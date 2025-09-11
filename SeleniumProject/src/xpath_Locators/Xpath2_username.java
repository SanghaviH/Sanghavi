package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2_username {
    public static void main(String[] args) {
        xpath2username();
    }

    //Xpath2 username Locators Example
    public static void xpath2username() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName
            String text = chrome.findElement(By.xpath("/html/body/form[2]/input[1]\n")).getText();
            System.out.println(text);
            Thread.sleep(2000);

            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            chrome = null;
        }
    }
}

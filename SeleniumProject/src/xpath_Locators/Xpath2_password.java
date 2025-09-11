package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2_password {
    public static void main(String[] args) {
        xpath2password();
    }

    //Xpath_password Locators Example
    public static void xpath2password() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter password
            String text = chrome.findElement(By.xpath("/html/body/form[2]/input[2]\n")).getText();
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



package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_userName {
    public static void main(String[] args) {
        childName();
    }
    public static void childName() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

           String text = chrome.findElement(By.xpath("//form[@id = 'frm1']/child::input")).getText();
           System.out.println(text);
           Thread.sleep(2000);

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
        }
    }

}

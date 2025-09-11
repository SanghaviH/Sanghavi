package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {
    public static void main(String[] args) {
        ancestor();
    }
    public static void ancestor() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using xpath enter userName and password
            String id = chrome.findElement(By.xpath("//input[@id='frm1_un_id']/ancestor::form")).getDomAttribute("id");
            System.out.println(id);
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}




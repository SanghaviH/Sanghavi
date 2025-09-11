package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_username {
    public static void main(String[] args)  {

    }
    public static void parentName() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            String text = chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/parent::form")).getText();
            System.out.println(text);
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
        }
    }
}

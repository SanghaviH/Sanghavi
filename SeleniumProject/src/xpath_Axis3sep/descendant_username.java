package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class descendant_username {
    public static void main(String[] args) {
        DescendantuserName();
    }

    public static void DescendantuserName() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");
           // chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");

           String id = chrome.findElement(By.xpath("//body/descendant::input[1]")).getDomAttribute("id");
           System.out.println(id);
           Thread.sleep(2000);

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            chrome = null;
        }
    }
}

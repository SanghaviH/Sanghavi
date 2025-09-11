package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class descendant_text {
    public static void main(String[] args) {

    }
    public static void descendant() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");
            //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");

            String text = chrome.findElement(By.xpath("//body/descendant::td[text()='Abdul Kalam']")).getDomAttribute("text");
            System.out.println(text);
            Thread.sleep(2000);

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
        }
    }
}

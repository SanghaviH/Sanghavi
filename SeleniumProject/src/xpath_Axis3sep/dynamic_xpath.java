package xpath_Axis3sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_xpath {
    public static void main(String[] args) {
       dynamic();
    }
    public static void dynamic() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");

            String text = chrome.findElement(By.xpath("//table[@id='table2']/tbody/tr/td[text()='\"+name+\"']")).getText();
             System.out.println(text);
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
        }
    }
}


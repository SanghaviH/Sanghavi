package cssSelector4sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nthChildConceptsIncssSelector {
    public static void main(String[] args) {
        xpathLocator();
    }
    public static void xpathLocator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //first child concept
            //chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("aaaaaaaaaa");
            //Thread.sleep(2000);

            //last child?
            //chrome.findElement(By.cssSelector("form[id='frm1']>:last-child")).sendKeys("aaaaaaaaaa");
            //Thread.sleep(2000);

            //middle child?
            chrome.findElement(By.cssSelector("form[id='frm1']>:nth-child(5)")).sendKeys("aaaaaaaaaa");
            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}


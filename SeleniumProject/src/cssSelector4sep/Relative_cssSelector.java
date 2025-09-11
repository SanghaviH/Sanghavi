package cssSelector4sep;

import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_cssSelector {
    public static void main(String[] args) {
       cssSelector();
    }


    public static void cssSelector() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using tag name?
            //chrome.findElement(By.cssSelector("input")).sendKeys("aaaaaaaaa");
            //Thread.sleep(2000);

            //using password?
            //chrome.findElement(By.cssSelector("a")).sendKeys("aaaaaaaaa");
            //Thread.sleep(2000);

            // using attribute name and value?
            // chrome.findElement(By.cssSelector("input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaa");
            //Thread.sleep(2000);

            //more than one attribute name and value?
            // chrome.findElement(By.cssSelector("input[id = 'frm1_un_id'][type = 'text']")).sendKeys("aaaaaaaaa");
            //Thread.sleep(2000);

            //using not logical operator?
            //chrome.findElement(By.cssSelector("a:not([target])")).click();
            // Thread.sleep(2000);

            // using regular expression?
            //chrome.findElement(By.cssSelector("*[id='frm1_un_id']")).sendKeys("aaaaaaaaaa");
            // Thread.sleep(2000);

            //using parent hierarchy?
            //chrome.findElement(By.cssSelector("form[id='frm1']>input[id='frm1_un_id']")).sendKeys("aaaaaaaaaa");
            //Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}


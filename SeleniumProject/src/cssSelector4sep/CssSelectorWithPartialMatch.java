package cssSelector4sep;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorWithPartialMatch {
    public static void main(String[] args) {
        partialMathch();
    }


    public static void  partialMathch() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //using cssSelector with partial matches?====starts with
            //chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaaa");
            //Thread.sleep(2000);

            //using cssSelector with partial matches?====endswith
            //chrome.findElement(By.cssSelector("input[id$='1_un_id']")).sendKeys("aaaaaaaaaa");
            //Thread.sleep(2000);

            //using  cssSelector with partial matches?======contains with
            //chrome.findElement(By.cssSelector("input[id*='1_un_id']")).sendKeys("aaaaaaaaaa");
            // Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}


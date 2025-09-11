package cssSelector4sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {
    public static void main(String[] args) {
        relative();
    }


    public static void relative() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();


            chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

            //to left of?---identify the username by traversing left direction from the password element
           // chrome.findElement(RelativeLocator.
                    //with(By.tagName("input"))
                   // .toLeftOf(By.xpath("//input[@id='frm1_pwd_id']"))).sendKeys("aaaaaaaaa");

            //to Right of?---identify the username by traversing left direction from the password element
            //chrome.findElement(RelativeLocator.with(By.tagName("input"))
                    //.toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");

            //above?
           // chrome.findElement(RelativeLocator.
                   // with(By.tagName("input")).
                   // above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");


            //below?
            chrome.findElement(org.openqa.selenium.support.locators.RelativeLocator.
                    with(By.xpath("//input[1]")).
                    below(By.xpath("//pre/b[contains(text(), 'Four')]"))).sendKeys("aaaaaaaaa");

            //near?
           // chrome.findElement(RelativeLocator.
                    //with(By.xpath("//input[1]")).
                   // near(By.xpath("////pre/b[contains(text(), 'Four')))).sendKeys("aaaaaaaaa");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
        }


package a_practice_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class reletivexpath {
    public static void main(String[] args) {
        Reletivexpath();
    }

public static void Reletivexpath() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");
       chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

        //using tagname first username?-----(samplewebtable)
        //chrome.findElement(By.xpath("//input")).sendKeys("aaaaaaaaaa");

        //using tagname first password?------(samplewebtable)
        //chrome.findElement(By.xpath("//input[2]")).sendKeys("aaaaaaaaa");

        //using tagname first link?----(samplwebproject)
        //chrome.findElement(By.xpath("//a")).click();

        //using attribute name and valuev?----(webproject)
        // chrome.findElement(By.xpath("//input[@id ='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
        // chrome.findElement(By.xpath("//input[@name = 'frm1_un_name']")).sendKeys("bbbbbbbbbbb");
        //chrome.findElement(By.xpath("//input[@placeholder = 'Enter UserName']")).sendKeys("cccccccccccccccc");


    }catch(Exception e) {
        e.printStackTrace();
    }finally {
        chrome = null;
    }
    }
}

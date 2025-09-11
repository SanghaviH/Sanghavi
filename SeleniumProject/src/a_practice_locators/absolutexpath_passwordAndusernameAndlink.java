package a_practice_locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath_passwordAndusernameAndlink {
    public static void main(String[] args) {
        xpathpassword();
    }
public static void xpathpassword() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

         //chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");
         // chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebTable.html");

        //First password?
        //chrome.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("aaaaaaaaaa");
        //chrome.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("bbbbbbbbbbbbbb");
        //chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[2]")).sendKeys("ccccccc");
        // chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@id='frm1_pwd_id']")).sendKeys("dddddddddddddddd");

        //UserName?
         //chrome.findElement(By.xpath("/html/body/form[2]/input[1]")).sendKeys("aaaaaaaaa");
        //chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[1]")).sendKeys("bbbbbbbbbbb");
        //chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[@id='frm1_un_id']")).sendKeys("cccccccc");

        //second password?
        //chrome.findElement(By.xpath("/html/body/form[2]/input[2]")).sendKeys("aaaaaaaaaa");
        //chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[2]")).sendKeys("bbbbbbbbbbbbbbb");
        //chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[@id='frm1_pwd_id']")).sendKeys("ccccccccc");

        //second link?
        //chrome.findElement(By.xpath("/html/body/a[2]"));
        // chrome.findElement(By.xpath("/html/body/a[@id = 'link1_id']"));
        //chrome.findElement(By.xpath("/html/body/a[@name ='link1_name']"));
    }catch(Exception e) {
        e.printStackTrace();
    }finally {
        chrome = null;
    }
}
}

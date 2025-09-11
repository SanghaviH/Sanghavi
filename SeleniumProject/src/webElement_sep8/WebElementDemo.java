package webElement_sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementDemo {
    public static void main(String[] args) {
        webElement();
    }

    //webElementDemo?
    public static void webElement() {
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");
            Thread.sleep(2000);

            WebElement oUserName = oBrowser.findElement(By.xpath("//input[@id = 'frm1_un_id']"));
            System.out.println(oUserName.getDomAttribute("placeholder"));
            Thread.sleep(2000);
            System.out.println(oUserName.getAttribute("value"));

            //=================================================================================
            List<WebElement> ochkBoxes = oUserName.findElements(By.xpath("//input[@type = 'checkbox']"));
            System.out.println("No.of checkBoxes:" + ochkBoxes.size());
            for (int i = 0; i < ochkBoxes.size(); i++) {
                ochkBoxes.get(i).click();
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }
}


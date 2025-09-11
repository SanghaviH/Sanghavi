package partialMatches;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starts_with {
    public static void main(String[] args) {
        Startwith();
    }
    //Start_with Example
        public static void Startwith() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/SampleWebProject.html");

                //using xpath enter userName and password
                chrome.findElement(By.xpath("//input[starts-with(@id,'frm1_un_i')]")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

                chrome.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }


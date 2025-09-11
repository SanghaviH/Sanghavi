package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment_sep9 {
    public static void main(String[] args) {
        demoqa();
    }
    public static void demoqa() {
        WebDriver oBrowser = null;
        try {
            // Navigate to the URL
            oBrowser.get("https://demoqa.com/upload-download");
            oBrowser.manage().window().maximize();

            // Locate the "Choose file" input element
            oBrowser.findElement(By.id("uploadFile")).sendKeys("filePath");
            Thread.sleep(2000);

            // Verify the uploaded file path is displayed
            WebElement uploadedFilePath = oBrowser.findElement(By.id("C:\\Users\\Admin\\OneDrive\\Desktop\\Assignment.au3"));
            String uploadedText = uploadedFilePath.getText();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }
}


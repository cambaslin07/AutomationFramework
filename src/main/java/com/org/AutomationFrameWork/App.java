package com.org.AutomationFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
//    	
//    	https://demoqa.com  
//    		Click on Elements  
//    		Get List of Items under Elements  
//    		Select Text Box  
//    		Enter details and submit the form  
//    		Fetch the output generated post submission and verify  
//    		 Click on Alerts, Frames & Windows   
//    		Click Frames  
//    		Get details from both the text box  
//    		Click Alerts  
//    		Click on ‘Click me’ next to On button click, confirm box will appear and fetch the output text generated in green, post click on respective button in pop up.  
//    		Click Browser Windows  
//    		Click on New Tab and get text from it.  
//    		has context menu
//
//
//    		has context menu
 WebDriver driver= new ChromeDriver();
 driver.get("https://demoqa.com");
 driver.manage().window().maximize();
 WebElement elements = driver.findElement(By.xpath("//h5[text()='Elements']"));
elements.click();

// List<WebElement> liElements = driver.findElements(By.xpath("//div[@class='element-list collapse show']"));
//    	
//
// WebElement textBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
// textBox.click();
// 
//		 WebElement userName = driver.findElement(By.id("userName"));
//		 userName.sendKeys("Tester");
//		 WebElement email = driver.findElement(By.id("userEmail"));
//		 email.sendKeys("Tester");
//		 WebElement cuAd = driver.findElement(By.id("currentAddress"));
//		 cuAd.sendKeys("Tester");
//		 
//		 WebElement perAd = driver.findElement(By.id("permanentAddress"));
//		 perAd.sendKeys("Tester");
//
//		 WebElement submit = driver.findElement(By.id("submit"));
//		 submit.click();
//		 
//		 WebElement name = driver.findElement(By.id("name"));
//		 System.out.println("OutPut: "+name.getText());
//		 WebElement emailtext = driver.findElement(By.id("email"));
//		 System.out.println("OutPut: "+emailtext.getText());
//		 WebElement crAd1 = driver.findElement(By.id("currentAddress"));
//		 System.out.println("OutPut: "+crAd1.getText());
//		 WebElement prAd1 = driver.findElement(By.id("permanentAddress"));
//		 System.out.println("OutPut: "+prAd1.getText());
//		 
//		 WebElement alert = driver.findElement(By.xpath("//div[@class='header-text'])[3]"));
//		 alert.click();
//		 WebElement frames = driver.findElement(By.xpath("//div[text()='Frames']"));
//		 frames.click();
//		 
//		 driver.switchTo().frame("frame1");
//		 System.out.println("output :"+driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText());		 		 
//		 driver.switchTo().frame("frame2");
//		 System.out.println("output :"+driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[2]")).getText());
//		 
//		 
//		 
		 
			
		 
       }
}

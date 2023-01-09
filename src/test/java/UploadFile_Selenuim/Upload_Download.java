package UploadFile_Selenuim;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Download {
	  public static void main(String[] args) throws IOException 
	   {
	      // Setting chrome driver path
	      WebDriverManager.chromedriver().setup();
	      // Launching and maximizing browser
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      // Launching URL
	      driver.get("file:///C://Users//Stestingo//Desktop//FileUpload.html");
	      // Locating input tag which as type as file.
	      WebElement searchBox= driver.findElement(By.id("files"));
	      // Sending file name as the argument to the input tag
	      searchBox.sendKeys("");
}}

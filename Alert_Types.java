package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/Alert.html");
		
		//1.Simple Alert:-
		WebElement alert = d.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alert.click();
		
		Alert alt = d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		//2.Confirm Alert:-
		WebElement calert = d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		calert.click();
		d.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//3.Prompt Alert:-
		WebElement palert = d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		palert.click();
		Thread.sleep(2000);
		
		Alert alt2 = d.switchTo().alert();
		alt2.sendKeys("Nice to meeting you");
		System.out.println(alt2.getText());
		alt2.accept();
		
		
	}

}

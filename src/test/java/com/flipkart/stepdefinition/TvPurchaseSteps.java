package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TvPurchaseSteps extends Commonactions{
	
	@When("user search tv and choose")
	public void user_search_mobiles_and_choose() {
		
	driver.findElement(By.name("q")).sendKeys("SAMSUNG tv",Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG')])[2]"));
	    String fn = mobileName.getText();
		System.out.println("Mobile Name is :"+fn);
		
		mobileName.click();
	    
	}

	@When("user add tv to addToCart and doing payment")
	public void user_add_mobile_to_addToCart_and_doing_payment() {
		
       String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			
			if(!x.equals(parent)){
				driver.switchTo().window(x);
				System.out.println("window switched");
			}
			
		}
	    
	}

}

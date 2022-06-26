package com.flipkart.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Each and every scenario");
		// launch
		c.launch();

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		if(scenario.isFailed()){
			
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
			
		}else{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}
		
		System.out.println("After Each and every scenario");
		//quit
		driver.quit();

	}
	
	//Before
	//Background
	//scenario
	//after

}

package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/select-menu");
//		driver.manage().window().maximize();
//		
//		WebElement element = driver.findElement(By.id("cars"));
//		
//		Select select = new Select(element);
//		
//		//To check that the dropDown in multi select or not
//		boolean multiple = select.isMultiple();
//		System.out.println(multiple);
//		
////		select.selectByIndex(0);
////		select.selectByIndex(1);
////		select.selectByIndex(2);
//		
//		List<WebElement> options = select.getOptions();
//		
//		//To select all the multiple options by using normal for loop
//		for (int i = 0; i < options.size(); i++) {
//			
//			select.selectByIndex(i);
//		}
//		
//		//To get the first select option
//		WebElement firstSelectedOption = select.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//		
//		//To get all the selected options
//		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//		
//		for (int i = 0; i < allSelectedOptions.size(); i++) {
//			
//			String text = allSelectedOptions.get(i).getText();
//			System.out.println(text);
//		}
//		
//		//To deSelect by index
//		select.deselectByIndex(1);
//		
//		//To deSelect all
//		select.deselectAll();
//		
//		//without using select class select a dropDown 
//		element.sendKeys("Volvo");
		
		
		
		Integer a[] = new Integer[2];
		a[0] = 10;
		a[1] = 20;
		
		
		//Method 1
		List li = new ArrayList();
		
		Collections.addAll(li, a);
		System.out.println(li);
		
		//Method 2
		List<Integer> asList = Arrays.asList(a);
		System.out.println(asList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main (String[] args) {
		System.setProperty ("webdriver.chrome.driver", "C:/Program Files/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get ("http://localhost");
		
		WebElement addInput1 = driver.findElement (By.id ("addInput1"));
		WebElement addInput2 = driver.findElement (By.id ("addInput2"));
		WebElement addButton = driver.findElement (By.id ("addButton"));
		
		WebElement subtractInput1 = driver.findElement (By.id ("subtractInput1"));
		WebElement subtractInput2 = driver.findElement (By.id ("subtractInput2"));
		WebElement subtractButton = driver.findElement (By.id ("subtractButton"));
		
		WebElement multiplyInput1 = driver.findElement (By.id ("multiplyInput1"));
		WebElement multiplyInput2 = driver.findElement (By.id ("multiplyInput2"));
		WebElement multiplyButton = driver.findElement (By.id ("multiplyButton"));
		
		WebElement divideInput1 = driver.findElement (By.id ("divideInput1"));
		WebElement divideInput2 = driver.findElement (By.id ("divideInput2"));
		WebElement divideButton = driver.findElement (By.id ("divideButton"));
		
		//add
		addInput1.sendKeys ("8");
		addInput2.sendKeys ("4");
		
		addButton.click ();
		
		driver.switchTo ().frame ("addResult");
		
		System.out.println ("Add result: " + driver.findElement (By.tagName ("pre")).getText ());
		
		driver.switchTo ().defaultContent ();
		
		//subtract
		subtractInput1.sendKeys ("10");
		subtractInput2.sendKeys ("5");
		
		subtractButton.click ();
		
		driver.switchTo ().frame ("subtractResult");
		
		System.out.println ("Subtract result: " + driver.findElement (By.tagName ("pre")).getText ());
		
		driver.switchTo ().defaultContent ();
		
		//multiply
		multiplyInput1.sendKeys ("6");
		multiplyInput2.sendKeys ("3");
		
		multiplyButton.click ();
		
		driver.switchTo ().frame ("multiplyResult");
		
		System.out.println ("Multiply result: " + driver.findElement (By.tagName ("pre")).getText ());
		
		driver.switchTo ().defaultContent ();
		
		//divide
		divideInput1.sendKeys ("9");
		divideInput2.sendKeys ("2");
		
		divideButton.click ();
		
		driver.switchTo ().frame ("divideResult");
		
		System.out.println ("Divide result: " + driver.findElement (By.tagName ("pre")).getText ());
		
		driver.switchTo ().defaultContent ();
		
		driver.quit ();
	}
}

package com.training.inter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractise {
	@FindBy(css="#add_to_cart>button")
	public WebElement btnAddToCart;
	
	public void clickOnAdd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/apttususer/automation/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		Thread.sleep(5000);
		WebElement quickView = driver.findElement(By.className("quick-view"));
		WebElement img = driver.findElement(By.cssSelector("[alt='Faded Short Sleeve T-shirts']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", img);
		Actions action = new Actions(driver);
		action.moveToElement(img).perform();
		quickView.click();
		WebElement frame = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(frame);
		PageFactory.initElements(driver, this);
		btnAddToCart.click();
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='Proceed to checkout']")));
		WebElement btnProceed = driver.findElement(By.cssSelector("[title='Proceed to checkout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", btnProceed);
	}
	
	public static void main(String[] args) throws InterruptedException {
		new AutomationPractise().clickOnAdd();
		
	}
	

}

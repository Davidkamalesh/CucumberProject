package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pojo.LoginPojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void launchbrower() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void pageTitle() {
		String getTitle = driver.getTitle();
		System.out.println(getTitle);

	}

	public static void toText(WebElement ele, String text) {
		ele.sendKeys(text);

	}

	public static void buttonclick(WebElement e) {
		e.click();

	}

	public static void printGetText(WebElement e) {
		String text = e.getText();
		System.out.println(text);

	}

	public static void toQuit() {
		driver.quit();

	}

	public static String toGetAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		System.out.println(attribute);
		return attribute;

	}

	public static void performMoveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void performDragandDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des);

	}

	public static void performDoubleClick(WebElement e) {
		a.doubleClick(e).perform();
	

	}

	public static void toPerformEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void date() {
		Date d = new Date();
		System.out.println(d);

	}

	public static void Pojo() {
		LoginPojo l = new LoginPojo();
	}
}

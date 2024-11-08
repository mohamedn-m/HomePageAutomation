package com.novalnet.utilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.novalnet.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class DriverActions {
	public static final long EXPLICIT_TIMEOUT = 30; //Long.parseLong(System.getProperty("EXPLICIT_TIMEOUT"));
	public static final long PAGE_LOAD_TIMEOUT = 60;//Long.parseLong(System.getProperty("PAGE_LOAD_TIMEOUT"));
	private static AtomicInteger count = new AtomicInteger(0);


	private static WebDriver driver() {
		return DriverManager.getDriver();
	}

	public static void openURL(String url) {
		driver().get(url);
		int currentCount = count.incrementAndGet();
		Log.info("Open URL : " + url);
		System.out.println(currentCount +": "+"Open URL : " + url);
		////waitForPageLoad();
	}

	public static void waitForTitleContains(String title) {
		try {
			WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(EXPLICIT_TIMEOUT), Duration.ofMillis(500));
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Throwable error) {
			Log.error("Timeout waiting for the title changes. " + title);
			Assert.fail("Timeout waiting for the title changes . " + title);
		}
	}

	public static boolean waitForAllElementLocated(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(EXPLICIT_TIMEOUT), Duration.ofMillis(500));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
			return true;
		} catch (Throwable error) {
			Log.error("Timeout waiting for the element Visible. " + by.toString());
			Assert.fail("Timeout waiting for the element Visible. " + by.toString());
			return false;
		}
	}

	public static List<WebElement> getElements(By by) {
		return driver().findElements(by);
	}

	public static WebElement getElement(By by) {
		return driver().findElement(by);
	}


	public static void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(PAGE_LOAD_TIMEOUT));


		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver webDriver) {
				return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
			}
		};

		wait.until(pageLoadCondition);
	}

	public static WebElement waitForElementToBePresent(By by) {
		WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(60));
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}

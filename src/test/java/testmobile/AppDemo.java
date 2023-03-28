package testmobile;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class AppDemo extends BaseTest {
	
	@Test
	public void openAlertDialog() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		String title = driver.findElement(By.className("android.widget.TextView")).getText();
		Assert.assertEquals(title, "App/Alert Dialogs");
		
	}
	
	@Test
	public void openDialogAndClickCancel() throws MalformedURLException, InterruptedException {
		
		driver.findElement(By.id("io.appium.android.apis:id/two_buttons")).click();
		Assert.assertTrue(driver.findElement(By.id("android:id/alertTitle")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("android:id/icon")).isDisplayed());
		driver.findElement(By.id("android:id/button2")).click();		
		
	}
	
	@Test
	public void openDialogAndClickOk() throws MalformedURLException, InterruptedException {
		
		driver.findElement(By.id("io.appium.android.apis:id/two_buttons")).click();
		Assert.assertTrue(driver.findElement(By.id("android:id/alertTitle")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("android:id/icon")).isDisplayed());
		driver.findElement(By.id("android:id/button1")).click();		
		
	}
	
	@Test
	public void openSecondDialogAndClickCancel() throws MalformedURLException, InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK Cancel dialog with a long message\"]")).click();
		String dialogTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(dialogTitle, "Header title");
		String dialogText = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertTrue(dialogText.contains("Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno."));
		driver.findElement(By.id("android:id/button2")).click();		
		
	}
	
	@Test
	public void openSecondDialogAndClickOk() throws MalformedURLException, InterruptedException {
		
		driver.findElement(By.id("io.appium.android.apis:id/two_buttons2")).click();
		String dialogTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(dialogTitle, "Header title");
		String dialogText = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertTrue(dialogText.contains("Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno."));
		driver.findElement(By.id("android:id/button1")).click();		
		
	}
	
	@Test
	public void openSecondDialogAndClickSomething() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
		String dialogTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(dialogTitle, "Header title");
		String dialogText = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertTrue(dialogText.contains("Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno."));
		driver.findElement(By.id("android:id/button3")).click();		
		
	}

}

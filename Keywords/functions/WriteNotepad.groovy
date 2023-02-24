package functions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.windows.driver.WindowsDriverFactory
import com.kms.katalon.core.windows.keyword.helper.WindowsActionHelper
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WriteNotepad {


	@Keyword
	def writeNotepad(String SKU) {

		WiniumDriver driver = null

		DesktopOptions option = new DesktopOptions()

		String appPath = 'C:\\Windows\\System32\\notepad.exe'

		option.setApplicationPath(appPath)

		option.setDebugConnectToRunningApp(false)

		option.setLaunchDelay(2)

		driver = new WiniumDriver(new URL('http://localhost:9999'), option)

		Thread.sleep(1000)

		driver.findElement(By.name('Text Editor')).sendKeys("Testing")

		driver.findElement(By.name("Text Editor")).sendKeys(Keys.chord(Keys.ENTER))

		driver.findElement(By.name('Text Editor')).sendKeys("SKU : " + SKU)

		driver.findElement(By.name('File')).click()

		driver.findElement(By.name('Save As...')).click()

		driver.findElement(By.name('File name:')).sendKeys("C:\\Users\\Charukeshi\\Downloads\\file1.txt")

		driver.findElement(By.name('Save')).click()

		driver.findElement(By.name('Close')).click()
	}
}

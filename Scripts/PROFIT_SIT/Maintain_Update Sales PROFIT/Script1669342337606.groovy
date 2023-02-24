import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://188.188.8.25:7777/VNM/profit/AD/Login.jsp')

WebUI.setText(findTestObject('Object Repository/AVN SIT/Page_PROFIT User Log-In/input_User ID_txtUsr_id'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/AVN SIT/Page_PROFIT User Log-In/input_Password_txtPassword'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT User Log-In/td_Profit Retail Management System (AEON AS_1b09d8'))

WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT User Log-In/input_Password_btnLogin'))

WebUI.switchToWindowTitle('PROFIT')

WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/img_PROFIT Menu_ALLExpand'))

WebUI.sendKeys(findTestObject('Object Repository/AVN SIT/Page_PROFIT/Body'), Keys.chord(Keys.CONTROL, "f"))

//WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/div_id(katalon-rec_elementInfoDiv)'))
//
//WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/td_PROFIT Menu_td-menuheader-bold'))
//
//WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/img_PROFIT Menu_ALLExpand'))

WebUI.click(findTestObject('Object Repository/AVN SIT/Page_PROFIT/a_Maintain Sales Transaction'))

WebUI.closeBrowser()


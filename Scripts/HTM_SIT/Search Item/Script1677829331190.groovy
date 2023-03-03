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

WebUI.navigateToUrl('https://htmsit.qragoracloud.com/htm-sit/login')

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/Page_Login/input_User ID_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/HTM ACMM SIT/Page_Login/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/div_Item'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/div_Item_1'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/span_Show Filter'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/input_Item Code_sku'), '40996')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/span_Search'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/a_Logout'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/Page_ACMM/a_Proceed'))

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('Object Repository/Test Run/Page_Login/input_User ID_username'), 'CHARU')

WebUI.click(findTestObject('Object Repository/Test Run/Page_Login/div_Password_agr-login-form-input agr-form-_d8e33f'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test Run/Page_Login/input_Password_password'), 'xTsg4YPAyO0wogawME6Ycw==')

WebUI.click(findTestObject('Object Repository/Test Run/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/Test Run/Page_ACMM/span_Item'))

WebUI.click(findTestObject('Object Repository/Test Run/Page_ACMM/div_Stock Availability'))

WebUI.click(findTestObject('Object Repository/Test Run/Page_ACMM/ul_Store_select2-selection__rendered'))

WebUI.setText(findTestObject('Object Repository/Test Run/Page_ACMM/input_Store_select2-search__field'), '0001')


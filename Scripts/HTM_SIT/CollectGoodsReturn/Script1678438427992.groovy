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

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_Login/input_User ID_username'), 'CHARU')

WebUI.setEncryptedText(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_Login/input_Password_password'), 'xTsg4YPAyO0wogawME6Ycw==')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/span_Goods Return'))

//WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/MenuBtn'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/div_Collect'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/input_Store_returnStoreDisplay'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/input_Store_returnStoreDisplay'), '0002')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/input_Return Number_returnNumber'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/input_Return Number_returnNumber'), '5')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/a_Search'))

try {
	
WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/input_Status_ticker agr-checkbox-style'))

String status_C = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/i_Status_agr-display-inline icon-edit tpz-f_5c6252'))

System.out.println('Collect Status : ' + status_C)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/a_Logout'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/CollectGRN/Page_ACMM/a_Proceed'))

}
catch (Exception e) {
	
	String header = "Return Note not Found"

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/body_Home                                  _72c581'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Logout'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Proceed'))
	
}
finally {
	WebUI.closeBrowser()
}


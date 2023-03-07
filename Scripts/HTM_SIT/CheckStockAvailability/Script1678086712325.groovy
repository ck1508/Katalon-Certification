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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_User ID_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/div_Item'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/div_Stock Availability'))

try {
	
		String item = item
		String store = store
		String businessUnit = businessUnit
		String region = region
		String priceZone = priceZone	
		
		if (item.length() == 5) {
			
			WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Item Code_select2-search__field'),
				item)
		
			WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Item Code_select2-search__field'),
				Keys.chord(Keys.ENTER))
		}
		
		if (store.length() == 4) {
			
			
			WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Store_select2-search__field'),
				store)
		
			WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Store_select2-search__field'),
				Keys.chord(Keys.ENTER))

		}
		
		if (businessUnit.length() == 2) {
	
			WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Business Unit_select2-search__field'),
				businessUnit)
		
			WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Business Unit_select2-search__field'),
				Keys.chord(Keys.ENTER))

		}
		
		if (region.length() == 3) {
		
			WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Region_select2-search__field'),
				region)
			
			WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Region_select2-search__field'),
				Keys.chord(Keys.ENTER))

		}
		
		if (priceZone.length() == 1) {
			
			WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Price Zone_select2-search__field'),
				priceZone)
			
			WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/input_Price Zone_select2-search__field'),
				Keys.chord(Keys.ENTER))

		}
			

    WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/span_Search'))

    String Head1 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity Inventory'))

    String Val1 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_40.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head1, Val1)

    String Head2 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity On Hand'))

    String Val2 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_40.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head2, Val2)

    String Head3 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity On Order'))

    String Val3 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_56.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head3, Val3)

    String Head4 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity Forecast'))

    String Val4 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_6.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head4, Val4)

    String Head5 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity Allocated'))

    String Val5 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_0.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head5, Val5)

    String Head6 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity Available'))

    String Val6 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_40.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head6, Val6)

    String Head7 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity On Order Allocation To Store'))

    String Val7 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_6.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head7, Val7)

    String Head8 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/th_Quantity Available To Promise'))

    String Val8 = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/td_96.000000'))

    CustomKeywords.'functions.Print.GetStockAvailability'(Head8, Val8)

    CustomKeywords.'functions.Print.PrintStockAvailability'()


}
catch (Exception e) {
    System.out.println('\nItem not Found\n')

    WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/body_Home                                  _72c581'))

    WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

    WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Logout'))

    WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Proceed'))
} 
finally { 
    WebUI.closeBrowser()
}


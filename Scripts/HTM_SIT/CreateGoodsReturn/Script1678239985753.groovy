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

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Goods Return'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/div_Create'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Add New'))

try {

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Store_storeDisplay'), '0003')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Group_itemGroupDisplay'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Group_itemGroupDisplay'), '1')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Supplier_supplierDisplay'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Supplier_supplierDisplay'), '0000000006')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Supplier Contract_supplierContractDisplay'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Supplier Contract_supplierContractDisplay'), 
    'MD-00002 - CCY')

//MD-00002 - CCY

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Exp Collection Date_supplierCollectionDate'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/button_Today'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Reason_reasonDisplay'), 'EXCH - EXCHANGE')

if(WebUI.verifyTextPresent("Error", false, FailureHandling.OPTIONAL) == true) {
	
	String header = "Failed to create Goods Return"
	
	String msg = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/ErrorMessage'))
	CustomKeywords.'functions.Print.GetStockAvailability'(header, msg)
	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/ErrorMessage'))
	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/CloseErrorMessage'))
	CustomKeywords.'functions.Print.PrintErrorMessage'()
}


WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Next'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Next'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Action_detList0.item'), '41001')

WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Action_detList0.item'), Keys.chord(
        Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/tr_1Advanced SearchCOCONUT SHAMPOO D1UNITCo_170880'))

//WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'))
//
//WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'))
//
//WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'), '2')

//WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'), Keys.chord(
//	Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceNumber'), 
    'INV2023031302')

//System.out.println(java.time.LocalDate.now());

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceDate'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/i_UNIT_icon-calendar plc-fnt3 agr-margin-right-5'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/a_8'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.batchNumber'), 'CK001')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.expiryDate'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceDate'), '2023-03-13')

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.expiryDate'), '2024-03-13')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'))

WebUI.sendKeys(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'), '2')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceNumber'))

WebUI.delay(5)

String unitCost = WebUI.getAttribute((findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.unitCost')),'value')

System.out.println('Unit Cost : ' + unitCost)

//WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.unitCost'), '5.4')

String totalCost = WebUI.getAttribute((findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/TotalCost')),'value')

System.out.println('Total Cost : ' + totalCost)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/td_UNIT_text-right'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/div_Create_1'))

String successMsg = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Return Number 68 is saved successfully'))

String returnNo = successMsg.replaceAll("[^0-9]", "")

System.out.println('Return No : ' + returnNo)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Filter  Search'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Store_returnStoreDisplay'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/div_Filter  Search                         _21deaa'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Store_returnStoreDisplay'), '0003')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Return Number_returnNumber'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Return Number_returnNumber'), returnNo)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Search'))

String status = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/i_Status_agr-display-inline icon-edit tpz-f_5c6252'))

System.out.println('Initial Status : ' + status)

//WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/GRN'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/edit_GRN'))

WebUI.scrollToElement(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.unitCost'), 3)

String qty = WebUI.getAttribute(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'), 'value')

System.out.println('Quantity : ' + qty)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.quantity'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceNumber'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.invoiceDate'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.batchNumber'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.expiryDate'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_UNIT_detList0.unitCost'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Complete'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Status_ticker agr-checkbox-style'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/a_Submit'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/a_Proceed'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Filter  Search'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Store_returnStoreDisplay'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/div_Filter  Search                         _21deaa'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Store_returnStoreDisplay'), '0003')

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Return Number_returnNumber'))

WebUI.setText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/input_Return Number_returnNumber'), returnNo)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/span_Search'))

String statusAfter = WebUI.getText(findTestObject('Object Repository/HTM ACMM SIT/GoodsReturn/Page_ACMM/i_Status_agr-display-inline icon-edit tpz-f_5c6252'))

System.out.println('Latest Status : ' + statusAfter)

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/body_Home                                  _72c581'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Logout'))

WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Proceed'))


}

catch (Exception e) {
	
	String header = "Failed to create Goods Return"

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/body_Home                                  _72c581'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/i_Charukeshi_agr-display-inline icon-settin_f72da6'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Logout'))

	WebUI.click(findTestObject('Object Repository/HTM ACMM SIT/StockAvailability/Page_ACMM/a_Proceed'))
	
}
finally {
	WebUI.closeBrowser()
}


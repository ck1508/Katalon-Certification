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

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'xTsg4YPAyO0wogawME6Ycw==')

WebUI.click(findTestObject('Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Page_ACMM/span_Goods Return'))

WebUI.click(findTestObject('Page_ACMM/div_Create'))

WebUI.click(findTestObject('Page_ACMM/div_Add New'))

WebUI.setText(findTestObject('Page_ACMM/input_Store_storeDisplay'), '1')

WebUI.click(findTestObject('Page_ACMM/div_0001 - (PHMA) PHARMACY A'))

WebUI.setText(findTestObject('Page_ACMM/input_Store_storeDisplay'), '0001 - (PHMA) PHARMACY A')

WebUI.click(findTestObject('Page_ACMM/div_(PHMA) PHARMACY A_blockUI blockOverlay'))

WebUI.click(findTestObject('Page_ACMM/div_Supplier Contract'))

WebUI.setText(findTestObject('Page_ACMM/input_Group_itemGroupDisplay'), '1')

WebUI.click(findTestObject('Page_ACMM/div_1 - MERCHANDISE'))

WebUI.setText(findTestObject('Page_ACMM/input_Group_itemGroupDisplay'), '1 - MERCHANDISE')

WebUI.setText(findTestObject('Page_ACMM/input_Supplier_supplierDisplay'), '6')

WebUI.click(findTestObject('Page_ACMM/div_0000000006 - CCY TESTING SDN BHD'))

WebUI.setText(findTestObject('Page_ACMM/input_Supplier_supplierDisplay'), '0000000006 - CCY TESTING SDN BHD')

WebUI.click(findTestObject('Page_ACMM/input_Supplier Contract_supplierContractDisplay'))

WebUI.doubleClick(findTestObject('Page_ACMM/input_Supplier Contract_supplierContractDisplay'))

WebUI.setText(findTestObject('Page_ACMM/input_Supplier Contract_supplierContractDisplay'), '2')

WebUI.click(findTestObject('Page_ACMM/div_MD-00002 - CCY'))

WebUI.setText(findTestObject('Page_ACMM/input_Supplier Contract_supplierContractDisplay'), 'MD-00002 - CCY')

WebUI.click(findTestObject('Page_ACMM/input_Exp Collection Date_supplierCollectionDate'))

WebUI.doubleClick(findTestObject('Page_ACMM/input_Exp Collection Date_supplierCollectionDate'))

WebUI.click(findTestObject('Page_ACMM/button_Today'))

WebUI.setText(findTestObject('Page_ACMM/input_Reason_reasonDisplay'), 'EX')

WebUI.click(findTestObject('Page_ACMM/div_EXCH - EXCHANGE'))

WebUI.setText(findTestObject('Page_ACMM/input_Reason_reasonDisplay'), 'EXCH - EXCHANGE')

WebUI.click(findTestObject('Page_ACMM/span_Next'))

WebUI.setText(findTestObject('Page_ACMM/input_Action_detList0.item'), '41001')

WebUI.click(findTestObject('Page_ACMM/div_41001 - COCONUT SHAMPOO D'))

WebUI.setText(findTestObject('Page_ACMM/input_Action_detList0.item'), '41001')

WebUI.click(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'))

WebUI.click(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'))

WebUI.click(findTestObject('Page_ACMM/input_UNIT_detList0.invoiceNumber'))

WebUI.click(findTestObject('Page_ACMM/tr_1Advanced SearchCOCONUT SHAMPOO D1UNITCo_170880'))

WebUI.setText(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'), '2')

WebUI.click(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'))

WebUI.click(findTestObject('Page_ACMM/tr_1Advanced SearchCOCONUT SHAMPOO D1UNITCo_170880'))

WebUI.setText(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'), '10')

WebUI.click(findTestObject('Page_ACMM/td_UNIT_text-right'))

WebUI.setText(findTestObject('Page_ACMM/input_UNIT_detList0.invoiceNumber'), 'INV2023030802')

WebUI.click(findTestObject('Page_ACMM/td_UNIT_text-right'))

WebUI.setText(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'), '100')

WebUI.click(findTestObject('Page_ACMM/td_UNIT_text-right'))

WebUI.click(findTestObject('Page_ACMM/tr_1Advanced SearchCOCONUT SHAMPOO D1UNITCo_170880'))

WebUI.setText(findTestObject('Page_ACMM/input_UNIT_detList0.quantity'), '30')

WebUI.click(findTestObject('Page_ACMM/td_UNIT_text-right'))

WebUI.click(findTestObject('Page_ACMM/span_Create'))

WebUI.click(findTestObject('Page_ACMM/a_Status_input-link agr-display-inline'))

WebUI.click(findTestObject('Page_ACMM/i_Status_agr-display-inline icon-edit tpz-f_5c6252'))

WebUI.click(findTestObject('Page_ACMM/div_Complete'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()


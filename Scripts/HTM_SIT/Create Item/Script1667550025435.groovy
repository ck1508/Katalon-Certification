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

WebUI.navigateToUrl('https://alprosit.qragoracloud.com/alpro-sit/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_User ID_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Login/a_Login'))

WebUI.switchToWindowTitle('ACMM')

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Item'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/div_Item'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/div_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Class_itemHierarchyForm.clazzDisplay'), '1010')

WebUI.click(findTestObject('Object Repository/Page_ACMM/input_Sub-Class_itemHierarchyForm.subclassDisplay'))

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Sub-Class_itemHierarchyForm.subclassDisplay'), '101000')

WebUI.click(findTestObject('Object Repository/Page_ACMM/input_Class_itemHierarchyForm.clazzDisplay'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_MandatoryGeneralWeighingVariantsPost_d44cf2'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Item Description_itemNameForm.productName'), 'SHAMPOO TEST 3')

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Procurement Officer_itemNameForm.buye_7cac70'), 'CK1508')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_MandatoryHQ Main WHHQ Sub WHSub WH O_9c4e63'), 
    'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_PREMIUMEXCLUSIVENO INCENTIVE'), 'no_inc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_MandatoryBy AIR (Standard)By OCEAN (_50da7d'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_MandatoryBy AIR (if urgent)By OCEAN _c0219a'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_MandatoryNo ControlBatch and Expiry _c38986'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACMM/select_Mandatory1M2M3M4M5M6M7M8M9M10M12MEXNANR'), 
    '1M', true)

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Package Weight_itemFeatureForm.packageWeight'), '1')

WebUI.click(findTestObject('Object Repository/Page_ACMM/div_Package Weight                    Weigh_9ad3ce'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Next  Selling Price'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/input_Recommended Selling Price_setMarketSellPrice'))

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Recommended Selling Price_setMarketSellPrice'), '015.4')

WebUI.click(findTestObject('Object Repository/Page_ACMM/input_Recommended Selling Price_setMarketSellPrice'))

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Member Price_setStandardSellPrice'), '015')

WebUI.click(findTestObject('Object Repository/Page_ACMM/input_Non Member Price_setInternationalPrice'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Apply All Price Zone'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Next  Supplier'))

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Supplier_itemSupplierForm.supplierDisplay'), '0000000002 - DKSH HOLDINGS (MALAYSIA) BERHAD (231378-A)')

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Unit Cost Excl. Tax_itemSupplierForm._785183'), '9.2')

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Next  Store Inventory'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Safety Stock_setReorderQuantity'), '020')

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Set - Safety'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_ACMM/input_Reorder Qty_setReorderQuantity'), '030')

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Set - Reorder'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Save  Store Inventory'))

String SKU = WebUI.getText(findTestObject('Object Repository/Page_ACMM/span_100088004 - COCONUT SHAMPOO'))

System.out.println(('\nNewly created item : ' + SKU) + '\n')

CustomKeywords.'functions.WriteNotepad.writeNotepad'(SKU)

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Show Filter'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/i_charu_agr-display-inline icon-settings tpz-fnt2'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_ACMM/a_Proceed'))

WebUI.closeBrowser()


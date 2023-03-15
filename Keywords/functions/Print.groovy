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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Print {

	public static List<String> headerList = new ArrayList<String>();
	public static List<String> valueList = new ArrayList<String>();


	@Keyword
	def GetStockAvailability(String Header, String Value) {

		Print.headerList.add(Header)
		Print.valueList.add(Value)
	}


	@Keyword
	def PrintStockAvailability() {

		System.out.println('\nStock Availability')
		System.out.println('-----------------------------------------------------------------')

		for (int i = 0; i < headerList.size(); i++) {
			String header = headerList.get(i)
			String value = valueList.get(i)
			//System.out.println(((('\n' + header) + ' = ') + value) + '\n')
			System.out.println(header + ' = ' + value)
		}

		System.out.println('\n')
	}


	@Keyword
	def PrintErrorMessage() {

		System.out.println('\n' + headerList.get(0))
		System.out.println('-----------------------------------------------------------------')

		for (int i = 0; i < valueList.size(); i++) {

			String value = valueList.get(i)
			System.out.println('Error : ' + value)
		}

		System.out.println('\n')
	}
}

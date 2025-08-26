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

WebUI.callTestCase(findTestCase('Basic/Open to get url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Basic/Auth_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Page/admin_page_button'))

WebUI.verifyElementPresent(findTestObject('Admin Page/admin_page_title'), 5)

WebUI.click(findTestObject('Admin Page/button_select_user_role'))

WebUI.click(findTestObject('Admin Page/admin_role_option', [('optionName') : 'Admin']))

WebUI.click(findTestObject('Admin Page/button_select_status'))

WebUI.click(findTestObject('Admin Page/disabled_status', [('optionName') : 'Disabled']))

WebUI.click(findTestObject('Admin Page/button_search'))

WebUI.verifyElementVisible(findTestObject('Admin Page/verify_list_admin_roleUser'))

WebUI.verifyElementVisible(findTestObject('Admin Page/verify_list_disabled_status_role'))

WebUI.callTestCase(findTestCase('Basic/Close browser'), [:], FailureHandling.STOP_ON_FAILURE)


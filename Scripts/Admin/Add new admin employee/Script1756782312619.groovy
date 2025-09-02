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

String randomUsername = CustomKeywords.'myPackage.MyKeywords.generateRandomUsername'(3)
String randomPassword = CustomKeywords.'myPackage.MyKeywords.generateRandomPassword'(8)

WebUI.callTestCase(findTestCase('Basic/Auth_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Page/admin_page_button'))

WebUI.verifyElementPresent(findTestObject('Admin Page/admin_page_title'), 5)

WebUI.click(findTestObject('Admin Page/Add new/button_add new'))

WebUI.click(findTestObject('Admin Page/Add new/select_user_role'))

WebUI.click(findTestObject('Admin Page/Add new/select_option', [('optionName') : 'Admin']))

WebUI.click(findTestObject('Admin Page/Add new/Input_employeeName'))

WebUI.sendKeys(findTestObject('Admin Page/Add new/Input_employeeName'), 'Sam')

WebUI.click(findTestObject('Admin Page/Add new/select_option', [('optionName') : 'Jobin Mathew Sam']))

WebUI.click(findTestObject('Admin Page/Add new/select_status'))

WebUI.click(findTestObject('Admin Page/Add new/select_option', [('optionName') : 'Disabled']))

WebUI.click(findTestObject('Admin Page/Add new/input_username'))

WebUI.sendKeys(findTestObject('Admin Page/Add new/input_username'), randomUsername)

WebUI.click(findTestObject('Admin Page/Add new/input_password'))

WebUI.sendKeys(findTestObject('Admin Page/Add new/input_password'), randomPassword)

WebUI.click(findTestObject('Admin Page/Add new/input_confirmPassword'))

String passwordValue = WebUI.getAttribute(findTestObject('Admin Page/Add new/input_password'), 'value')
WebUI.sendKeys(findTestObject('Admin Page/Add new/input_confirmPassword'), passwordValue)

WebUI.click(findTestObject('Admin Page/Add new/button_save'))

String actualValue = WebUI.getAttribute(findTestObject('Admin Page/Add new/input_username'), 'value')
WebUI.verifyMatch(actualValue, randomUsername, false)


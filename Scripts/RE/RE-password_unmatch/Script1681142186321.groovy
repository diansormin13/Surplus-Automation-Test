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

Mobile.startApplication('C:\\Users\\hp\\Downloads\\Test.apk', false)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - ME'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Log In'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Log In and register'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Agree and continue'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - New User Registration'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Username'), 'qwer123', 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Email'), 'diansormin@gmail.com', 0, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Object Repository/Register/android.widget.EditText - Password'), '123456qwerty')

Mobile.sendKeys(findTestObject('Object Repository/Register/android.widget.EditText - Confirm Password'), '123456')

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - MENDAFTAR'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/RE-Invalid/android.widget.TextView - Passwords dont match'), 'Passwords dont match.')





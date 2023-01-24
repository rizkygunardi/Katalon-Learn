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

Mobile.startApplication('/Users/rizky/Katalon Studio/Eduwork/Mobile Apps/Happy Day Shopping.apk', true)

Mobile.tap(findTestObject('Object Repository/FlashSale/View FlashSale'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/FlashSale/View Product'), 0)

Mobile.setText(findTestObject('Object Repository/FlashSale/Add Product'), '5', 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/button - Buy Product'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/button - Cast'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/button - Checkout'), 0)

Mobile.scrollToText('Download our App!', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('FlashSale/android.view.View - Download our App'), 0)

Mobile.closeApplication()


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
WebUI.navigateToUrl('https://www.amazon.com/b/?ie=UTF8&node=16225007011&ext=6886-37481&ref=pd_sl_7nnedyywlk_e&tag=googleglobalp-20&hvpos=&hvnetw=g&hvrand=15128156934707359843&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1000003&hvtargid=kwd-10573980&tag=googleglobalp-20&ref=pd_sl_7nnedyywlk_e&adgrpid=82342659060&hvpone=&hvptwo=&hvadid=585475370855&hvpos=&hvnetw=g&hvrand=15128156934707359843&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1000003&hvtargid=kwd-10573980&hydadcr=2246_13468515')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Amazon OR/input_Angola_a-button-input'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Clinic'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Customer Service'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Best Sellers'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Amazon Basics'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_New Releases'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Todays Deals'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Music'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Books'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Registry'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Fashion'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Amazon Home'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_Gift Cards'))
WebUI.click(findTestObject('Object Repository/Amazon OR/a_One Medical'))


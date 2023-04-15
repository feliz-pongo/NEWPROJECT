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
import org.openqa.selenium.Keys
import org.openqa.selenium.remote.server.handler.MaximizeWindow as Keys

WebUI.openBrowser('https://www.jornaldeangola.ao/ao/noticias/index.php?tipo=1&idSec=20')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/JR/a_REGIES'))
WebUI.click(findTestObject('Object Repository/JR/a_SOCIEDADE'))
WebUI.click(findTestObject('Object Repository/JR/a_ECONOMIA'))
WebUI.click(findTestObject('Object Repository/JR/a_CULTURA'))
WebUI.click(findTestObject('Object Repository/JR/a_DESPORTO'))
WebUI.click(findTestObject('Object Repository/JR/a_ENTREVISTA'))
WebUI.click(findTestObject('Object Repository/JR/a_REPORTAGEM'))
WebUI.click(findTestObject('Object Repository/JR/a_OPINIO'))
WebUI.click(findTestObject('Object Repository/JR/a_MUNDO'))
WebUI.click(findTestObject('Object Repository/JR/a_ASSINATURAS'))

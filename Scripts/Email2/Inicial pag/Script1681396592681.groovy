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
WebUI.openBrowser('https://mail.google.com/mail/u/0/#inbox')
WebUI.sendKeys(findTestObject('Object Repository/EnviarEmail2/input_Continuar para o Gmail_identifier'), 'felizpongo980@gmail.com')
WebUI.click(findTestObject('Object Repository/EnviarEmail2/span_Criar conta'))
WebUI.click(findTestObject('Object Repository/EnviarEmail2/span_Para a minha utilizao pessoal'))
WebUI.sendKeys(findTestObject('Object Repository/EnviarEmail2/input_Introduza o seu nome_firstName'), 'Pedro')
WebUI.sendKeys(findTestObject('Object Repository/EnviarEmail2/input_Introduza o seu nome_lastName'), 'Manuel')



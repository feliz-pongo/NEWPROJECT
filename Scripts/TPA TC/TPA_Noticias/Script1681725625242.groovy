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

WebUI.openBrowser('https://www.tpa.ao/ao/noticias/index.php?tipo=1&idSec=96')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TPA OR/a_A NOITE  DELA'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Notcias'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Cincia'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Sociedade'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_NA LENTE'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_COVID-19'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Cultura'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Curiosidades'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Curso Culinria'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Desporto'))

WebUI.click(findTestObject('Object Repository/TPA OR/a_Poltica'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_OUTROS'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Economia'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Educao'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Moda'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Ensino'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Justia'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Entrevistas'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Tecnologia'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_GRANDE ENTREVISTA'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Internacional'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_JANELA ABERTA'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Sade'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_JORNAL DA TARDE'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_Desenvolvimento Humano'))
WebUI.click(findTestObject('Object Repository/TPA OR/a_CULINRIA'))




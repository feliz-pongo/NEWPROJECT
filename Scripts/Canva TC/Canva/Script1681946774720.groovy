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
WebUI.navigateToUrl('https://www.google.com/search?q=natgeo&rlz=1C1GCEU_pt-PTAO1024AO1024&oq=natgeo&aqs=chrome..69i57j0i512l7j0i10i512j0i512.5980j0j7&sourceid=chrome&ie=UTF-8')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Canva OR/div_Onde assistir o canal National Geographic_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/div_Como assistir National Geographic pelo celular_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/div_Quanto custa National Geographic_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/div_O que significa natgeo_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/div_Tem National Geographic na Netflix_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/div_O que aconteceu com National Geographic_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Canva OR/textarea_natgeo'))
WebUI.click(findTestObject('Object Repository/Canva OR/b_National Geographic Brasil'))
WebUI.click(findTestObject('Object Repository/Canva OR/a_Imagens'))
WebUI.click(findTestObject('Object Repository/Canva OR/a_Notcias'))

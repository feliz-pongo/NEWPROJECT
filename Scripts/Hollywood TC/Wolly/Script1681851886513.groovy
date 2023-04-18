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

WebUI.openBrowser('https://www.google.com/search?q=hollywood&rlz=1C1GCEU_pt-PTAO1024AO1024&hl=pt-PT&sxsrf=APwXEdc1tBfjYyvoDn2oHZ9NE6d90-zspA:1681851809166&source=lnms&sa=X&ved=2ahUKEwj0wpmdqrT-AhWadcAKHYJABMAQ_AUoAHoECAEQAg&biw=1536&bih=754&dpr=1.25')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Holly OR/a_Imagens'))
WebUI.click(findTestObject('Object Repository/Holly OR/a_Vdeos'))
WebUI.click(findTestObject('Object Repository/Holly OR/span_Tudo'))





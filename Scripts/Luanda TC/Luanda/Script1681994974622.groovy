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
WebUI.navigateToUrl('https://www.google.com/search?q=Luanda&rlz=1C1GCEU_pt-PTAO1024AO1024&sxsrf=APwXEdd0aMAqnoysAwEjTBBWF_WEJkvZaQ%3A1681994809192&ei=OTRBZOy0C9WXxc8PjrmHqAk&ved=0ahUKEwistfb4vrj-AhXVS_EDHY7cAZUQ4dUDCBA&uact=5&oq=Luanda&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIECC4QJzIOCC4QgwEQ1AIQsQMQgAQyEQguEIMBEK8BEMcBELEDEIAEMgUIABCABDILCAAQgAQQsQMQgwEyBQgAEIAEMgQIABADMgUIABCABDIFCAAQgAQyCwguEIAEEMcBEK8BMg0ILhDcBBDeBBDgBBgBOg4ILhCKBRCxAxCDARDUAjoLCC4QigUQsQMQgwE6BAguEAM6CwgAEIoFELEDEIMBOg4ILhCDARDUAhCxAxCKBToRCC4QgAQQsQMQgwEQxwEQrwE6CAguEIoFELEDOgsILhCABBCxAxCDAToNCAAQigUQsQMQgwEQQzoHCC4QigUQQzoHCAAQigUQQzoFCC4QgARKBAhBGABQAFiEF2DJG2gAcAB4AIABqgKIAZ0NkgEDMi02mAEAoAEBwAEB2gEGCAEQARgU&sclient=gws-wiz-serp')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Luanda OR/div_bom morar em Luanda_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Luanda OR/div_Porque Luanda  a cidade mais cara do mundo_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Luanda OR/div_Quem nasce em Luanda  chamado de_L3Ezfd'))
WebUI.click(findTestObject('Object Repository/Luanda OR/div_Quanto custa viver em Luanda_L3Ezfd'))


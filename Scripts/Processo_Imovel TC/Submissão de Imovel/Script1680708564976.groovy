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

WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Patrimnio'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Cadastro'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Prdio'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Urbano'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Propriedade Total'))

WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/div_REGIME JURDICO'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/div_IDENTIFICAO DO DECLARANTE'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_ui-button_1'))
WebUI.sendKeys(findTestObject('Object Repository/Processo_Sub_Imovel/input_Nome do Contribuinte_frmSearchNIFBranchedialogSearchNIF-nameInput'), 'MARCOS')
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Pesquisar'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/td_ADHEMAR MARCOS'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/na_qualidade_de'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/li_Tcnico de Impostos'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/div_IDENTIFICAO DO IMVEL'))
WebUI.sendKeys(findTestObject('Object Repository/Processo_Sub_Imovel/input_Nome da Propriedade_frmPatrimonytvSuporteaccPrincipalpropertyName'), 'TESTE')

WebUI.sendKeys(findTestObject('Object Repository/Processo_Sub_Imovel/Valor Declarado (Kz)_frmPatrimonytvSuporteaccPrincipaldeclaredValue_input'),'Keys.chord(Keys.BACK_SPACE' )
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/div_IDENTIFICAO DE TITULARES'))

WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/span_Novo Titular'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/titular_NIF_ui-button-icon-left ui-icon ui-c fa fa-search'))
WebUI.sendKeys(findTestObject('Object Repository/Processo_Sub_Imovel/Nome_YURI do Contribuinte_frmSearchNIFBranchedialogSearchNIF-nameInput'), 'YURI')
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/titular_Pesquisar'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/td_ERNESTO YURI'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/icone_responsavel'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/tipo_direito'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/titular_Proprietrio'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/titular_Adicionar'))
WebUI.click(findTestObject('Object Repository/Processo_Sub_Imovel/div_ISENO'))




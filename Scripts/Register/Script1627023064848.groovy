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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('https://stg.main.halosis.co.id/DhHnpW')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Toko1/Masuk'))

WebUI.click(findTestObject('Page_Toko1/Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Toko1/Nama Sesuai KTP'), 'aaa')

WebUI.setText(findTestObject('Page_Toko1/Email'), 'firman22@gmail.com')

WebUI.setText(findTestObject('Page_Toko1/Password'), 'P@ssw0rd')


WebUI.setText(findTestObject('Page_Toko1/Password Konfirmasi'), 'P@ssw0rd')

WebUI.click(findTestObject('Page_Toko1/daftar 2'))

WebUI.delay(3)

String namaunvalid = WebUI.verifyTextPresent('Masukkan nama yang valid', false, FailureHandling.OPTIONAL)

String emailkosong = WebUI.verifyTextPresent('*wajib diisi', false, FailureHandling.OPTIONAL)

String emailunvalid = WebUI.verifyTextPresent('Format email tidak valid', false, FailureHandling.OPTIONAL)

String passwordsalah = WebUI.verifyTextPresent('Masukkan minimal 8 karakter', false, FailureHandling.OPTIONAL)

String passwordtidaksesuai = WebUI.verifyTextPresent('Konfirmasi password tidak sama', false, FailureHandling.OPTIONAL)

if (namaunvalid == 'true') {
    KeywordUtil.markFailed('Gagal')
if (emailkosong == 'true') {
	KeywordUtil.markFailed('Gagal')
if (emailunvalid == 'true') {
	KeywordUtil.markFailed('Gagal')
if (passwordsalah == 'true') {
	KeywordUtil.markFailed('Gagal')
if (namaunvalid == 'true') {
	passwordtidaksesuai.markFailed('Gagal')
	
} else {
    KeywordUtil.markPassed('Login Berhasil')
}}}}}


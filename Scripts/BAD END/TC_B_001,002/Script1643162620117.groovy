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

'เข้าเว็บ, เข้าหน้าล็อคอิน'
WebUI.callTestCase(findTestCase('Open WEB'), [:], FailureHandling.STOP_ON_FAILURE)

'ใส่ Username'
WebUI.setText(findTestObject('BAD END/TC_B_001,002/Page_CURA Healthcare Service/txt_input_username'), v_username)

'ใส่ Password'
WebUI.setText(findTestObject('BAD END/TC_B_001,002/Page_CURA Healthcare Service/txt_input_password'), v_password)

'กดปุ่มล็อคอิน'
WebUI.click(findTestObject('BAD END/TC_B_001,002/Page_CURA Healthcare Service/btn_login'))

'เช็คข้อความล็อคอินไม่สำเร็จ'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_001,002/Page_CURA Healthcare Service/vep_login_fail'), 'Login failed! Please ensure the username and password are valid.')

'ปิด Browser'
WebUI.closeBrowser()


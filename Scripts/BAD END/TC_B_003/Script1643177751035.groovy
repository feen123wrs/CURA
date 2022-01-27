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
WebUI.setText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/txt_input_username'), v_username, FailureHandling.STOP_ON_FAILURE)

'ใส่ Password'
WebUI.setText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/txt_input_password'), v_password, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มล็อคอิน'
WebUI.click(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/btn_login'))

'เลือกค่า drop down'
WebUI.selectOptionByLabel(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/txt_label_facility'), v_facility, 
    false, FailureHandling.OPTIONAL)

'เลือกค่าใน check box'
WebUI.check(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/chk_Apply for hospital readmission'), FailureHandling.STOP_ON_FAILURE)

'เช็คว่ามีการเลือกค่าแล้ว'
WebUI.verifyElementChecked(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vec_chk_Apply for hospital readmission'), 
    10, FailureHandling.STOP_ON_FAILURE)

'เอาค่าที่เลือกออกจาก check box'
WebUI.uncheck(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/un chk_Apply for hospital readmission'), FailureHandling.STOP_ON_FAILURE)

'เช็คว่าเอาค่าออกแล้ว'
WebUI.verifyElementNotChecked(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vec_un chk_Apply for hospital readmission'), 
    10, FailureHandling.STOP_ON_FAILURE)

'เลือกค่าใน radio button'
WebUI.check(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/chk_Healthcare Program'), FailureHandling.STOP_ON_FAILURE)

'เช็คว่าเลือกค่าแล้ว'
WebUI.verifyElementChecked(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vec_chk_Healthcare Program'), 10)

'กรอกวันที่'
WebUI.setText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/txt_input_date'), v_date)

'กรอกคอมเม้นต์'
WebUI.setText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/txt_input_comment'), v_comment)

'กดบันทึกข้อมูล'
WebUI.click(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/btn_Book Appointment'))

'เช็คข้อมูล Falicity ตรงกับที่เลือก'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vet_falicity'), v_facility, FailureHandling.OPTIONAL)

'เช็คข้อมูล Apply ตรงกับที่เลือก'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vet_Apply for hospital readmission'), 
    v_appy)

'เช็คข้อมูล Healthcare ตรงกับที่เลือก'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vet_Healthcare Program'), v_healthcare)

'เช็คข้อมูล Date ตรงกับที่เลือก'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vet_date'), v_date_check, FailureHandling.OPTIONAL)

'เช็คข้อมูลComment ตรงกับที่เลือก'
WebUI.verifyElementText(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/vet_comment'), v_comment)

'กดกลับหน้าแรก'
WebUI.click(findTestObject('BAD END/TC_B_003/Page_CURA Healthcare Service/btn_go home page'))

'ปิด Browser'
WebUI.closeBrowser()


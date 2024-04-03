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

WebUI.click(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Accounts Overview/a_Bill Pay'))

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Payee Name_payee.name'), 
    PayeeName)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Address_payee.address.street'), 
    Address)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_City_payee.address.city'), 
    City)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_State_payee.address.state'), 
    State)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Zip Code_payee.address.zipCode'), 
    ZipCode)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Phone_payee.phoneNumber'), 
    Phone)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Account_payee.accountNumber'), 
    Account)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Verify Account_verifyAccount'), 
    Account)

WebUI.setText(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_Amount_amount'), Amount)

WebUI.click(findTestObject('Object Repository/Parabank - Bill Payment/Page_ParaBank  Bill Pay/input_From account_button'))


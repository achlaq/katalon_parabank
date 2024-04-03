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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.click(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Welcome  Online Banking/a_Register'))

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_First Name_customer.firstName'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Last Name_customer.lastName'), 
    LastName)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Address_customer.address.street'), 
    Address)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_City_customer.address.city'), 
    City)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_State_customer.address.state'), 
    State)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Zip Code_customer.address.zipCode'), 
    ZipCode)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Phone_customer.phoneNumber'), 
    Phone)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_SSN_customer.ssn'), 
    SSN)

WebUI.setText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'), 
    Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Password_customer.password'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_repeatedPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Parabank - Register/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_button'))


package TestCase;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import PO.PO_TVS_Admin_Add_Admin;
import PO.Po_TVS_Login_Page;
import Utility.BrowserManager;

public class TVS_Admin_Add_Admin_TestCase 
{
	WebDriver driver;
	JSONObject Add_Admin_Page;
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="Data/Add_Admin_Page.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(datais);
			Add_Admin_Page = new JSONObject(tokener);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if(datais != null)
			{
				datais.close();
			}
		}
	}
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser,String url)
	{
		driver = BrowserManager.getDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
	}
	//Scenario
	@Test(priority=1,enabled=false)
	public void Add_Valid_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("ValidData").getString("firstname");
		String MiddleName=Add_Admin_Page.getJSONObject("ValidData").getString("middlename");
		String LastName=Add_Admin_Page.getJSONObject("ValidData").getString("lastname");
		String AdminEmail=Add_Admin_Page.getJSONObject("ValidData").getString("adminemail");
		String AdminPassword=Add_Admin_Page.getJSONObject("ValidData").getString("adminpassword");
		String ConfirmPassword=Add_Admin_Page.getJSONObject("ValidData").getString("confirmpassword");
		String PhoneNumber=Add_Admin_Page.getJSONObject("ValidData").getString("phonenumber");
		String Date=Add_Admin_Page.getJSONObject("ValidData").getString("date");
		String Branch=Add_Admin_Page.getJSONObject("ValidData").getString("branch");
		String Gender=Add_Admin_Page.getJSONObject("ValidData").getString("gender");
		String Country=Add_Admin_Page.getJSONObject("ValidData").getString("country");
		String State=Add_Admin_Page.getJSONObject("ValidData").getString("state");
		String City=Add_Admin_Page.getJSONObject("ValidData").getString("city");
		String Address=Add_Admin_Page.getJSONObject("ValidData").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.Valid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	
	@Test(priority=2)
	public void Add_InValid_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("InValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("InValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("InValidData").getString("firstname");
		String MiddleName=Add_Admin_Page.getJSONObject("InValidData").getString("middlename");
		String LastName=Add_Admin_Page.getJSONObject("InValidData").getString("lastname");
		String AdminEmail=Add_Admin_Page.getJSONObject("InValidData").getString("adminemail");
		String AdminPassword=Add_Admin_Page.getJSONObject("InValidData").getString("adminpassword");
		String ConfirmPassword=Add_Admin_Page.getJSONObject("InValidData").getString("confirmpassword");
		String PhoneNumber=Add_Admin_Page.getJSONObject("InValidData").getString("phonenumber");
		String Date=Add_Admin_Page.getJSONObject("InValidData").getString("date");
		String Branch=Add_Admin_Page.getJSONObject("InValidData").getString("branch");
		String Gender=Add_Admin_Page.getJSONObject("InValidData").getString("gender");
		String Country=Add_Admin_Page.getJSONObject("InValidData").getString("country");
		String State=Add_Admin_Page.getJSONObject("InValidData").getString("state");
		String City=Add_Admin_Page.getJSONObject("InValidData").getString("city");
		String Address=Add_Admin_Page.getJSONObject("InValidData").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.InValid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	
}

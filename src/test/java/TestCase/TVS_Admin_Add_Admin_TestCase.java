package TestCase;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import PO.PO_TVS_Admin_Add_Admin;
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
	@Test(priority=1)
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
	//2:Invalild Data
	@Test(priority=2)
	public void Add_InValid_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
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
	
	// Blank Data with no space

	@Test(priority=3)
	public void Add_blank_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("BlankData").getString("firstname");
		String MiddleName=Add_Admin_Page.getJSONObject("BlankData").getString("middlename");
		String LastName=Add_Admin_Page.getJSONObject("BlankData").getString("lastname");
		String AdminEmail=Add_Admin_Page.getJSONObject("BlankData").getString("adminemail");
		String AdminPassword=Add_Admin_Page.getJSONObject("BlankData").getString("adminpassword");
		String ConfirmPassword=Add_Admin_Page.getJSONObject("BlankData").getString("confirmpassword");
		String PhoneNumber=Add_Admin_Page.getJSONObject("BlankData").getString("phonenumber");
		String Date=Add_Admin_Page.getJSONObject("BlankData").getString("date");
		String Branch=Add_Admin_Page.getJSONObject("BlankData").getString("branch");
		String Gender=Add_Admin_Page.getJSONObject("BlankData").getString("gender");
		String Country=Add_Admin_Page.getJSONObject("BlankData").getString("country");
		String State=Add_Admin_Page.getJSONObject("BlankData").getString("state");
		String City=Add_Admin_Page.getJSONObject("BlankData").getString("city");
		String Address=Add_Admin_Page.getJSONObject("BlankData").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.Blank_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	
	
	//4 Data with spaces
	

	@Test(priority=4)
	public void Add_Double_Space_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("firstname");
		String MiddleName=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("middlename");
		String LastName=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("lastname");
		String AdminEmail=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("adminemail");
		String AdminPassword=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("adminpassword");
		String ConfirmPassword=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("confirmpassword");
		String PhoneNumber=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("phonenumber");
		String Date=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("date");
		String Branch=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("branch");
		String Gender=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("gender");
		String Country=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("country");
		String State=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("state");
		String City=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("city");
		String Address=Add_Admin_Page.getJSONObject("DoubleSpaceData").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.Double_Spaces_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	//5
	@Test(priority=5)
	public void Add_Valid_FirstName_All_Invalid_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("ValidData").getString("firstname");
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
		
obj.FirstName_Valid_All_Invalid(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	//6
	@Test(priority=6)
	public void Add_First_And_Middle_Valid_All_Invalid_Data()
	{
		String LoginEmail= Add_Admin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_Admin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_Admin_Page.getJSONObject("ValidData").getString("firstname");
		String MiddleName=Add_Admin_Page.getJSONObject("ValidData").getString("middlename");
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
		
obj.FirstName_And_MiddleName_Valid_All_Invalid(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	//7
	@Test(priority=7)
	public void Add_Double_Spaces()
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
		String Address=Add_Admin_Page.getJSONObject("MoreCharacter").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.Double_Spaces_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	
	//8
	@Test(priority=8)
	public void Add_Address_With_More_Than_255_Character_Data()
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
		String Address=Add_Admin_Page.getJSONObject("MoreCharacter").getString("address");
		PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
		
obj.Address_With_More_Than_255_Character(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	
	
	
	//9
		@Test(priority=9)
		public void Add_Address_With_Less_Than_3_Character_Data()
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
			String Address=Add_Admin_Page.getJSONObject("LessCharacter").getString("address");
			PO_TVS_Admin_Add_Admin obj = PageFactory.initElements(driver,PO_TVS_Admin_Add_Admin.class);
			
	obj.Address_With_Less_Character_Spaces(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
		}
	
}

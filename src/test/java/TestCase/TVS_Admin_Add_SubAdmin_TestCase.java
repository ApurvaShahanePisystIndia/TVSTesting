package TestCase;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import PO.Po_TVS_Admin_Add_SubAdmin;
import Utility.BrowserManager;

public class TVS_Admin_Add_SubAdmin_TestCase
{
	WebDriver driver;
	JSONObject Add_SubAdmin_Page;
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="Data/Add_SubAdmin_Page.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(datais);
			Add_SubAdmin_Page = new JSONObject(tokener);
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
		String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
		String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
		String FirstName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("firstname");
		String MiddleName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("middlename");
		String LastName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("lastname");
		String AdminEmail=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminemail");
		String AdminPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminpassword");
		String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("confirmpassword");
		String PhoneNumber=Add_SubAdmin_Page.getJSONObject("ValidData").getString("phonenumber");
		String Date=Add_SubAdmin_Page.getJSONObject("ValidData").getString("date");
		String Branch=Add_SubAdmin_Page.getJSONObject("ValidData").getString("branch");
		String Gender=Add_SubAdmin_Page.getJSONObject("ValidData").getString("gender");
		String Country=Add_SubAdmin_Page.getJSONObject("ValidData").getString("country");
		String State=Add_SubAdmin_Page.getJSONObject("ValidData").getString("state");
		String City=Add_SubAdmin_Page.getJSONObject("ValidData").getString("city");
		String Address=Add_SubAdmin_Page.getJSONObject("ValidData").getString("address");
		Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);
		
obj.Valid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
	}
	//2:Invalild Data
		@Test(priority=2)
		public void Add_InValid_Data()
		{
			String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_SubAdmin_Page.getJSONObject("InValidData").getString("firstname");
			String MiddleName=Add_SubAdmin_Page.getJSONObject("InValidData").getString("middlename");
			String LastName=Add_SubAdmin_Page.getJSONObject("InValidData").getString("lastname");
			String AdminEmail=Add_SubAdmin_Page.getJSONObject("InValidData").getString("adminemail");
			String AdminPassword=Add_SubAdmin_Page.getJSONObject("InValidData").getString("adminpassword");
			String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("InValidData").getString("confirmpassword");
			String PhoneNumber=Add_SubAdmin_Page.getJSONObject("InValidData").getString("phonenumber");
			String Date=Add_SubAdmin_Page.getJSONObject("InValidData").getString("date");
			String Branch=Add_SubAdmin_Page.getJSONObject("InValidData").getString("branch");
			String Gender=Add_SubAdmin_Page.getJSONObject("InValidData").getString("gender");
			String Country=Add_SubAdmin_Page.getJSONObject("InValidData").getString("country");
			String State=Add_SubAdmin_Page.getJSONObject("InValidData").getString("state");
			String City=Add_SubAdmin_Page.getJSONObject("InValidData").getString("city");
			String Address=Add_SubAdmin_Page.getJSONObject("InValidData").getString("address");
			Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);
			
	obj.InValid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
		}
		
		// Blank Data with no space

		@Test(priority=3)
		public void Add_blank_Data()
		{
			String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_SubAdmin_Page.getJSONObject("BlankData").getString("firstname");
			String MiddleName=Add_SubAdmin_Page.getJSONObject("BlankData").getString("middlename");
			String LastName=Add_SubAdmin_Page.getJSONObject("BlankData").getString("lastname");
			String AdminEmail=Add_SubAdmin_Page.getJSONObject("BlankData").getString("adminemail");
			String AdminPassword=Add_SubAdmin_Page.getJSONObject("BlankData").getString("adminpassword");
			String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("BlankData").getString("confirmpassword");
			String PhoneNumber=Add_SubAdmin_Page.getJSONObject("BlankData").getString("phonenumber");
			String Date=Add_SubAdmin_Page.getJSONObject("BlankData").getString("date");
			String Branch=Add_SubAdmin_Page.getJSONObject("BlankData").getString("branch");
			String Gender=Add_SubAdmin_Page.getJSONObject("BlankData").getString("gender");
			String Country=Add_SubAdmin_Page.getJSONObject("BlankData").getString("country");
			String State=Add_SubAdmin_Page.getJSONObject("BlankData").getString("state");
			String City=Add_SubAdmin_Page.getJSONObject("BlankData").getString("city");
			String Address=Add_SubAdmin_Page.getJSONObject("BlankData").getString("address");
			Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);
			
	obj.Blank_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
		}
		
		
		//4 Data with spaces
		

		@Test(priority=4)
		public void Add_Double_Space_Data()
		{
			String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("firstname");
			String MiddleName=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("middlename");
			String LastName=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("lastname");
			String AdminEmail=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("adminemail");
			String AdminPassword=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("adminpassword");
			String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("confirmpassword");
			String PhoneNumber=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("phonenumber");
			String Date=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("date");
			String Branch=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("branch");
			String Gender=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("gender");
			String Country=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("country");
			String State=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("state");
			String City=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("city");
			String Address=Add_SubAdmin_Page.getJSONObject("DoubleSpaceData").getString("address");
			Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);
			
	obj.Double_Spaces_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
		}
		//5
		@Test(priority=8)
		public void Add_Address_With_More_Than_255_Character_Data()
		{
			String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("firstname");
			String MiddleName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("middlename");
			String LastName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("lastname");
			String AdminEmail=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminemail");
			String AdminPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminpassword");
			String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("confirmpassword");
			String PhoneNumber=Add_SubAdmin_Page.getJSONObject("ValidData").getString("phonenumber");
			String Date=Add_SubAdmin_Page.getJSONObject("ValidData").getString("date");
			String Branch=Add_SubAdmin_Page.getJSONObject("ValidData").getString("branch");
			String Gender=Add_SubAdmin_Page.getJSONObject("ValidData").getString("gender");
			String Country=Add_SubAdmin_Page.getJSONObject("ValidData").getString("country");
			String State=Add_SubAdmin_Page.getJSONObject("ValidData").getString("state");
			String City=Add_SubAdmin_Page.getJSONObject("ValidData").getString("city");
			String Address=Add_SubAdmin_Page.getJSONObject("MoreCharacter").getString("address");
			Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);			
	obj.Address_With_More_Than_255_Character(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
		}
		
		
		
		//6
			@Test(priority=9)
			public void Add_Address_With_Less_Than_3_Character_Data()
			{
				String LoginEmail= Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginemail");
				String LoginPassword =Add_SubAdmin_Page.getJSONObject("ValidData").getString("loginpassword");
				String FirstName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("firstname");
				String MiddleName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("middlename");
				String LastName=Add_SubAdmin_Page.getJSONObject("ValidData").getString("lastname");
				String AdminEmail=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminemail");
				String AdminPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("adminpassword");
				String ConfirmPassword=Add_SubAdmin_Page.getJSONObject("ValidData").getString("confirmpassword");
				String PhoneNumber=Add_SubAdmin_Page.getJSONObject("ValidData").getString("phonenumber");
				String Date=Add_SubAdmin_Page.getJSONObject("ValidData").getString("date");
				String Branch=Add_SubAdmin_Page.getJSONObject("ValidData").getString("branch");
				String Gender=Add_SubAdmin_Page.getJSONObject("ValidData").getString("gender");
				String Country=Add_SubAdmin_Page.getJSONObject("ValidData").getString("country");
				String State=Add_SubAdmin_Page.getJSONObject("ValidData").getString("state");
				String City=Add_SubAdmin_Page.getJSONObject("ValidData").getString("city");
				String Address=Add_SubAdmin_Page.getJSONObject("LessCharacter").getString("address");
				Po_TVS_Admin_Add_SubAdmin obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_SubAdmin.class);
				
		obj.Address_With_Less_Character_Spaces(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, AdminEmail, AdminPassword, ConfirmPassword, PhoneNumber, Date, Branch, Gender, Country,State,City, Address);
			}
		
		
		
}

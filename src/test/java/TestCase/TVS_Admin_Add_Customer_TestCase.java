package TestCase;
import java.io.InputStream;
import org.json.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import PO.Po_TVS_Admin_Add_Customer;
import Utility.BrowserManager;

public class TVS_Admin_Add_Customer_TestCase {
	WebDriver driver;
	JSONObject Add_Customer_Page;
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="Data/Add_Customer_Page.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(datais);
			Add_Customer_Page = new JSONObject(tokener);
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
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("ValidData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("ValidData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("ValidData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("ValidData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("ValidData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("ValidData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("ValidData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("ValidData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("ValidData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("ValidData").getString("country");
			String State=Add_Customer_Page.getJSONObject("ValidData").getString("state");
			String City=Add_Customer_Page.getJSONObject("ValidData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("ValidData").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.Valid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
		}
	// 2 Need to change according to first po have to change the po also frm scenario 2 
		@Test(priority=2)
		public void Add_InValid_Data()
		{
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("InValidData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("InValidData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("InValidData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("InValidData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("InValidData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("InValidData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("InValidData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("InValidData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("InValidData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("InValidData").getString("country");
			String State=Add_Customer_Page.getJSONObject("InValidData").getString("state");
			String City=Add_Customer_Page.getJSONObject("InValidData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("InValidData").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.InValid_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
	}
		/*
		// 3
		@Test(priority=3)
		public void Add_Blank_Data()
		{
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("BlankData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("BlankData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("BlankData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("BlankData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("BlankData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("BlankData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("BlankData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("BlankData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("BlankData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("BlankData").getString("country");
			String State=Add_Customer_Page.getJSONObject("BlankData").getString("state");
			String City=Add_Customer_Page.getJSONObject("BlankData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("BlankData").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.Blank_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
	}
		// 4
		@Test(priority=4)
		public void Add_Double_Spaces()
		{
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("country");
			String State=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("state");
			String City=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("DoubleSpaceData").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.Double_Spaces_Data(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
	}
		// 5 
		@Test(priority=5)
		public void Add_Address_With_Less_Character()
		{
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("ValidData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("ValidData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("ValidData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("ValidData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("ValidData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("ValidData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("ValidData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("ValidData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("ValidData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("ValidData").getString("country");
			String State=Add_Customer_Page.getJSONObject("ValidData").getString("state");
			String City=Add_Customer_Page.getJSONObject("ValidData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("LessCharacter").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.Address_With_Less_Character_Spaces(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
	}
		// 6
		@Test(priority=6)
		public void Add_Address_With_More_255_Character()
		{
			String LoginEmail= Add_Customer_Page.getJSONObject("ValidData").getString("loginemail");
			String LoginPassword =Add_Customer_Page.getJSONObject("ValidData").getString("loginpassword");
			String FirstName=Add_Customer_Page.getJSONObject("ValidData").getString("firstname");
			String MiddleName=Add_Customer_Page.getJSONObject("ValidData").getString("middlename");
			String LastName=Add_Customer_Page.getJSONObject("ValidData").getString("lastname");
			String Date=Add_Customer_Page.getJSONObject("ValidData").getString("date");
			String CustomerEmail=Add_Customer_Page.getJSONObject("ValidData").getString("customeremail");
			String PhoneNumber=Add_Customer_Page.getJSONObject("ValidData").getString("phonenumber");
			String Branch=Add_Customer_Page.getJSONObject("ValidData").getString("branch");
			String CustomerType =Add_Customer_Page.getJSONObject("ValidData").getString("customertype");
			String Gender=Add_Customer_Page.getJSONObject("ValidData").getString("gender");
			String Country=Add_Customer_Page.getJSONObject("ValidData").getString("country");
			String State=Add_Customer_Page.getJSONObject("ValidData").getString("state");
			String City=Add_Customer_Page.getJSONObject("ValidData").getString("city");
			String Address=Add_Customer_Page.getJSONObject("MoreCharacter").getString("address");
			Po_TVS_Admin_Add_Customer obj = PageFactory.initElements(driver,Po_TVS_Admin_Add_Customer.class);
			
	obj.Address_With_More_Than_255_Character(LoginEmail, LoginPassword, FirstName, MiddleName, LastName, CustomerEmail, LoginPassword, LoginPassword, PhoneNumber, Date, Branch, CustomerType, Gender, Country, State, City, Address);
	}
		
		
		*/

}

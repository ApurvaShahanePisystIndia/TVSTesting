package TestCase;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import Utility.BrowserManager; 
import PO.PO_TVS_Login_Page;

public class TVS_Login_Page_TestCase {
	WebDriver driver;
	JSONObject Login_Page;
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="Data/Login_Page.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(datais);
			Login_Page = new JSONObject(tokener);
			
			
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
	@Test(priority=1)
	public void Sign_In_Valid_Data() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("ValidData").getString("email");
		String Password =Login_Page.getJSONObject("ValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		obj.SignIn_Valid_Data(Email, Password);
	}
	
	@Test(priority=2)
	public void Sign_In_InValid_Data() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("InValidData").getString("email");
		String Password =Login_Page.getJSONObject("InValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		obj.SignIn_InValid_Data(Email, Password);
	}
	 
	
	@Test(priority=3)
	public void Sign_In_Blank_Data() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("BlankData").getString("email");
		String Password =Login_Page.getJSONObject("BlankData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		obj.SignIn_Blank_Data(Email, Password);
	}
	 
	@Test(priority=4)
	public void Sign_In_ValidEmail_InvalidPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("ValidData").getString("email");
		String Password =Login_Page.getJSONObject("InValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		obj.SignIn_Valid_Email_Invalid_Password(Email, Password);
	}
	
	@Test(priority=5)
	public void Sign_In_ValidEmail_BlankPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("ValidData").getString("email");
		String Password =Login_Page.getJSONObject("BlankData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		obj.SignIn_Valid_Email_Blank_Password(Email, Password);
	}

	
	@Test(priority=6)
	public void Sign_In_InValidEmail_ValidPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("InValidData").getString("email");
		String Password =Login_Page.getJSONObject("ValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		
		obj.SignIn_Invalid_Email_Valid_Password(Email, Password);
	}
	
	
	@Test(priority=7)
	public void Sign_In_InValidEmail_BlankPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("InValidData").getString("email");
		String Password =Login_Page.getJSONObject("BlankData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		
		obj.SignIn_Invalid_Email_Blank_Password(Email, Password);
	}
	
	
	@Test(priority=8)
	public void Sign_In_BlankEmail_ValidPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("BlankData").getString("email");
		String Password =Login_Page.getJSONObject("ValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		
		obj.SignIn_Blank_Email_Valid_Password(Email, Password);
	}
	
	
	@Test(priority=9)
	public void Sign_In_BlankEmail_InValidPassword() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("BlankData").getString("email");
		String Password =Login_Page.getJSONObject("InValidData").getString("password");
		PO_TVS_Login_Page obj = PageFactory.initElements(driver,PO_TVS_Login_Page.class);
		
		obj.SignIn_Blank_Email_InValid_Password(Email, Password);
	}
	
	@AfterMethod
	public void Tear_Down()
	{
		driver.quit();
	}
	
	
	
	
	
}

package PO;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;
public class PO_TVS_Admin_Add_Admin 
{
	WebDriver driver;
	public PO_TVS_Admin_Add_Admin(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using ="//input[@id='admin_email']")
	WebElement Txt_Login_Email;
	@FindBy(how=How.XPATH, using ="//input[@id='admin_password']")
	WebElement Txt_Login_Password;
	@FindBy(how=How.XPATH,using ="//button [@onclick='login()']")
	WebElement Btn_Sign_In;
	@FindBy(how=How.XPATH,using ="/html/body/div[1]/ul/li[2]/div/i")
	WebElement Click_Users;
	@FindBy(how=How.XPATH,using ="//a[@href='http://192.168.1.13/showroom/admin/AdminMember']")
	WebElement Click_Admin;
	@FindBy(how=How.XPATH,using ="//a [@id='addModalAdmin']")
	WebElement Click_Add_Admin;
	@FindBy(how=How.XPATH,using ="//input[@id='first_name']")
	WebElement txt_First_Name;
	@FindBy(how=How.XPATH,using ="//input[@id='display_name']")
	WebElement txt_Middlename;
	@FindBy(how=How.XPATH,using ="//input[@id='last_name']")
	WebElement txt_Lastname;
	@FindBy(how=How.XPATH,using ="//input[@id='email']")
	WebElement txt_Email;
	@FindBy(how=How.XPATH,using ="//input[@id='password']")
	WebElement Txt_Password;
	@FindBy(how=How.XPATH,using ="//input[@id='confirmpassword']")
	WebElement Txt_Confirmpassword;
	@FindBy(how=How.XPATH,using ="//input[@id='phno']")
	WebElement Txt_Phonenumber;
	@FindBy(how=How.XPATH,using ="//input[@id='Date']")
	WebElement Txt_Date;
	@FindBy(how=How.XPATH,using ="//select[@id='branch']")
	WebElement Txt_Branch;
	@FindBy(how=How.XPATH,using ="//select[@id='select_gender']")
	WebElement Txt_Gender;
	@FindBy(how=How.XPATH,using ="//select[@id='select_country']")
	WebElement Txt_Country;
	@FindBy(how=How.XPATH,using ="//select[@id='select_state']")
	WebElement Txt_State;
	@FindBy(how=How.XPATH,using ="//select[@id='select_city']")
	WebElement Txt_City;
	@FindBy(how=How.XPATH,using ="//textarea[@id='address']")
	WebElement Txt_Address;
	@FindBy(how=How.XPATH,using ="(//i [@class='fa fa-check-circle'])[1]")
	WebElement Btn_Submit;
	@FindBy(how=How.XPATH,using ="(//button[@class='swal2-confirm swal2-styled'])")
	WebElement Btn_OK;
	@FindBy(how=How.XPATH,using ="//h4[text()='Add Admin']")
	WebElement Page_Title;
	
	
	
	public String VerifyTitle()
	{
		String MyTitle = driver.getTitle();
		System.out.println("My Page Title  = "+MyTitle);
		return MyTitle;
		
	}
	
	//Created all the Method for XPath
	public void LoginEmail(String args)
	{
		Txt_Login_Email.sendKeys(args);
		
		
	}
	public void LoginPassword(String args)
	{
		Txt_Login_Password.sendKeys(args);
		
	}
	public void SignIn()
	{
		Btn_Sign_In.click();
	}
	
	public void Btn_User()
	{
		Click_Users.click();
	}
	
	public void Btn_Admin()
	{
		Click_Admin.click();
	}
	public void Btn_Add_Admin()
	{
		Click_Add_Admin.click();
		
	}
	public void Enter_FirstName(String FirstName)
	{
		txt_First_Name.sendKeys(FirstName);
	}
	public void Enter_LastName(String LastName)
	{
		txt_Lastname.sendKeys(LastName);
		
	}
	public void Enter_MiddleName(String MiddleName)
	{
		txt_Middlename.sendKeys(MiddleName);
	}
	public void Enter_Email(String AdminEmail)
	{
		txt_Email.sendKeys(AdminEmail);
	}
	
	public void Enter_Password(String AdminPassword)
	{
		Txt_Password.sendKeys(AdminPassword);
	}
	public void Enter_Confirm_Password(String ConfirmPassword)
	{
		Txt_Confirmpassword.sendKeys(ConfirmPassword);
	}
	public void Enter_Phone_Number(String PhoneNumber)
	{
		Txt_Phonenumber.sendKeys(PhoneNumber);
	}
	public void Enter_Date(String Date)
	{
		Txt_Date.sendKeys(Date);
	}
	public void Branch(String Branch)
	{
		Txt_Branch.sendKeys(Branch);
	}
	public void Gender(String Gender)
	{
		Txt_Gender.sendKeys(Gender);
	}
	public void Enter_Country(String Country)
	{
		Txt_Country.sendKeys(Country);
	}
	public void Enter_State(String State)
	{
		Txt_State.sendKeys(State);
	}
	public void Enter_City(String City)
	{
	Txt_City.sendKeys(City);
	}
	public void Enter_Address(String Address)
	{
	 Txt_Address.sendKeys(Address);
	}
	public void Click_Submit()
	{
		Btn_Submit.click();
	}
	public void click_OK()
	{
	Btn_OK.click();
	}
	//Scenario
	//1 Valid Data
	@SuppressWarnings("deprecation")
	public void Valid_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
		LoginEmail(LoginEmail);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		LoginPassword(LoginPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignIn();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_User();
		System.out.println("Clicked user");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_Admin();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_Add_Admin();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Enter_FirstName(FirstName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_MiddleName(MiddleName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_LastName(LastName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Email(AdminEmail);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Password(AdminPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Confirm_Password(ConfirmPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Phone_Number(PhoneNumber);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Date(Date);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Branch(Branch);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Gender(Gender);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Country(Country);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_State(State);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_City(City);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Address(Address);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Click_Submit();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		click_OK();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		VerifyTitle();
	} //try close
		catch(Exception e)
		{
			e.printStackTrace();
		} // catch close
}
	//2 . Invalid Data
	
	@SuppressWarnings("deprecation")
	public void InValid_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
		LoginEmail(LoginEmail);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		LoginPassword(LoginPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		SignIn();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_User();
		System.out.println("Clicked user");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_Admin();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Btn_Add_Admin();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Enter_FirstName(FirstName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_MiddleName(MiddleName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_LastName(LastName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Email(AdminEmail);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Password(AdminPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Confirm_Password(ConfirmPassword);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Phone_Number(PhoneNumber);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Date(Date);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Branch(Branch);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Gender(Gender);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Country(Country);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_State(State);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_City(City);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Enter_Address(Address);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Click_Submit();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Assert.assertEquals(true,Page_Title.isDisplayed());
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
}	
	
	// 3 Blank Data
	
	@SuppressWarnings("deprecation")
	public void Blank_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
		LoginEmail(LoginEmail);
		LoginPassword(LoginPassword);
		SignIn();
		Btn_User();
		System.out.println("Clicked user");
		Btn_Admin();
		Btn_Add_Admin();
		Enter_FirstName(FirstName);
		Enter_MiddleName(MiddleName);
		Enter_LastName(LastName);
		Enter_Email(AdminEmail);
		Enter_Password(AdminPassword);
		Enter_Confirm_Password(ConfirmPassword);
		Enter_Phone_Number(PhoneNumber);
		Enter_Date(Date);
		Branch(Branch);
		Gender(Gender);
		Enter_Country(Country);
		Enter_State(State);
		Enter_City(City);
		Enter_Address(Address);
		Click_Submit();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Assert.assertEquals(true,Page_Title.isDisplayed());
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
}	
	// 4 Spaces 
	@SuppressWarnings("deprecation")
	public void Spaces_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Btn_User();
			Btn_Admin();
			Btn_Add_Admin();
			Enter_FirstName(FirstName);
			Enter_MiddleName(MiddleName);
			Enter_LastName(LastName);
			Enter_Email(AdminEmail);
			Enter_Password(AdminPassword);
			Enter_Confirm_Password(ConfirmPassword);
			Enter_Phone_Number(PhoneNumber);
			Enter_Date(Date);
			Branch(Branch);
			Gender(Gender);
			Enter_Country(Country);
			Enter_State(State);
			Enter_City(City);
			Enter_Address(Address);
			Click_Submit();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Assert.assertEquals(true,Page_Title.isDisplayed());
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
}	
	
	
	
	// 5 First Name Valid all Other Invalid 
	@SuppressWarnings("deprecation")
	public void FirstName_Valid_All_Invalid(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	System.out.println("Clicked user");
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	}
	
	// 6   First name and Middle name valid and all other invalid 
	
	
	@SuppressWarnings("deprecation")
	public void FirstName_And_MiddleName_Valid_All_Invalid(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	
	//7:   Future DOB is selected valid

	@SuppressWarnings("deprecation")
	public void DOB__Future_Date_Valid(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	//8 : Invalid Date is pass 

	@SuppressWarnings("deprecation")
	public void DOB__Future_Date_InValid(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	//9: Blank Date all valid 
	
	public void DOB__Future_Date_Blank_And_All_Valid(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	// 10: Address more than 255 character
	public void Address_Invalid_More_Than_255_Character(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	//11:Address with Double Space
	public void Address_With_Double_Spaces(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String Gender,String Country,
			String State,String City,String Address)
	{
		
	try
	{
	LoginEmail(LoginEmail);
	LoginPassword(LoginPassword);
	SignIn();
	Btn_User();
	Btn_Admin();
	Btn_Add_Admin();
	Enter_FirstName(FirstName);
	Enter_MiddleName(MiddleName);
	Enter_LastName(LastName);
	Enter_Email(AdminEmail);
	Enter_Password(AdminPassword);
	Enter_Confirm_Password(ConfirmPassword);
	Enter_Phone_Number(PhoneNumber);
	Enter_Date(Date);
	Branch(Branch);
	Gender(Gender);
	Enter_Country(Country);
	Enter_State(State);
	Enter_City(City);
	Enter_Address(Address);
	Click_Submit();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Assert.assertEquals(true,Page_Title.isDisplayed());
	VerifyTitle();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	
	
	
}//class close 


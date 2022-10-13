package PO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class Po_TVS_Admin_Add_Customer
{
	WebDriver driver;
	public Po_TVS_Admin_Add_Customer(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using ="//input[@id='admin_email']")
	WebElement Txt_Login_Email;
	@FindBy(how=How.XPATH, using ="//input[@id='admin_password']")
	WebElement Txt_Login_Password;
	@FindBy(how=How.XPATH,using ="//button[@onclick='login()']")
	WebElement Btn_Sign_In;
	@FindBy(how=How.XPATH,using ="(//i[@class='bx bxs-chevron-down arrow'])[1]")
	WebElement Click_Users;
	
	@FindBy(how=How.XPATH,using ="//a[@href='http://192.168.1.17/showroom/admin/Customer']")
	WebElement Click_Customer;
	
	@FindBy(how=How.XPATH,using ="//a [@id='addModalcustomer']")
	WebElement Click_Add_Customer;
	
	@FindBy(how=How.XPATH,using ="//input[@id='first_name']")
	WebElement txt_First_Name;
	@FindBy(how=How.XPATH,using ="//input[@id='display_name']")
	WebElement txt_Middlename;
	@FindBy(how=How.XPATH,using ="//input[@id='last_name']")
	WebElement txt_Lastname;
	
	@FindBy(how=How.XPATH,using ="//input[@id='Date']")
	WebElement txt_Date;
	@FindBy(how=How.XPATH,using ="//input[@id='email']")
	WebElement txt_Email;
	@FindBy(how=How.XPATH,using ="//input[@id='phno']")
	WebElement Txt_Phonenumber;
	
	@FindBy(how=How.XPATH,using ="//select[@id='branch']")
	WebElement Txt_Branch;
	
	@FindBy(how=How.XPATH,using ="//select[@id='cust_type']")
	WebElement Txt_Customer;
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
	@FindBy(how=How.XPATH,using ="//h4 [text()='Add Customer']")
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
	
	public void Btn_Customer()
	{
		Click_Customer.click();
	}
	public void Btn_Add_Customer()
	{
		Click_Add_Customer.click();
		
		
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
	
	public void Enter_Phone_Number(String PhoneNumber)
	{
		Txt_Phonenumber.sendKeys(PhoneNumber);
	}
	public void Enter_Date(String Date)
	{
		txt_Date.sendKeys(Date);
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
	
	public void Enter_CustomerType(String CustomerType)
	{
	Txt_Customer.sendKeys(CustomerType);
	}
	public void Click_Submit()
	{
		Btn_Submit.click();
	}
	public void click_OK()
	{
	Btn_OK.click();
	}
	
	//1
	@SuppressWarnings("deprecation")
	public void Valid_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String CustomerEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
		LoginEmail(LoginEmail);
		Thread.sleep(1000);
		LoginPassword(LoginPassword);
		Thread.sleep(1000);
		SignIn();
		Thread.sleep(2000);
		Btn_User();
		Thread.sleep(1000);
		Btn_Customer();
		Thread.sleep(2000);
		Btn_Add_Customer();
		Thread.sleep(1000);
		Enter_FirstName(FirstName);
		Thread.sleep(500);
		Enter_MiddleName(MiddleName);
		Thread.sleep(500);
		Enter_LastName(LastName);
		Thread.sleep(1000);
		Enter_Date(Date);
		Thread.sleep(1000);
		Enter_Email(CustomerEmail);
		Thread.sleep(1000);
		Enter_Phone_Number(PhoneNumber);
		Thread.sleep(1000);
		Branch(Branch);
		Thread.sleep(1000);
		Enter_CustomerType(CustomerType);
		Thread.sleep(1000);
		Gender(Gender);
		Enter_Country(Country);
		Thread.sleep(1000);
		Enter_State(State);
		Enter_City(City);
		Thread.sleep(2000);
		Enter_Address(Address);
		Click_Submit();
		Thread.sleep(500);
		click_OK();
		Assert.assertEquals(VerifyTitle(),"TVS");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}             
	
	//2

	@SuppressWarnings("deprecation")
	public void InValid_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String CustomerEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Thread.sleep(4000);
			Btn_User();
			Thread.sleep(1000);
			Btn_Customer();
			Thread.sleep(2000);
			Btn_Add_Customer();
			Thread.sleep(1000);
			Enter_FirstName(FirstName);
			Thread.sleep(500);
			Enter_MiddleName(MiddleName);
			Thread.sleep(500);
			Enter_LastName(LastName);
			Thread.sleep(1000);
			Enter_Date(Date);
			Enter_Email(CustomerEmail);
			
			Enter_Phone_Number(PhoneNumber);
			Thread.sleep(1000);
			
			Branch(Branch);
			Thread.sleep(1000);
			Enter_CustomerType(CustomerType);
			
			
			Gender(Gender);
			Enter_Country(Country);
			Thread.sleep(1000);
			Enter_State(State);
			Enter_City(City);
			Thread.sleep(2000);
			Enter_Address(Address);
			Click_Submit();
			Thread.sleep(500);
		
		
		Assert.assertEquals(true,Page_Title.isDisplayed());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	//3
	@SuppressWarnings("deprecation")
	public void Blank_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String CustomerEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Thread.sleep(2000);
			Btn_User();
			
			Btn_Customer();
			Thread.sleep(2000);
			Btn_Add_Customer();
			Thread.sleep(1000);
			Enter_FirstName(FirstName);
			Thread.sleep(500);
			Enter_MiddleName(MiddleName);
			Thread.sleep(500);
			Enter_LastName(LastName);
			Thread.sleep(1000);
			Enter_Date(Date);
			Enter_Email(CustomerEmail);
			
			Enter_Phone_Number(PhoneNumber);
			Thread.sleep(1000);
			
			Branch(Branch);
			Thread.sleep(1000);
			Enter_CustomerType(CustomerType);
			
			
			Gender(Gender);
			Enter_Country(Country);
			Thread.sleep(1000);
			Enter_State(State);
			Enter_City(City);
			Thread.sleep(2000);
			Enter_Address(Address);
			Click_Submit();
			Thread.sleep(500);
		
		Assert.assertEquals(true,Page_Title.isDisplayed());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	//4
	@SuppressWarnings("deprecation")
	public void Double_Spaces_Data(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String AdminEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Thread.sleep(2000);
			Btn_User();
			
			Btn_Customer();
			Thread.sleep(2000);
			Btn_Add_Customer();
			Thread.sleep(1000);
			Enter_FirstName(FirstName);
			Thread.sleep(500);
			Enter_MiddleName(MiddleName);
			Thread.sleep(500);
			Enter_LastName(LastName);
			Thread.sleep(1000);
			Enter_Date(Date);
			Enter_Email(AdminEmail);
			
			Enter_Phone_Number(PhoneNumber);
			Thread.sleep(1000);
			
			Branch(Branch);
			Thread.sleep(1000);
			Enter_CustomerType(CustomerType);
			
			
			Gender(Gender);
			Enter_Country(Country);
			Thread.sleep(1000);
			Enter_State(State);
			Enter_City(City);
			Thread.sleep(2000);
			Enter_Address(Address);
			Click_Submit();
			Thread.sleep(500);
		
		Assert.assertEquals(true,Page_Title.isDisplayed());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	//5
	
	@SuppressWarnings("deprecation")
	public void Address_With_Less_Character_Spaces(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String CustomerEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Thread.sleep(2000);
			Btn_User();
			
			Btn_Customer();
			Thread.sleep(2000);
			Btn_Add_Customer();
			Thread.sleep(1000);
			Enter_FirstName(FirstName);
			Thread.sleep(500);
			Enter_MiddleName(MiddleName);
			Thread.sleep(500);
			Enter_LastName(LastName);
			Thread.sleep(1000);
			Enter_Date(Date);
			Enter_Email(CustomerEmail);
			
			Enter_Phone_Number(PhoneNumber);
			Thread.sleep(1000);
			
			Branch(Branch);
			Thread.sleep(1000);
			Enter_CustomerType(CustomerType);
			
			
			Gender(Gender);
			Enter_Country(Country);
			Thread.sleep(1000);
			Enter_State(State);
			Enter_City(City);
			Thread.sleep(2000);
			Enter_Address(Address);
			Click_Submit();
			Thread.sleep(500);
		
		Assert.assertEquals(true,Page_Title.isDisplayed());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	//6
	@SuppressWarnings("deprecation")
	public void Address_With_More_Than_255_Character(String LoginEmail,String LoginPassword,String FirstName,String MiddleName,String LastName,String CustomerEmail,
			String AdminPassword,String ConfirmPassword,String PhoneNumber,String Date,String Branch,String CustomerType,String Gender,String Country,
			String State,String City,String Address)
	{
		try
		{
			LoginEmail(LoginEmail);
			LoginPassword(LoginPassword);
			SignIn();
			Thread.sleep(2000);
			Btn_User();
			
			Btn_Customer();
			Thread.sleep(2000);
			Btn_Add_Customer();
			Thread.sleep(1000);
			Enter_FirstName(FirstName);
			Thread.sleep(500);
			Enter_MiddleName(MiddleName);
			Thread.sleep(500);
			Enter_LastName(LastName);
			Thread.sleep(1000);
			Enter_Date(Date);
			Enter_Email(CustomerEmail);
			
			Enter_Phone_Number(PhoneNumber);
			Thread.sleep(1000);
			
			Branch(Branch);
			Thread.sleep(1000);
			Enter_CustomerType(CustomerType);
			
			
			Gender(Gender);
			Enter_Country(Country);
			Thread.sleep(1000);
			Enter_State(State);
			Enter_City(City);
			Thread.sleep(2000);
			Enter_Address(Address);
			Click_Submit();
			Thread.sleep(500);
		
		Assert.assertEquals(true,Page_Title.isDisplayed());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		VerifyTitle();
	} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	
	
	
	
	
	
	
	
	
	
}

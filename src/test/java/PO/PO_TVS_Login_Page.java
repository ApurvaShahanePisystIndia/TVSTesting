package PO;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
public class Po_TVS_Login_Page {
	WebDriver driver;
		public Po_TVS_Login_Page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	@FindBy(how=How.XPATH, using ="//input[@id='admin_email']")
	WebElement Txt_Login_Email;
	@FindBy(how=How.XPATH, using ="//input[@id='admin_password']")
	WebElement Txt_Login_Password;
	@FindBy(how=How.XPATH,using ="//button [@onclick='login()']")
	WebElement Btn_Sign_In;
	@FindBy(how=How.XPATH, using ="//h4[text()='Dashboard']")
	WebElement Txt_DashBoard_Title;
	
	@FindBy(how=How.XPATH, using ="//span [@class='titleup']")
	WebElement Txt_Login_Title;
	
	
	//Method of XPath
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
	public String verifytitle()
	{
		String MyTitle = driver.getTitle();
		System.out.println("My Page Title  = "+MyTitle);
		return MyTitle;
		
	}
	//Scenario
	//1 . Valid Data
	public void SignIn_Valid_Data(String Email,String Password) throws InterruptedException
	{
		try
		{
		LoginEmail(Email);
		Thread.sleep(5000);
		LoginPassword(Password);
		Thread.sleep(5000);
		SignIn();
		Thread.sleep(5000);
		//Assert.assertEquals(verifytitle(),"TVS");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	/*
	//2 Invalid Data
	public void SignIn_InValid_Data(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	
	//3.Blank Data
	public void SignIn_Blank_Data(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	//4 Valid email and Invalid Password
	public void SignIn_Valid_Email_Invalid_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	//5
	public void SignIn_Valid_Email_Blank_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	//6
	
	public void SignIn_Invalid_Email_Valid_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	//7
	
	public void SignIn_Invalid_Email_Blank_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	//8
	
	public void SignIn_Blank_Email_Valid_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	*/
	//9
	public void SignIn_Blank_Email_InValid_Password(String Email,String Password) throws InterruptedException
	{
		LoginEmail(Email);
		Thread.sleep(500);
		LoginPassword(Password);
		Thread.sleep(500);
		SignIn();
		Thread.sleep(500);
		Assert.assertEquals(true,Txt_Login_Title.isDisplayed());
	}
	
	
}




/*
colour btn    //a [@href='http://192.168.1.13/showroom/admin/Vehicle/vehicleColor'] 
add colour    //a [@class='btn btn-primary btn-flat btn-sm float-right']
click on varient //select [@id='vehicleVariant']
click on colour	//input [@id='vehicleColor']
submit button     (//i [@class='fa fa-check-circle'])[1]
ok                //button [@class='swal2-confirm swal2-styled']





*/
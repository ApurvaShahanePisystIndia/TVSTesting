package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PO_TVS_Vehicle_Vehicles 
{
	WebDriver driver;
	public PO_TVS_Vehicle_Vehicles(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using ="//input[@id='admin_email']")
	WebElement Txt_Login_Email;
	@FindBy(how=How.XPATH, using ="//input[@id='admin_password']")
	WebElement Txt_Login_Password;
	@FindBy(how=How.XPATH,using ="//button [@onclick='login()']")
	WebElement Btn_Sign_In;
	@FindBy(how=How.XPATH,using ="(//i [@class='bx bxs-chevron-down arrow'])[2]")
	WebElement Click_Vehicle_Drop_Down;
	@FindBy(how=How.XPATH,using ="//a [@class='btn btn-primary btn-flat btn-sm float-right'][1]")
	WebElement Click_Add_Vehicle;
	@FindBy(how=How.XPATH,using ="//select [@id='vehicleModel']")
	WebElement Select_Model_Name;
	@FindBy(how=How.XPATH,using ="//select [@id='vehicleVariant']")
	WebElement Select_Variant_Name;
	@FindBy(how=How.XPATH,using ="//select [@id='color']")
	WebElement Select_Colour;
	@FindBy(how=How.XPATH,using ="//select [@id='fuelType']")
	WebElement Select_FuelType;
	@FindBy(how=How.XPATH,using ="//select [@id='branch']")
	WebElement Select_Branch;
	@FindBy(how=How.XPATH,using ="//input [@id='hsncode']")
	WebElement Txt_HSN_Code;
	@FindBy(how=How.XPATH,using ="//input [@id='engineNo']")
	WebElement Txt_Engine_Number;
	@FindBy(how=How.XPATH,using ="//input [@id='chassis']")
	WebElement Txt_Chassis_Number;
	
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
	
	public void Btn_Vehincle()
	{
		Click_Vehicle_Drop_Down.click();
	}
	
	
	public void Btn_Add_Vehincle()
	{
		Click_Add_Vehicle.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

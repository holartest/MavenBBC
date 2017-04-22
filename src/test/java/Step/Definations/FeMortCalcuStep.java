package Step.Definations;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeMortCalcuStep {
  private WebDriver driver;
  
  
  @Given("^I am on BBC Homes Homepage$")
  public void i_am_on_BBC_Homes_Homepage() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver =new ChromeDriver();
      driver.navigate().to("http://www.bbc.co.uk/homes/");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().window().maximize();
  }

  @Given("^I click Moving Homes$")
  public void i_click_Moving_Homes() throws Throwable {
	  driver.findElement(By.linkText("Moving house?")).click();
     
  }

  @Given("^I click Property$")
  public void i_click_Property() throws Throwable {
    driver.findElement(By.xpath("//*[@id='bbcpageTableNav']/tbody/tr[2]/td/div[3]/div[1]/table/tbody/tr/td[2]/a")).click();
  }

  @When("^I click Mortgage Calculator link$")
  public void i_click_Mortgage_Calculator_link() throws Throwable {
	  driver.findElement(By.linkText("Mortgage calculator")).click();
  }
  @When("^I type into Interest rate$")
  public void i_type_into_Interest_rate() throws Throwable {
	  driver.findElement(By.name("R")).sendKeys("13");
	   
  }

  @When("^I click the calculate link$")
  public void i_click_the_calculate_link() throws Throwable {
	  driver.findElement(By.name("btnCalc")).click();
	   
  }

  @Then("^I see monthly payment details$")
  public void i_see_monthly_payment_details() throws Throwable {
     
  }

  @Then("^I click th clear button$")
  public void i_click_th_clear_button() throws Throwable {
	  driver.findElement(By.name("btnClear")).click();
  }
  @When("^Mortgage I type \"([^\"]*)\" into Mortgage required field$")
  public void mortgage_I_type_into_Mortgage_required_field(String Mortgage) throws Throwable {
	  driver.findElement(By.name("A")).sendKeys(Mortgage);
  }

  @When("^Repayment I type \"([^\"]*)\" into Repayment Period$")
  public void repayment_I_type_into_Repayment_Period(String Repayment) throws Throwable {
	  driver.findElement(By.name("T")).sendKeys(Repayment);
  }

  @When("^Interest Rate I type into \"([^\"]*)\" Interest rate field$")
  public void interest_Rate_I_type_into_Interest_rate_field(String InterestRate) throws Throwable {
      
	  driver.findElement(By.name("R")).sendKeys(InterestRate);
}
  @Then("^I closse the browser$")
  public void i_closse_the_browser() throws Throwable {
     driver.close();
  }
}
  
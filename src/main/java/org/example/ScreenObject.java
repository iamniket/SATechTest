package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ScreenObject {

    WebDriver driver;
    private By tendableImage= By.xpath("//img[@alt='Tendable Logo']");
    private By ourStory= By.linkText("Our Story");
    private By ourSolution= By.linkText("Our Solution");
    private By whyTendable= By.linkText("Why Tendable?");
    private By requestADemo = By.xpath("//div[@class='button-links-panel']//a[@class='button'][normalize-space()='Request a Demo']");
    private By contactUs= By.linkText("Contact Us");
    private By marketingText = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
    private By marketingContactUs= By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
    private By fullNameField = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]");
    private By organizationName = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]");
    private By phoneNumber =By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]");
    private By email= By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/input[1]");
    private By jobRoleDropDown= By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/select[1]");
    private By iAgreeRadioButton = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/label[2]");
    private By submitButton = By.xpath("//button[@data-loading-text='Loading...'][normalize-space()='Submit']");
    private By errorMessage = By.xpath("//p[contains(text(),'Sorry, there was an error submitting the form. Ple')]");


    public ScreenObject(WebDriver driver)
    {
        this.driver=driver;

    }

    public void setTendableImage()
    {
        WebElement tendableimg = driver.findElement(tendableImage);
        tendableimg.isEnabled();
        tendableimg.click();
        WebElement requestDemo= driver.findElement(requestADemo);
        requestDemo.isEnabled();

    }

    public void setOurStory()
    {
        WebElement ourstoryLink = driver.findElement(ourStory);
        ourstoryLink.isEnabled();
        ourstoryLink.click();
        WebElement requestDemo= driver.findElement(requestADemo);
        requestDemo.isEnabled();

    }

    public void setOurSolution()
    {
        WebElement oursolutionLink = driver.findElement(ourSolution);
        oursolutionLink.isEnabled();
        oursolutionLink.click();
        WebElement requestDemo= driver.findElement(requestADemo);
        requestDemo.isEnabled();
    }

    public void setWhyTendable()
    {
        WebElement whytendableLink = driver.findElement(whyTendable);
        whytendableLink.isEnabled();
        whytendableLink.click();
        WebElement requestDemo= driver.findElement(requestADemo);
        requestDemo.isEnabled();
    }

    public void setContactUs()
    {
        WebElement contactusClick= driver.findElement(contactUs);
        contactusClick.click();
        WebElement marketingtext= driver.findElement(marketingText);
        marketingtext.isDisplayed();
        WebElement clickMarketingContactUs= driver.findElement(marketingContactUs);
        clickMarketingContactUs.click();

    }

    public void setFormDetails()
    {
        WebElement fullnamefiled= driver.findElement(fullNameField);
        fullnamefiled.sendKeys("Niket");
        WebElement orgnamefield= driver.findElement(organizationName);
        orgnamefield.sendKeys("SATech");
        WebElement phoneNum = driver.findElement(phoneNumber);
        phoneNum.sendKeys("7276691497");
        WebElement emailID= driver.findElement(email);
        emailID.sendKeys("niketpatil20@gmail.com");
        WebElement selectdropjob = driver.findElement(jobRoleDropDown);
        Select select = new Select(selectdropjob);
        select.selectByIndex(1);
        WebElement clickIagree= driver.findElement(iAgreeRadioButton);
        clickIagree.click();
        WebElement submitBtn = driver.findElement(submitButton);
        submitBtn.click();
    }

    public void validateErrorMesssage()
    {
        WebElement errMsg = driver.findElement(errorMessage);

        Assert.assertTrue(errMsg.isDisplayed(), "Test Case is Passed");


    }






}

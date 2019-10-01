package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import objectrepository.ObjectRepository;

public class NewToursePage {

    private WebDriver driver;

    private By userId = By.xpath("//input[@name='userName']");
    private By password = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//input[@name='login']");
    private By logoutButton = By.xpath("//a[text()='SIGN-OFF']");

    public NewToursePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToNewTours(String uName, String pswd) {
    	
        WebElement uid = driver.findElement(userId);
       
        uid.clear();
        uid.sendKeys(uName);
        
        WebElement psswd = driver.findElement(password);
        psswd.sendKeys(pswd);
        
        WebElement linbtn = driver.findElement(loginButton);
        linbtn.click();
        
    }

    public String getSignOFF() {
        String signOffText = driver.findElement(logoutButton).getText();
        return signOffText;
    }

    public void logoutNewTours() {
        driver.findElement(logoutButton).click();
    }


}

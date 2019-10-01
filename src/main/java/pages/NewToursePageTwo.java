package pages;

import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewToursePageTwo {

    private WebDriver driver;

    public NewToursePageTwo(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToNewTours(String uName, String pswd) {
    	
        WebElement uid = driver.findElement(ObjectRepository.userId);
       
        uid.clear();
        uid.sendKeys(uName);
        
        WebElement psswd = driver.findElement(ObjectRepository.password);
        psswd.sendKeys(pswd);
        
        WebElement linbtn = driver.findElement(ObjectRepository.loginButton);
        linbtn.click();
        
    }

    public String getSignOFF() {
        String signOffText = driver.findElement(ObjectRepository.logoutButton).getText();
        return signOffText;
    }

    public void logououtNewTours() {
        driver.findElement(ObjectRepository.logoutButton).click();
    }

}

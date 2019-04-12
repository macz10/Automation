package org.umssdiplo.automationv01.core.managepage.Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;


public class Employee extends BasePage {
    @FindBy(css = ".btn btn-success")
    private WebElement addEmployeeBtn;

    @FindBy(css = ".btn btn-primary")
    private WebElement refreshbtn;

   private WebElement buttonDeleteEditItem(int rowNumber, int deleteEdit){
        String cssPath = ".table > tbody:nth-child(2) > tr:nth-child(" + rowNumber +") > td:nth-child(9) > button:nth-child(" + deleteEdit +")";
        WebElement deleteButton = webDriver.findElement(By.cssSelector(cssPath));
        return deleteButton;
    }

    public  void clickAddEmployee(){
        addEmployeeBtn.click();
    }
    public  void clickRefresh(){
        refreshbtn.click();
    }

    public  void clickEditBtn(){
        WebElement row1 = buttonDeleteEditItem(1,2);
        row1.click();
    }

    public  void clickDeleteBtn(){
        WebElement row1 = buttonDeleteEditItem(1,1);
        row1.click();
    }



/*
    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }*/
}

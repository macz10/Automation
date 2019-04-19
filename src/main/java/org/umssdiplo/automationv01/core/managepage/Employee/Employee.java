package org.umssdiplo.automationv01.core.managepage.Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;


public class Employee extends BasePage {
    @FindBy(css = ".btn.btn-success")
    private WebElement addEmployeeBtn;

    @FindBy(css = ".btn btn-primary")
    private WebElement refreshbtn;

    @FindBy(css = "input[name='firstName']")
    private WebElement firstName;

    @FindBy(css = "input[name='lastName']")
    private WebElement lastName;

    @FindBy(css = "input[name='ci']")
    private WebElement ciField;

    @FindBy(css = "select[name='gender']")
    private WebElement genderField;

    @FindBy(css = "input[name='address']")
    private WebElement addressField;

    @FindBy(css = "input[name='birthDate']")
    private WebElement birthDateField;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneField;

    @FindBy(css = "input[name='email']")
    private WebElement emailField;

    @FindBy(css = "select[name='employeeTypeId']")
    private WebElement employeeTypeField;

    @FindBy(css = "input[name='salary']")
    private WebElement employeeSalary;

    @FindBy(css = "button[type='submit'")
    private WebElement createButton;

    @FindBy(css ="button.btn.btn-danger[type='button']")
    private WebElement cancelButton;

    @FindBy(css= ".table.table-striped >tbody>tr")
    private  WebElement rowsEmployee;

    @FindBy(css = ".table.table-striped  > tbody >tr")
    private List<WebElement> employeeRows;



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

    public void setCredentials() {
       /* String fName = "Carlos";
        String lName = "Camacho";
        CommonEvents.setInputField(firstName, fName);
        CommonEvents.setInputField(lastName, lName);
        CommonEvents.setInputField(ciField, "1234");
        CommonEvents.setInputField(genderField, "M");
        CommonEvents.setInputField(addressField, "calle sn");
        CommonEvents.setInputField(birthDateField, "12/12/12");
        CommonEvents.setInputField(phoneField, "654654");
        CommonEvents.setInputField(emailField, "asd@asd.com");
        CommonEvents.setInputField(employeeTypeField, "Obrero");
        CommonEvents.setInputField(employeeTypeField, "1254");*/
        CommonEvents.clickButton(cancelButton);
    }

    public void fillFirstName(String data){
        firstName.clear();
        firstName.sendKeys(data);
    }

    public void fillLastName(String data){
        lastName.clear();
        lastName.sendKeys(data);
    }

    public void fillCi(String data){
        ciField.clear();
        ciField.sendKeys(data);
    }

    public void fillGender(String data){
        genderField.sendKeys(data);
    }

    public void fillAddress(String data){
        addressField.clear();
        addressField.sendKeys(data);
    }

    public void fillDOB(String data){
        birthDateField.sendKeys(data);
    }

    public void fillPhone(String data){
        phoneField.clear();
        phoneField.sendKeys(data);
    }

    public void fillEmailField(String data){
        emailField.clear();
        emailField.sendKeys(data);
    }

    public void fillEmployeeType(String data){
        employeeTypeField.sendKeys(data);
    }

    public void fillSalaryField(String data){
        employeeSalary.clear();
        employeeSalary.sendKeys(data);
    }

    public void clickCreateButton(){
        createButton.click();
    }

    public void clickDeleteEditButton(int rowNumber, int deleteEdit){
        WebElement fila1 = buttonDeleteEditItem(rowNumber,deleteEdit);
        fila1.click();
    }

    public String getLastNameEmployee(){
        WebElement lastElement = employeeRows.get(employeeRows.size()-1);
        List<WebElement> deleteButton = lastElement.findElements(By.cssSelector("td"));
        String name = deleteButton.get(1).getText();
        return name;
    }
}

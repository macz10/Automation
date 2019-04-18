package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.umssdiplo.automationv01.core.managepage.Employee.Employee;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSwagger {
    private Employee employee;

    @Given("^'Employee List' page is loaded$")
    public void employeeListPageIsLoaded() throws Throwable {
        employee = LoadPage.employee();
    }

    @And("^setCredentials$")
    public void setCredentials() {
        employee.setCredentials();
    }

    @And("^clickAddEmployee$")
    public void clickAddEmployee() throws Throwable {
        employee.clickAddEmployee();
    }

    @And("^clickEditBtn$")
    public void clickEditBtn() throws Throwable {
        employee.clickEditBtn();
    }

    @And("^clickDeleteBtn$")
    public void clickDeleteBtn() throws Throwable {
        employee.clickDeleteBtn();
    }

    @And("^clickRefresh$")
    public void clickRefresh() throws Throwable {
        employee.clickRefresh();
    }

    @And("^add 'Employee' data$")
    public void addNewEmployee() throws Throwable{
       // employee.clickAddEmployee();
        fillData();
        employee.clickCreateButton();
    }

    @And("^edit 'Employee' data$")
    public void EditNewEmployee() throws Throwable{
        employee.clickDeleteEditButton(1,2);
        fillData();
        employee.clickCreateButton();
    }



    private void fillData(){
        employee.fillFirstName("Carlos1");
        employee.fillLastName("Camacho1");
        employee.fillCi("5188819");
        employee.fillGender("MALE");
        employee.fillAddress("J. E. Molina");
        employee.fillDOB("08/08/1982");
        employee.fillPhone("79324048");
        employee.fillEmailField("a@a.com");
        employee.fillEmployeeType("Electricista");
        employee.fillSalaryField("158");
    }

    @And("^verify \"([^\"]*)\" is displayed in 'Employee' page$")
    public void verifyIsDisplayedInEmployeePage(String nameEmployeeExpected) throws Throwable {
        String nameEmployActual = employee.getLastNameEmployee();

        Assert.assertEquals(nameEmployActual, nameEmployeeExpected, "error message ");
    }
}

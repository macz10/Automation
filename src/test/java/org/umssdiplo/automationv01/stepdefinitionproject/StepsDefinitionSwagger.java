package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Employee.Employee;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSwagger {
    private Employee employee;

    @Given("^'Employee List' page is loaded$")
    public void employeeListPageIsLoaded() throws Throwable {
        employee = LoadPage.employee();
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
}

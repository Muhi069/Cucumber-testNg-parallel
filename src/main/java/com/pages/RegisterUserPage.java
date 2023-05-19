package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUserPage {

    private WebDriver driver;

    public RegisterUserPage(WebDriver driver) {
        this.driver= driver;
    }

    public String REG_URL= "https://localhost:44369/register?returnUrl=%2F";


    //////////////*** Locators ***////////////
    public By FIRST_NAME= By.xpath("//input[@id='FirstName']");
    public By LAST_NAME= By.xpath("//input[@id='LastName']");
    public By EMAIL= By.xpath("//input[@id='Email']");
    public By PASSWORD= By.xpath("//input[@id='Password']");
    public By CONFIRM_PASSWORD= By.xpath("//input[@id='ConfirmPassword']");
    public By REG_BTN= By.xpath("//button[@id='register-button']");
    public By firstNameError= By.xpath("//span[@id='FirstName-error']");
    public By lastNameError= By.xpath("//span[@id='LastName-error']");
    public By emailError1= By.xpath("//span[@id='Email-error']"); //email required
    public By emailError2= By.xpath("//span[@id='Email-error']"); //invalid mail format
    public By emailError3= By.xpath("//*[text()=\"The specified email already exists\"]"); //existing mail
    public By passError1= By.xpath("//span[@class='field-validation-error']"); //pass length error
    public By passError2= By.xpath("//span[@id='Password-error']"); //password required
    public By passError3= By.xpath("//span[@id='ConfirmPassword-error']"); // password doesn't match
    public By confirmPassError= By.xpath("//span[@id='ConfirmPassword-error']");
    public By Confirmation_msg= By.xpath("//*[text()=\"Your registration completed\"]");




    ///////////////***Methods***//////////////

    public void goToPage() {
        driver.get(REG_URL);
    }


    public void setFirstName(String firstname) {
        driver.findElement(FIRST_NAME).sendKeys(firstname);
    }

    public void setLAST_NAME(String lastname) {
        driver.findElement(LAST_NAME).sendKeys(lastname);
    }

    public void setEMAIL(String email) {
        driver.findElement(EMAIL).sendKeys(email);
    }

    public void setPASSWORD(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void setCONFIRM_PASSWORD(String confirmPassword) {
        driver.findElement(CONFIRM_PASSWORD).sendKeys(confirmPassword);
    }

    public void clickRegBtn() {
        driver.findElement(REG_BTN).click();
    }

    // empty frstname //
    public String FirstNameError() {
        String frstNameErr= driver.findElement(firstNameError).getText();
        System.out.println(frstNameErr);
        return frstNameErr;
    }

    // empty lastname //
    public String LastNameError() {
        String lastNameErr= driver.findElement(lastNameError).getText();
        System.out.println(lastNameErr);
        return lastNameErr;
    }

    // empty mail //
    public String EmailError1() {
        String emailErr1= driver.findElement(emailError1).getText();
        System.out.println(emailErr1);
        return emailErr1;
    }


    // invalid mail format //
    public String EmailError2() {
        String emailErr2= driver.findElement(emailError2).getText();
        System.out.println(emailErr2);
        return emailErr2;
    }

    // existing email //
    public String EmailError3() {
        String emailErr3= driver.findElement(emailError3).getText();
        System.out.println(emailErr3);
        return emailErr3;
    }

    //invalid password length //
    public String PassError1() {
        String passErr1= driver.findElement(passError1).getText();
        System.out.println(passErr1);
        return passErr1;
    }

    // error for empty pass field //
    public String PassError2() {
        String passErr2= driver.findElement(passError2).getText();
        System.out.println(passErr2);
        return passErr2;
    }

    // error for empty pass field //
    public String PassError3() {
        String passErr3= driver.findElement(passError3).getText();
        System.out.println(passErr3);
        return  passErr3;
    }

    // pass: admin1234, conf_pass: admin12345 //
    public String PassError4() {
        String passErr4= driver.findElement(passError3).getText();
        System.out.println(passErr4);
        return  passErr4;
    }

    // confirm pass empty //
    public String PassError5() {
        String passErr5= driver.findElement(confirmPassError).getText();
        System.out.println(passErr5);
        return passErr5;
    }

    // confirm register //
    public String ConfirmReg() {
        String confirm= driver.findElement(Confirmation_msg).getText();
        System.out.println(confirm);
        return confirm;
    }

}

package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

import java.util.concurrent.TimeUnit;

public class ContactsAddTests extends TestBase {


  @Test
  public void testsContactsAdd() {
    app.gotoContactsPage();
    app.fillContactsForm(new ContactsData("Alex", "Doe", "+79454560265", "alex.doe@mail.ru"));
    app.submitContactsCreation();
    app.returnToHomePage();
  }

}
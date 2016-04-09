package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.tests.TestBase;

import static org.openqa.selenium.OutputType.*;

public class ContactsDeletionTests extends TestBase {


    @Test
    public void testsContactsDeletion() {
      app.openContacts();
      app.selectContact();
      app.deleteContact();
      app.closeWindow();
    }

}

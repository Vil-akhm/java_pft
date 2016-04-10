package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactsAddTests extends TestBase {


  @Test
  public void testsContactsAdd() {
    app.gotoContactsPage();
    app.fillContactsForm(new ContactsData("Alex", "Doe", "+79454560265", "alex.doe@mail.ru"));
    app.submitContactsCreation();
    app.returnToHomePage();
  }

}
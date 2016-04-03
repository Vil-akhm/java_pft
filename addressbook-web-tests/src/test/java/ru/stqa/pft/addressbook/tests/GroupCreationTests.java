package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage(); // переход на страницу группы
    app.initGroupCreation(); // инициализация группы
    app.fillGroupForm(new GroupData("test1", "test2", "test3")); //заполнить форму
    app.submitGroupCreation(); // подвердить создание группы
    app.returnToGroupPage(); // вернуться на страницу
  }

}

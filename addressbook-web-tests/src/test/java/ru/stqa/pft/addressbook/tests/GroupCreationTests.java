package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage(); // переход на страницу группы
    app.getGroupHelper().initGroupCreation(); // инициализация группы
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3")); //заполнить форму
    app.getGroupHelper().submitGroupCreation(); // подвердить создание группы
    app.getGroupHelper().returnToGroupPage(); // вернуться на страницу
  }

}

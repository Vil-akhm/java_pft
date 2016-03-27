package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Admin on 27.03.2016.
 */
public class RectangleTests {

  @Test
  public void testArea() {
                   Rectangle p1 = new Rectangle(6, 8);
                   Rectangle p2 = new Rectangle(10, 4);
    Assert.assertEquals(p2.distance(p1),5.656854249492381);
  }
}

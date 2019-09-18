package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests2 {
  @Test
  public void testNull(){
 Point p1 = new Point(1,1);
 Point p2 = new Point(1,1);
    Assert.assertEquals(p1.distance(p1, p2), 0);
  }
}

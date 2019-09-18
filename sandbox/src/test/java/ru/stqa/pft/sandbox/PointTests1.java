package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests1 {
  @Test
  public void testDistance(){
    Point p1 = new Point(2,5);
    Point p2 = new Point(1,10);
    Assert.assertEquals(p1.distance(p1, p2),5.0990195135927845);
  }
}
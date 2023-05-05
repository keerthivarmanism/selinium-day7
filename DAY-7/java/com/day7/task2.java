package com.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class task2 {
  int c;
  int a=7;
  int b=4;
  @Test(priority=1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,11);
  }
  @Test(priority=3)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c,3);
  }
  @Test(priority=2)
  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c,28);
  }
  @Test(priority=4)
  public void div() {
	  c=a/b;
	  Assert.assertEquals(c,1);
  }
}


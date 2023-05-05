package day9;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class task1 {
	int a,b,c;
  @Test(dataProvider = "dp",priority=2)
  public void add(Integer a, Integer b) {
	  c=a+b;
	  System.out.println("Sum = " + c);
	  Assert.assertEquals(c,15);
  }
  @Test(dataProvider = "dp",priority=4)
  public void sub(Integer a, Integer b) {
	  c=a-b;
	  System.out.println("Sub = " + c);
	  Assert.assertEquals(c,5);
  }
  @Test(dataProvider = "dp",priority=3)
  public void mul(Integer a, Integer b) {
	  c=a*b;
	  System.out.println("Mul = " + c);
	  Assert.assertEquals(c,50);
  }
  @Test(dataProvider = "dp",priority=1)
  public void div(Integer a, Integer b) {
	  c=a/b;
	  System.out.println("Div = " + c);
	  Assert.assertEquals(c,2);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
    };
  }
}

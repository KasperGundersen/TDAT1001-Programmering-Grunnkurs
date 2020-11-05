import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

class BokstaveringsalfabetTest{
  Bokstaveringsalfabet instance;
  double delta = 0.0001;

  @BeforeClass
  public static void setUpClass() throws Exception{
    //databaseinnlogging
  }

  @AfterClass
  public static void tearDownClass() throws Exception{
    //database logUt
  }

  @Before
  public void setUp(){
    String tabell = "Alfa-Charlie-Bravo-Delta";
    instance = new Bokstaveringsalfabet("Kaspers", tabell, "-");
  }

  @After
  public void tearDown(){
    instance = null;
  }

  @Test
  public void testSorter(){
    System.out.println("SorterTest");
    String[] expectRes = {"Alfa", "Charlie", "Bravo", "Delta"};
    String[] result = instance.sorter();
    assertEquals(expectRes, result);
  }

  @Test
  public void konverterTest(){
    System.out.println("konverterTest");
    String ord = "ABBA";
    String expectRes = "Alfa Bravo Bravo Alfa";
    String result = instance.getBokstaver(ord);
    assertEquals(expectRes, result);
  }

  public static void main(String[] args){
    org.junit.runner.JUnitCore.main(BokstaveringsalfabetTest.class.getName());
  }
}

package envelopes;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EnvelopeTest {
  Envelope a;
  Envelope b;

  @BeforeMethod
  public void setUp() {
  }

  @AfterMethod
  public void tearDown() {
  }

  @Test
  public void compareThatAisLargerThenB() {
    a = new Envelope("A", 2, 2);
    b = new Envelope("B", 1, 1);

    String expected = "\nEnvelop A larger\n";
    String actual = Envelope.compare(a, b);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compareThatBisLargerThenA() {
    a = new Envelope("A", 3, 4);
    b = new Envelope("B", 5, 4);

    String expected = "\nEnvelop B larger\n";
    String actual = Envelope.compare(a, b);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compareThatImpossibleToPutEnvelopes() {
    a = new Envelope("A", 3, 4);
    b = new Envelope("B", 2, 6);

    String expected = "\nImpossible to put an envelope in each other\n";
    String actual = Envelope.compare(a, b);

    Assert.assertEquals(expected, actual);
  }

}
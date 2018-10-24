package triangles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleServiceTest {
    private String correctString = "Name, 1.1,2.2,3.3";
    private String incorrectString = " a,2..2,0";
    String[] correctParams = new String[]{"Name","1.1","2.2","3.3"};
    String[] incorrectParams = new String[]{"Name","0","a","3.3",""};

    @Test
    public void testStringCorrectFormat() {
        Assert.assertTrue(TriangleService.correctStringFormat(correctParams));
    }

    @Test
    public void testStringIncorrectFormat() {
        Assert.assertFalse(TriangleService.correctStringFormat(incorrectParams));
    }

    @Test
    public void testValuesCorrectTypes() {
       Assert.assertTrue(TriangleService.valuesCorrectTypes(correctParams));
    }

    @Test
    public void testValuesIncorrectTypes() {
        Assert.assertFalse(TriangleService.valuesCorrectTypes(incorrectParams));
    }

    @Test
    public void testParseStringtoArray() {
        Assert.assertEquals(TriangleService.parseStringtoArray(correctString),correctParams);
    }
}
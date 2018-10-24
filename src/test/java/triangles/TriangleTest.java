package triangles;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {
    Triangle triangle;
    final int ZERO = 0;
    final double INV = 33.3;
    final String ZEROMESSAGE = "Size can't be 0";
    final String WRONGSIDEMESSAGE = "Wrong side size";

    @BeforeMethod
    public void setUp() throws TriangleCantExist {
        triangle = new Triangle("Name", 3.3, 3.2, 4.4);
    }


    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = ZEROMESSAGE)
    public void testSetAwithZero() throws TriangleCantExist{
        triangle.setA(ZERO);
    }

    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = ZEROMESSAGE)
    public void testSetBwithZero() throws TriangleCantExist{
        triangle.setB(ZERO);
    }

    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = ZEROMESSAGE)
    public void testSetCwithZero() throws TriangleCantExist{
        triangle.setC(ZERO);
    }

    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = WRONGSIDEMESSAGE)
    public void testSetAwithInvalidSizde() throws TriangleCantExist{
        triangle.setA(INV);
    }

    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = WRONGSIDEMESSAGE)
    public void testSetBwithInvalidSizde() throws TriangleCantExist{
        triangle.setB(INV);
    }

    @Test (expectedExceptions = TriangleCantExist.class, expectedExceptionsMessageRegExp = WRONGSIDEMESSAGE)
    public void testSetCwithInvalidSizde() throws TriangleCantExist{
        triangle.setC(INV);
    }
}
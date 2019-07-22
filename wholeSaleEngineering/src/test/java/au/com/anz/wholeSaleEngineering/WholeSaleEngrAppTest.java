package au.com.anz.wholeSaleEngineering;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for WholeSaleEngrApp.
 * @author Suwath Mihindukulasooriya
 */
public class WholeSaleEngrAppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WholeSaleEngrAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( WholeSaleEngrAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGetAccount()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testGetAccountTransaction()
    {
        assertTrue( true );
    }
}

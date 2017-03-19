package ${package};

import org.apache.log4j.Logger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ${library-name}Test extends TestCase{

	private static final Logger logger = Logger.getLogger(${library-name}Test.class);
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ${library-name}Test( String testName ){
        super( testName );
    }

	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(${library-name}Test.class );
    }

	/**
     * Rigourous Test :-)
     */
    public void test${library-name}(){
    	assertTrue(true);
    	}
    
    }

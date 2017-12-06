
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.Test;

public class NewEmptyJUnitTest extends TestCase {
    
    public NewEmptyJUnitTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    @Test
    public ArrayList<String> lirepseudo() {
        ArrayList pseudo = new ArrayList();
        return pseudo;
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}

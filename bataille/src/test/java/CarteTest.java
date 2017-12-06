
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import upmc.game.Carte;

public class CarteTest {
    
    public CarteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCompare(){    
        Carte carte1 = new Carte(2, "pique");
        Carte carte2 = new Carte(3, "trefle");
        if (carte2.valeur > carte1.valeur){
            System.out.println("c'est bon la carte gagnante est");
        }
        else if (carte1.valeur > carte2.valeur){
            fail();
        }
        else {
            fail();
        }
        
    }
        
    }


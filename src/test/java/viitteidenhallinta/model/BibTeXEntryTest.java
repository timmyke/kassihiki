
package viitteidenhallinta.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BibTeXEntryTest {
    private BibTeXEntry e;
    
    public BibTeXEntryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        e = new BibTeXEntry();
        e.setId(42);
        e.setEntryType(BibTeXType.book);
        e.setAuthor("Milne, A. A.");
        e.setTitle("Winnie the Pooh");
        e.setAddress("London");
        e.setPublisher("Methuen");
        e.setPublicationYear("1977(1926)");
        e.setNote("Lisäpainokset: repr. 1945.");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEntryType method, of class BibTeXEntry.
     */
    @Test
    public void testGetEntryType() {
        assertEquals(e.getEntryType(), BibTeXType.book);
    }

    /**
     * Test of setEntryType method, of class BibTeXEntry.
     */
    @Test
    public void testSetEntryType() {
        e.setEntryType(BibTeXType.booklet);
        assertEquals(e.getEntryType(), BibTeXType.booklet);
    }

    /**
     * Test of getAddress method, of class BibTeXEntry.
     */
    @Test
    public void testGetAddress() {
        assertEquals(e.getAddress(), "London");
    }

    /**
     * Test of setAddress method, of class BibTeXEntry.
     */
    @Test
    public void testSetAddress() {
        e.setAddress("Paris");
        assertEquals(e.getAddress(), "Paris");
    }


    /**
     * Test of getTitle method, of class BibTeXEntry.
     */
    @Test
    public void testGetTitle() {
        assertEquals(e.getTitle(), "Winnie the Pooh");
    }

    /**
     * Test of setTitle method, of class BibTeXEntry.
     */
    @Test
    public void testSetTitle() {
        e.setTitle("Winnie-the-Pooh");
        assertEquals(e.getTitle(), "Winnie-the-Pooh");
    }

    /**
     * Test of getNote method, of class BibTeXEntry.
     */
    @Test
    public void testGetNote() {
        assertEquals(e.getNote(), "Lisäpainokset: repr. 1945.");
    }

    /**
     * Test of setNote method, of class BibTeXEntry.
     */
    @Test
    public void testSetNote() {
        e.setNote("Hello, world!");
        assertEquals(e.getNote(), "Hello, world!");
    }

    /**
     * Test of getPublisher method, of class BibTeXEntry.
     */
    @Test
    public void testGetPublisher() {
        assertEquals(e.getPublisher(), "Methuen");
    }

    /**
     * Test of setPublisher method, of class BibTeXEntry.
     */
    @Test
    public void testSetPublisher() {
        e.setPublisher("Random Publisher");
        assertEquals(e.getPublisher(), "Random Publisher");
    }

    /**
     * Test of getPublicationYear method, of class BibTeXEntry.
     */
    @Test
    public void testGetPublicationYear() {
        assertEquals(e.getPublicationYear(), "1977(1926)");
    }

    /**
     * Test of setPublicationYear method, of class BibTeXEntry.
     */
    @Test
    public void testSetPublicationYear() {
        e.setPublicationYear("1977");
        assertEquals(e.getPublicationYear(), "1977");
    }

    /**
     * Test of getId method, of class BibTeXEntry.
     */
    @Test
    public void testGetId() {
        assertEquals(e.getId(), Integer.valueOf(42));
    }

    /**
     * Test of setId method, of class BibTeXEntry.
     */
    @Test
    public void testSetId() {
        e.setId(43);
        assertEquals(e.getId(), Integer.valueOf(43));
    }

    /**
     * Test of getAuthor method, of class BibTeXEntry.
     */
    @Test
    public void testGetAuthor() {
        assertEquals(e.getAuthor(), "Milne, A. A.");
    }

    /**
     * Test of setAuthor method, of class BibTeXEntry.
     */
    @Test
    public void testSetAuthor() {
        e.setAuthor("Paasilinna");
        assertEquals(e.getAuthor(), "Paasilinna");
    }

       
}

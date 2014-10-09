/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viitteidenhallinta.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author risto
 */
public class InProceedingsViiteTest {
    
    public InProceedingsViiteTest() {
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


    /**
     * Test of getBibtex method, of class InProceedingsViite.
     */
    @org.junit.Test
    public void testGetBibtex() {
        InProceedingsViite viite = new InProceedingsViite();
        viite.setAuthor("Olli Hokkanen");
        viite.setBookTitle("Elämäni kolat");
        viite.setTitle("Lumen kolaaminen");
        viite.setYear(1995);
        String tulos = viite.getBibtex();
        assertEquals("@INPROCEEDINGS{Elämäni,\n"
                + "\tauthor = {Olli Hokkanen},\n"
                + "\ttitle = {Lumen kolaaminen},\n"
                + "\tbooktitle = {Elämäni kolat},\n"
                + "\tyear = {1995}\n"
                + "}\n", tulos);
        
    }
    
}

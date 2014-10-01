/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viitteidenhallinta.service;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viitteidenhallinta.model.InProceedingsViite;
import static org.mockito.Mockito.*;

/**
 *
 * @author tim
 */
public class ViiteServiceTest {
    
    public ViiteServiceTest() {
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
    
    @Test
    public void voidaanLisataViite() {
        
        
    }

    /**
     * Test of addViite method, of class ViiteService.
     */
    @Test
    public void testAddViite() {
        EntityManager em = mock(EntityManager.class);
        InProceedingsViite viite = new InProceedingsViite();
        
        ViiteService instance = new ViiteService(em);
        instance.addViite(viite);
        
        verify(em).persist(viite);
    }
    
}

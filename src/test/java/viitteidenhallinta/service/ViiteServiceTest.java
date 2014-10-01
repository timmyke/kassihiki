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


    @Test
    public void addViiteLisaaViitteen() {
        EntityManager em = mock(EntityManager.class);
        InProceedingsViite viite = new InProceedingsViite();
        
        ViiteService viitteet = new ViiteService(em);
        viitteet.addViite(viite);
        
        verify(em).persist(viite);
    }
    
    @Test
    public void viiteListausPalauttaaKaikkiViitteet() {
        EntityManager em = mock(EntityManager.class);
        InProceedingsViite viite = new InProceedingsViite();
        
        ViiteService viitteet = new ViiteService(em);
        viitteet.addViite(viite);
        
        verify(em).createQuery(anyString());
    }
    
    
    @Test
    public void viitePoistoPoistaaViitteet() {
        EntityManager em = mock(EntityManager.class);
        InProceedingsViite viite = new InProceedingsViite();
        
        ViiteService viitteet = new ViiteService(em);
        viitteet.remove(viite);
        
        verify(em).remove(viite);
    }
    
    
    
}

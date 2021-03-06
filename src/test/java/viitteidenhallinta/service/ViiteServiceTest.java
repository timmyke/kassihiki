/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viitteidenhallinta.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viitteidenhallinta.model.Project;
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
        Project viite = new Project();
        
        ViiteService viitteet = new ViiteService();
        viitteet.addEntityManager(em);
        viitteet.addViite(viite);
        
        verify(em).persist(viite);
    }
    
//    @Test
//    public void viiteListausPalauttaaKaikkiViitteet() {
//        EntityManager em = mock(EntityManager.class);
//        Project viite = new Project();
//        ViiteService viitteet = new ViiteService(em);
//        
//        when(em.createQuery(CriteriaQuery.class).getResultList())
//                .thenReturn(new ArrayList<InProceedingsViite>());
//        
//        viitteet.listViite();
//        
//        
//        
//        verify(em).createQuery(anyString());
//    }
    
    
    @Test
    public void viitePoistoPoistaaViitteet() {
        EntityManager em = mock(EntityManager.class);
        Project viite = new Project();
        ViiteService viitteet = new ViiteService();
        viitteet.addEntityManager(em);
        
        when(em.find(Project.class, 1))
                .thenReturn(viite);
        
        viitteet.removeViite(1);
        
        verify(em).remove(viite);
    }
    
    
    
}

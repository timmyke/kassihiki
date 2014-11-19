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
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import viitteidenhallinta.model.Project;
import viitteidenhallinta.model.Task;

public class TaskServiceTest {

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
    public void voidaanLisataTaskiProjektiin() {
        ITaskRepository repo = mock(TaskRepository.class);
        TaskService taskit = new TaskService();
        taskit.addTaskRepository(repo);
        
        Task task = new Task();
        taskit.addTask(task);
        
        verify(repo).addTask(task);
    }
    
    @Test
    public void voidaanHakeaProjektinTaskit() {
        ITaskRepository repo = mock(TaskRepository.class);
        TaskService taskit = new TaskService();
        taskit.addTaskRepository(repo);
        
        
        Task eka = new Task();
        eka.setProjectId(1);
        List tasks = new ArrayList<Task>();
        tasks.add(eka);
        
        Task toinen = new Task();
        toinen.setProjectId(2);
        tasks.add(toinen);
        
        when(repo.listTasks()).thenReturn(tasks);
        
        eka.setProjectId(1);
        List returned = taskit.getTasksByProject(1);
        
        verify(repo).listTasks();
        
        assertEquals(returned.get(0), eka);
    }
    

}

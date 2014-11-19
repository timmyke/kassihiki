/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viitteidenhallinta.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import viitteidenhallinta.model.Task;

@Repository
public class TaskRepository implements ITaskRepository {
    @PersistenceContext
    EntityManager em;
    
    public void addEntityManager(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void addTask(Task task) {
            em.merge(task);
    }

    @Transactional
    @Override
    public List<Task> listTasks() {
        CriteriaQuery<Task> c = em.getCriteriaBuilder().createQuery(Task.class);
        c.from(Task.class);
        return em.createQuery(c).getResultList();
    }

    @Transactional
    @Override
    public Task getTask(Integer id) {
        return em.find(Task.class, id);
    }
}

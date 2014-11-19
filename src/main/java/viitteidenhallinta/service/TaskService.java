/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viitteidenhallinta.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import viitteidenhallinta.model.Task;

@Service
public class TaskService implements ITaskService {

    @Autowired
    ITaskRepository repo;

    public void addTaskRepository(ITaskRepository repo) {
        this.repo = repo;
    }

    @Transactional
    @Override
    public void addTask(Task task) {
        repo.addTask(task);
    }

    @Transactional
    @Override
    public List<Task> listTasks() {
        return repo.listTasks();
    }

    @Transactional
    @Override
    public Task getTask(Integer id) {
        return repo.getTask(id);
    }

    @Transactional
    @Override
    public List<Task> getTasksByProject(Integer id) {
        List<Task> tasks = listTasks();
        List<Task> toRemove = new ArrayList<Task>();
        for (Task a : tasks) {
            if (a.getProjectId() != id) {
                toRemove.add(a);
            }
        }
        tasks.removeAll(toRemove);
        return tasks;
    }

    /**
     * Taski seuraavaan tilaan
     *
     * @param task
     */
    @Transactional
    @Override
    public void moveForward(Task task) {
        if (task.getState() < 2) { // Sori hattuvakiosta...
            task.setState(task.getState() + 1);
            repo.addTask(task);
        }
    }

    @Transactional
    @Override
    public void moveBackwards(Task task) {
        if (task.getState() > 0) { // Stetson-Harrison täällä terve
            task.setState(task.getState() - 1);
            repo.addTask(task);
        }
    }

}

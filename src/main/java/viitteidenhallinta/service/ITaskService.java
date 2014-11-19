/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viitteidenhallinta.service;

import java.util.List;
import viitteidenhallinta.model.Task;



public interface ITaskService {
    public void addTask(Task task);
    public List<Task> listTasks();
    public Task getTask(Integer id);
    public List<Task> getTasksByProject(Integer id);
    public void moveForward(Task task);
    public void moveBackwards(Task task);
}

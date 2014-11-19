package viitteidenhallinta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import viitteidenhallinta.model.Project;
import viitteidenhallinta.model.Task;
import viitteidenhallinta.service.ITaskService;
import viitteidenhallinta.service.IViiteService;


@Controller
public class ViiteController {

    @Autowired
    private IViiteService projectService;
    
    @Autowired
    private ITaskService taskService;

    @RequestMapping("/")
    public String listViitte(Map<String, Object> map) {

        map.put("project", new Project());
        map.put("projectList", projectService.listViite());

        return "viite";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addViite(@ModelAttribute("viite") Project viite, BindingResult result) {

        projectService.addViite(viite);

        return "redirect:/";
    }

    @RequestMapping("/delete/{viiteId}")
    public String deleteViite(@PathVariable("viiteId") Integer viiteId) {

        projectService.removeViite(viiteId);

        return "redirect:/";
    }
    
    @RequestMapping("/project/{id}")
    public String tasksForProject(@PathVariable("id") Integer id, Map<String, Object> map) {
        Task uusiTaski = new Task();
        uusiTaski.setProjectId(id);
        
        List<Task> taskit = taskService.getTasksByProject(id);
        
        
        map.put("task", uusiTaski);
        map.put("taskList", taskit);
        map.put("tiedot", "trolol");
        return "project";
    }
    
    
    @RequestMapping(value="/project/{id}", method = RequestMethod.POST)
    public String addTask(@PathVariable("id") Integer id, Task task) {
        task.setProjectId(id);
        taskService.addTask(task);
        return "redirect:/project/"+id;
    }
    
    // HTTP-getin ei kuuluisi vaikuttaa tilaan...
    @RequestMapping(value="/task/{id}")
    public String forwardTask(@PathVariable("id") Integer id) {
        Task task = taskService.getTask(id);
        taskService.moveForward(task);
        
        return "redirect:/project/"+task.getProjectId();
    }
    
    
    @RequestMapping("/bibliography")
    public String displayBibliography(Map<String, Object> map) {
        List<String> l = new ArrayList<String>();
        for (Project v:projectService.listViite())
            l.add("trol");
        map.put("viiteList", l);
        return "bibliography";
    }
}

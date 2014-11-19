package viitteidenhallinta.service;


import java.util.List;

import viitteidenhallinta.model.Project;

public interface IViiteService {
    
    public void addViite(Project project);
    public List<Project> listViite();
    public void removeViite(Integer id);
    public Project getViite(Integer id);
}

package viitteidenhallinta.service;


import java.util.List;

import viitteidenhallinta.model.InProceedingsViite;

public interface IViiteService {
    
    public void addViite(InProceedingsViite person);
    public List<InProceedingsViite> listViite();
    public void removeViite(Integer id);
}

/*package viitteidenhallinta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import viitteidenhallinta.model.InProceedingsViite;
import viitteidenhallinta.service.IViiteService;

import java.util.Map;

@Controller("bibtex")
public class BibtexController {
    
    @Autowired
    private IViiteService viiteService;
    
    
    @RequestMapping(value = "/bibtex/{id}")
    public String naytaBibtex(@PathVariable("id") Integer id, Map<String, Object> map) {
        map.put("tiedot", viiteService.getViite(id));
        return "redirect:/bibtex/";
    }    
}
*/
package viitteidenhallinta.controller;

import java.util.ArrayList;
import java.util.List;
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

@Controller
public class ViiteController {

    @Autowired
    private IViiteService viiteService;

    @RequestMapping("/")
    public String listViitte(Map<String, Object> map) {

        map.put("viite", new InProceedingsViite());
        map.put("viiteList", viiteService.listViite());

        return "viite";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addViite(@ModelAttribute("viite") InProceedingsViite viite, BindingResult result) {

        viiteService.addViite(viite);

        return "redirect:/";
    }

    @RequestMapping("/delete/{viiteId}")
    public String deleteViite(@PathVariable("viiteId") Integer viiteId) {

        viiteService.removeViite(viiteId);

        return "redirect:/";
    }
    
    @RequestMapping("/bibtex/{id}")
    public String bibtexViite(@PathVariable("id") Integer id, Map<String, Object> map) {
        map.put("tiedot", viiteService.getViite(id).getBibtex());
        return "bibtex";
    }
    
    @RequestMapping("/bibliography")
    public String displayBibliography(Map<String, Object> map) {
        List<String> l = new ArrayList<String>();
        for (InProceedingsViite v:viiteService.listViite())
            l.add(v.getBibtex());
        map.put("viiteList", l);
        return "bibliography";
    }
}

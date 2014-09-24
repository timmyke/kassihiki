package viitteidenhallinta.controller;

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

@Controller("viite")
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

        return "redirect:/viite/";
    }

    @RequestMapping("/delete/{viiteId}")
    public String deleteViite(@PathVariable("viiteId") Integer personId) {

        viiteService.removeViite(personId);

        return "redirect:/viite/";
    }
}

package viitteidenhallinta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import viitteidenhallinta.model.BibTeXEntry;
import viitteidenhallinta.service.BibTeXStorageService;

import java.util.Map;

@Controller("viite")
public class EntryController {

    @Autowired
    private BibTeXStorageService viiteService;

    @RequestMapping("/")
    public String listEntries(Map<String, Object> map) {

        map.put("viite", new BibTeXEntry());
        map.put("viiteList", viiteService.listEntries());

        return "viite";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEntry(@ModelAttribute("viite") BibTeXEntry viite, BindingResult result) {

        viiteService.addEntry(viite);

        return "redirect:/viite/";
    }

    @RequestMapping("/delete/{viiteId}")
    public String deleteEntry(@PathVariable("viiteId") Integer personId) {

        viiteService.removeEntry(personId);

        return "redirect:/viite/";
    }
}

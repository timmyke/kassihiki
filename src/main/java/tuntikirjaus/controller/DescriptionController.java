package tuntikirjaus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tuntikirjaus.domain.Description;
import tuntikirjaus.domain.ConfigurationProfile;
import tuntikirjaus.service.DescriptionService;

@Controller
public class DescriptionController {

    private final String DEFAULT_PROFILE_NAME = "Development Machine";
    private final String CI_PROFILE_NAME = "Continuous Integration Machine";
    private final String PRODUCTION_PROFILE_NAME = "Production Machine";
    
    @Autowired
    private ConfigurationProfile profile;
    
    @Autowired
    private DescriptionService descriptionService;
    
    @PostConstruct
    public void init() {
        
        Description[] dev = new Description[] { new Description("defaulting"), new Description("developable") };
        Description[] ci = new Description[] { new Description("integrable"), new Description("testable") };
        Description[] production = new Description[] { new Description("productive"), new Description("releasable") };
        
        if (profile.getName().equals(DEFAULT_PROFILE_NAME)) {
            descriptionService.save(new ArrayList<Description>(Arrays.asList(dev)));
        } else if (profile.getName().equals(CI_PROFILE_NAME)) {
            descriptionService.save(new ArrayList<Description>(Arrays.asList(ci)));
        } else if (profile.getName().equals(PRODUCTION_PROFILE_NAME)) {
            descriptionService.save(new ArrayList<Description>(Arrays.asList(production)));
        }
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(HttpSession session, Model model, @ModelAttribute("description") Description description) {
        
        // Profiilin tiedot
        session.setAttribute("profile", profile);
        
        model.addAttribute("descriptions", descriptionService.list());
        
        return "hello";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(Model model, @Valid @ModelAttribute("description") Description description, BindingResult result) {
        
        if (result.hasErrors()) {
            
            model.addAttribute("descriptions", descriptionService.list());
            
            return "hello";
        }
        
        descriptionService.save(description);
        
        return "redirect:/";
    }
}
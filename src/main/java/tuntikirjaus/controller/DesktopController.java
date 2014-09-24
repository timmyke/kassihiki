/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuntikirjaus.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author timmy
 */
@Controller
@RequestMapping("desktop")
public class DesktopController extends ControllerBase {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {
        String mapping = request.getPathInfo();
        mapping = this.getClass().getName();
        model.addAttribute("mapping", mapping);
        return "desktop";
    }
    
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return View("test");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuntikirjaus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author timmy
 */
@Controller
@RequestMapping("user")
public class UserController extends ControllerBase {
    
    @RequestMapping(value = "index")
    public String index() {
        return View("index");
    }
    
    @RequestMapping(value = "register")
    public String register() {
        return View("index");
    }
}

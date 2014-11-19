/*
 * To change this license header, choose License Headers in Project2 Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viitteidenhallinta.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Wiz
 */
public class Project2 {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

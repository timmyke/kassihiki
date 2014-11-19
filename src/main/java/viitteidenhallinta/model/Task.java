/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viitteidenhallinta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Wiz
 */

@Entity
public class Task {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private Integer projectId;
    private String name;
//    private String description;
    
    //@Column(nullable = true, columnDefinition = "int default 0")
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
    
    public void setProjectId(Integer id) {
        this.projectId = id;
    }
    
    public Integer getProjectId() {
        return projectId;
    }
}

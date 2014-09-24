/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuntikirjaus.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author timmy
 */
@Entity
@Table(name = "additionalpersonfieldtitle")
public class AdditionalPersonFieldTitle implements Serializable {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    private String id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "mandatory")
    private boolean mandarotry;
    
    @Column(name = "type")
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isMandarotry() {
        return mandarotry;
    }

    public void setMandarotry(boolean mandarotry) {
        this.mandarotry = mandarotry;
    }
}

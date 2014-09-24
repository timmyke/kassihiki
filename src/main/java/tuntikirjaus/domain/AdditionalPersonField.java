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
@Table(name = "additionalpersonfield")
public class AdditionalPersonField implements Serializable {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    private String id;
    
    @Column(name = "value")
    private String value;
}

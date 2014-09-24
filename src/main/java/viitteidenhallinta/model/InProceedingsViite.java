package viitteidenhallinta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InProceedingsViite {

    @Id
    @GeneratedValue
    private Integer id;

    private String Author;

    private String Title;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String name) {
        this.Author = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String lastName) {
        this.Title = lastName;
    }

}

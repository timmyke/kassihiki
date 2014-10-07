package viitteidenhallinta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InProceedingsViite {

    @Id
    @GeneratedValue
    private Integer id;

    private String author;

    private String title;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String lastName) {
        this.title = lastName;
    }

    public String getBibtex() {
        String palautettava;
        palautettava="@INPROCEEDINGS{"+ this.title.split(" ")[0] + ",\n";
        palautettava += "author = {" + this.author + "},\n" +
                "title = {" + this.title + "},\n" +
                "}";
        return palautettava;
    }
    
}

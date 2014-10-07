package viitteidenhallinta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InProceedingsViite {

    @Id
    @GeneratedValue
    private Integer id;

    
    // Pakolliset kentät
    
    private String author;
    private String book_title;    
    private String title;    
    private int year; 
    
    // end of pakolliset    
    //
    // Valinnaiset
    //
    
    private String o_editor;
    private String o_volumeOrNumber;
    private String o_series;
    private int o_pages; 
    private String o_address;
    private int o_month;
    private String o_organization;
    private String o_publisher;
    private String o_note;
    private String o_key;

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getO_editor() {
        return o_editor;
    }

    public void setO_editor(String o_editor) {
        this.o_editor = o_editor;
    }

    public String getO_volumeOrNumber() {
        return o_volumeOrNumber;
    }

    public void setO_volumeOrNumber(String o_volumeOrNumber) {
        this.o_volumeOrNumber = o_volumeOrNumber;
    }

    public String getO_series() {
        return o_series;
    }

    public void setO_series(String o_series) {
        this.o_series = o_series;
    }

    public int getO_pages() {
        return o_pages;
    }

    public void setO_pages(int o_pages) {
        this.o_pages = o_pages;
    }

    public String getO_address() {
        return o_address;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }

    public int getO_month() {
        return o_month;
    }

    public void setO_month(int o_month) {
        this.o_month = o_month;
    }

    public String getO_organization() {
        return o_organization;
    }

    public void setO_organization(String o_organization) {
        this.o_organization = o_organization;
    }

    public String getO_publisher() {
        return o_publisher;
    }

    public void setO_publisher(String o_publisher) {
        this.o_publisher = o_publisher;
    }

    public String getO_note() {
        return o_note;
    }

    public void setO_note(String o_note) {
        this.o_note = o_note;
    }

    public String getO_key() {
        return o_key;
    }

    public void setO_key(String o_key) {
        this.o_key = o_key;
    }
    


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

    public String getBookTitle() {
        return book_title;
    }

    public void setBookTitle(String lastName) {
        this.book_title = lastName;
    }

    public String getBibtex() {
        String palautettava;
        palautettava="@INPROCEEDINGS{"+ this.book_title.split(" ")[0] + ",\n";
        palautettava += "\tauthor = {" + this.author + "},\n" +
                "\ttitle = {" + this.title + "},\n"
                + "\tbooktitle = {" + this.book_title + "},\n";
        if (!(this.o_month==0)) {
            palautettava += "\tmonth = {" + this.o_month + "},\n";
        }
        if (!(this.o_pages==0)) {
            palautettava += "\tpages = {" + this.o_pages + "},\n";
        }
        if (this.o_editor!=null) { 
            palautettava += "\teditor = {this.o_editor},\n";
        }
        if (this.o_volumeOrNumber!=null) { 
            palautettava += "\tvolume = {"+this.o_volumeOrNumber+"},\n";
        }
        if (this.o_series!=null) { 
            palautettava += "\tseries = {"+this.o_series+"},\n";
        }
        if (this.o_pages!=0) { 
            palautettava += "\tpages = {"+this.o_pages+"},\n";
        }
        if (this.o_address!=null) {
            palautettava += "\taddress = {"+this.o_address+"},\n";
        }
        if (this.o_month!=0) { 
            palautettava += "\tmonth = {"+this.o_month+"},\n";
        }
        if (this.o_organization!=null) { 
            palautettava += "\torganization = {"+this.o_organization+"},\n";
        }
        if (this.o_publisher!=null) { 
            palautettava += "\tpublisher = {"+this.o_publisher+"},\n";
        }
        if (this.o_note!=null) { 
            palautettava += "\tnote = {"+this.o_note+"},\n";
        }
        if (this.o_key!=null) { 
            palautettava += "\tkey = {"+this.o_key+"},\n";
        }

        
        palautettava += "\tyear = {" + this.year + "}\n" +
                "}";
        //palautettava += "\n}";
        return palautettava;
    }
    
}

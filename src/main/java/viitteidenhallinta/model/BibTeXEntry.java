package viitteidenhallinta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BibTeXEntry {

    @Id
    @GeneratedValue
    private Integer id;

    private BibTeXType entryType;
    private String author;
    private String title;
    private String address;
    private String annote;
    private String booktitle;
    private String chapter;
    private String chrossref; // FIXME: String?
    private String edition;
    private String editor;
    private String eprint;
    private String howpublished;
    private String institution;
    private String journal;
    private String sortingKey;
    private String mnth;
    private String note;
    private String number;
    private String organization;
    private String pages;
    private String publisher;
    private String school;
    private String series;
    private String publicationType;
    private String url;
    private String volume;
    private String publicationYear;
    
    
    public BibTeXType getEntryType() {
        return this.entryType;
    }
    
    public void setEntryType(BibTeXType t) {
        this.entryType = t;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnnote() {
        return annote;
    }

    public void setAnnote(String annote) {
        this.annote = annote;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getChrossref() {
        return chrossref;
    }

    public void setChrossref(String chrossref) {
        this.chrossref = chrossref;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEprint() {
        return eprint;
    }

    public void setEprint(String eprint) {
        this.eprint = eprint;
    }

    public String getHowpublished() {
        return howpublished;
    }

    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getSortingKey() {
        return sortingKey;
    }

    public void setSortingKey(String sortingKey) {
        this.sortingKey = sortingKey;
    }

    public String getMnth() {
        return mnth;
    }

    public void setMnth(String mnth) {
        this.mnth = mnth;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String type) {
        this.publicationType = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

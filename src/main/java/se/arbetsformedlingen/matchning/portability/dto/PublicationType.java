package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationType", propOrder = {

})
public class PublicationType {

    protected IdentifierType id;
    @XmlElement(required = true)
    protected PublicationTypeCodeList type;
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "abstract")
    protected String _abstract;
    protected Contributors contributors;
    protected Copyrights copyrights;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected LanguageCodeList languageCode;
    protected List<CommentType> comments;
    protected String journal;
    protected String issn;
    protected String volume;
    protected String issue;
    protected String pages;
    protected String edition;
    protected String chapters;
    protected String isbn;
    protected String publisher;
    protected LocationType publisherLocation;
    protected EventType event;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public PublicationTypeCodeList getType() {
        return type;
    }

    public void setType(PublicationTypeCodeList type) {
        this.type = type;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(XMLGregorianCalendar date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public Contributors getContributors() {
        return contributors;
    }

    public void setContributors(Contributors contributors) {
        this.contributors = contributors;
    }

    public Copyrights getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(Copyrights copyrights) {
        this.copyrights = copyrights;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }

    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocationType getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(LocationType publisherLocation) {
        this.publisherLocation = publisherLocation;
    }

    public EventType getEvent() {
        return event;
    }

    public void setEvent(EventType event) {
        this.event = event;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Contributors {

        protected List<Item> item;


        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            protected String name;
            protected String role;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Copyrights {

        protected List<Item> item;

        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Item {

            protected String owner;
            protected XMLGregorianCalendar year;

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            public XMLGregorianCalendar getYear() {
                return year;
            }

            public void setYear(XMLGregorianCalendar year) {
                this.year = year;
            }
        }

    }

}

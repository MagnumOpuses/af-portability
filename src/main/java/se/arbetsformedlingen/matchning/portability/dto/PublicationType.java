package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public PublicationTypeCodeList getType() {
        return type;
    }

    public void setType(final PublicationTypeCodeList type) {
        this.type = type;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(final String _abstract) {
        this._abstract = _abstract;
    }

    public Contributors getContributors() {
        return contributors;
    }

    public void setContributors(final Contributors contributors) {
        this.contributors = contributors;
    }

    public Copyrights getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(final Copyrights copyrights) {
        this.copyrights = copyrights;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(final LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }

    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }

    public void setComments(final List<CommentType> comments) {
        this.comments = comments;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(final String journal) {
        this.journal = journal;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(final String issn) {
        this.issn = issn;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(final String issue) {
        this.issue = issue;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(final String pages) {
        this.pages = pages;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(final String edition) {
        this.edition = edition;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(final String chapters) {
        this.chapters = chapters;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    public LocationType getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(final LocationType publisherLocation) {
        this.publisherLocation = publisherLocation;
    }

    public EventType getEvent() {
        return event;
    }

    public void setEvent(final EventType event) {
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

            public void setName(final String name) {
                this.name = name;
            }

            public String getRole() {
                return role;
            }

            public void setRole(final String role) {
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

            public void setOwner(final String owner) {
                this.owner = owner;
            }

            public XMLGregorianCalendar getYear() {
                return year;
            }

            public void setYear(final XMLGregorianCalendar year) {
                this.year = year;
            }
        }

    }

}

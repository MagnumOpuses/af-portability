package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentType {

    protected LanguageCodeList language;
    protected String type;
    protected String author;
    protected XMLGregorianCalendar datetime;
    protected String status;
    @XmlElement(required = true)
    protected String note;

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(final LanguageCodeList language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    public void setDatetime(final XMLGregorianCalendar datetime) {
        this.datetime = datetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(final String note) {
        this.note = note;
    }
}

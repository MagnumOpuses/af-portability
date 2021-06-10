package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventType {

    public IdentifierType id;
    public String name;
    public String code;
    public String venue;
    public LocationType location;
    public DateOpenEndPeriodType when;


    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(final String venue) {
        this.venue = venue;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(final LocationType location) {
        this.location = location;
    }

    public DateOpenEndPeriodType getWhen() {
        return when;
    }

    public void setWhen(final DateOpenEndPeriodType when) {
        this.when = when;
    }
}

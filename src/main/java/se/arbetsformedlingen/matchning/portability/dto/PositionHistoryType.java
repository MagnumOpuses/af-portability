package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionHistoryType", propOrder = {

})
public class PositionHistoryType {

    public IdentifierType id;
    public String start;
    public String end;
    public Boolean current;
    public List<AttachmentReferenceType> attachmentReferences;
    public List<String> descriptions;
    public String title;
    public ResourceRelationshipCodeList resourceRelationshipCode;
    public OrganizationType organization;
    public LocationType location;
    public List<EntityType> jobCategories;
    public List<EntityType> jobLevels;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        return attachmentReferences;
    }

    public void setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ResourceRelationshipCodeList getResourceRelationshipCode() {
        return resourceRelationshipCode;
    }

    public void setResourceRelationshipCode(ResourceRelationshipCodeList resourceRelationshipCode) {
        this.resourceRelationshipCode = resourceRelationshipCode;
    }

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }

    public List<EntityType> getJobCategories() {
        if (jobCategories == null) {
            jobCategories = new ArrayList<EntityType>();
        }
        return this.jobCategories;
    }

    public void setJobCategories(List<EntityType> jobCategories) {
        this.jobCategories = jobCategories;
    }

    public List<EntityType> getJobLevels() {
        if (jobLevels == null) {
            jobLevels = new ArrayList<EntityType>();
        }
        return this.jobLevels;
    }

    public void setJobLevels(List<EntityType> jobLevels) {
        this.jobLevels = jobLevels;
    }
}

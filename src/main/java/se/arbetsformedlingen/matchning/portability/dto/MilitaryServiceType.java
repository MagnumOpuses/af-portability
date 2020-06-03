package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilitaryServiceType", propOrder = {

})
public class MilitaryServiceType {

    protected IdentifierType id;
    protected String start;
    protected String end;
    protected Boolean current;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<String> descriptions;
    protected CountryCodeList countryCode;
    protected String serviceNumber;
    protected String branch;
    protected String division;
    protected String startingRank;
    protected String endingRank;
    protected Boolean currentRankIndicator;
    protected List<String> campaigns;
    protected List<SpecifiedCompetencyType> expertises;
    protected List<String> honors;
    protected List<String> disciplinaryActions;
    protected String dischargeStatus;
    protected XMLGregorianCalendar dischargeDate;
    protected List<CommentType> comments;

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
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
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

    public void setCampaigns(List<String> campaigns) {
        this.campaigns = campaigns;
    }

    public void setHonors(List<String> honors) {
        this.honors = honors;
    }

    public void setDisciplinaryActions(List<String> disciplinaryActions) {
        this.disciplinaryActions = disciplinaryActions;
    }

    public CountryCodeList getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCodeList countryCode) {
        this.countryCode = countryCode;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getStartingRank() {
        return startingRank;
    }

    public void setStartingRank(String startingRank) {
        this.startingRank = startingRank;
    }

    public String getEndingRank() {
        return endingRank;
    }

    public void setEndingRank(String endingRank) {
        this.endingRank = endingRank;
    }

    public Boolean getCurrentRankIndicator() {
        return currentRankIndicator;
    }

    public void setCurrentRankIndicator(Boolean currentRankIndicator) {
        this.currentRankIndicator = currentRankIndicator;
    }

    public List<String> getCampaigns() {
        return campaigns;
    }

    public List<SpecifiedCompetencyType> getExpertises() {
        if (expertises == null) {
            expertises = new ArrayList<SpecifiedCompetencyType>();
        }
        return this.expertises;
    }

    public void setExpertises(List<SpecifiedCompetencyType> expertises) {
        this.expertises = expertises;
    }

    public List<String> getHonors() {
        return honors;
    }

    public List<String> getDisciplinaryActions() {
        return disciplinaryActions;
    }

    public String getDischargeStatus() {
        return dischargeStatus;
    }

    public void setDischargeStatus(String dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
    }

    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(XMLGregorianCalendar dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }

    public void setComments(List<CommentType> comments) {
        this.comments = comments;
    }
}

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
    protected StringTypeArray descriptions;
    protected CountryCodeList countryCode;
    protected String serviceNumber;
    protected String branch;
    protected String division;
    protected String startingRank;
    protected String endingRank;
    protected Boolean currentRankIndicator;
    protected StringTypeArray campaigns;
    protected List<SpecifiedCompetencyType> expertises;
    protected StringTypeArray honors;
    protected StringTypeArray disciplinaryActions;
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

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
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

    public StringTypeArray getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(StringTypeArray campaigns) {
        this.campaigns = campaigns;
    }

    public List<SpecifiedCompetencyType> getExpertises() {
        if (expertises == null) {
            expertises = new ArrayList<SpecifiedCompetencyType>();
        }
        return this.expertises;
    }

    public StringTypeArray getHonors() {
        return honors;
    }

    public void setHonors(StringTypeArray honors) {
        this.honors = honors;
    }

    public StringTypeArray getDisciplinaryActions() {
        return disciplinaryActions;
    }

    public void setDisciplinaryActions(StringTypeArray disciplinaryActions) {
        this.disciplinaryActions = disciplinaryActions;
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
}

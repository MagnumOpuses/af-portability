package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteWorkType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteWorkType {

    protected Boolean remoteWorkIndicator;
    protected List<WorkLocationCodeList> workLocationCodes;
    protected List<RestrictionCodeList> restrictionCodes;
    protected String remoteEligibilityRequirement;
    protected String restrictionDetails;

    public Boolean getRemoteWorkIndicator() {
        return remoteWorkIndicator;
    }

    public void setRemoteWorkIndicator(final Boolean remoteWorkIndicator) {
        this.remoteWorkIndicator = remoteWorkIndicator;
    }

    public List<WorkLocationCodeList> getWorkLocationCodes() {
        if (workLocationCodes == null) {
            workLocationCodes = new ArrayList<WorkLocationCodeList>();
        }
        return this.workLocationCodes;
    }

    public void setWorkLocationCodes(final List<WorkLocationCodeList> workLocationCodes) {
        this.workLocationCodes = workLocationCodes;
    }

    public List<RestrictionCodeList> getRestrictionCodes() {
        if (restrictionCodes == null) {
            restrictionCodes = new ArrayList<RestrictionCodeList>();
        }
        return this.restrictionCodes;
    }

    public void setRestrictionCodes(final List<RestrictionCodeList> restrictionCodes) {
        this.restrictionCodes = restrictionCodes;
    }

    public String getRemoteEligibilityRequirement() {
        return remoteEligibilityRequirement;
    }

    public void setRemoteEligibilityRequirement(final String remoteEligibilityRequirement) {
        this.remoteEligibilityRequirement = remoteEligibilityRequirement;
    }

    public String getRestrictionDetails() {
        return restrictionDetails;
    }

    public void setRestrictionDetails(final String restrictionDetails) {
        this.restrictionDetails = restrictionDetails;
    }
}

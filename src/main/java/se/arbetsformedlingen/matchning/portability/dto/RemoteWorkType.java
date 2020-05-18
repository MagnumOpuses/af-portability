package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteWorkType", propOrder = {

})
public class RemoteWorkType {

    protected Boolean remoteWorkIndicator;
    protected List<WorkLocationCodeList> workLocationCodes;
    protected List<RestrictionCodeList> restrictionCodes;
    protected String remoteEligibilityRequirement;
    protected String restrictionDetails;

    public Boolean getRemoteWorkIndicator() {
        return remoteWorkIndicator;
    }

    public void setRemoteWorkIndicator(Boolean remoteWorkIndicator) {
        this.remoteWorkIndicator = remoteWorkIndicator;
    }

    public List<WorkLocationCodeList> getWorkLocationCodes() {
        if (workLocationCodes == null) {
            workLocationCodes = new ArrayList<WorkLocationCodeList>();
        }
        return this.workLocationCodes;;
    }

    public List<RestrictionCodeList> getRestrictionCodes() {
        if (restrictionCodes == null) {
            restrictionCodes = new ArrayList<RestrictionCodeList>();
        }
        return this.restrictionCodes;
    }

    public String getRemoteEligibilityRequirement() {
        return remoteEligibilityRequirement;
    }

    public void setRemoteEligibilityRequirement(String remoteEligibilityRequirement) {
        this.remoteEligibilityRequirement = remoteEligibilityRequirement;
    }

    public String getRestrictionDetails() {
        return restrictionDetails;
    }

    public void setRestrictionDetails(String restrictionDetails) {
        this.restrictionDetails = restrictionDetails;
    }
}

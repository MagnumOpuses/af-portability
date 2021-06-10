package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedPositionOpeningType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociatedPositionOpeningType {

    protected IdentifierType positionOpeningId;
    protected IdentifierType staffingOrderId;
    protected String positionTitle;
    protected String positionUri;
    protected Boolean candidateAppliedIndicator;
    protected DispositionStatusType dispositionStatus;

    public IdentifierType getPositionOpeningId() {
        return positionOpeningId;
    }

    public void setPositionOpeningId(final IdentifierType positionOpeningId) {
        this.positionOpeningId = positionOpeningId;
    }

    public IdentifierType getStaffingOrderId() {
        return staffingOrderId;
    }

    public void setStaffingOrderId(final IdentifierType staffingOrderId) {
        this.staffingOrderId = staffingOrderId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(final String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPositionUri() {
        return positionUri;
    }

    public void setPositionUri(final String positionUri) {
        this.positionUri = positionUri;
    }

    public Boolean getCandidateAppliedIndicator() {
        return candidateAppliedIndicator;
    }

    public void setCandidateAppliedIndicator(final Boolean candidateAppliedIndicator) {
        this.candidateAppliedIndicator = candidateAppliedIndicator;
    }

    public DispositionStatusType getDispositionStatus() {
        return dispositionStatus;
    }

    public void setDispositionStatus(final DispositionStatusType dispositionStatus) {
        this.dispositionStatus = dispositionStatus;
    }
}

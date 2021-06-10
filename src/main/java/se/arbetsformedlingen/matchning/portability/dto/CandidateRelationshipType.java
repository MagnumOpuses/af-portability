package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateRelationshipType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateRelationshipType {

    protected IdentifierType candidateRelationshipId;
    protected Boolean internalCandidateIndicator;
    protected CandidateRelationshipCodeList candidateRelationshipCode;
    protected String otherCandidateRelationshipCode;

    public IdentifierType getCandidateRelationshipId() {
        return candidateRelationshipId;
    }

    public void setCandidateRelationshipId(final IdentifierType candidateRelationshipId) {
        this.candidateRelationshipId = candidateRelationshipId;
    }

    public Boolean getInternalCandidateIndicator() {
        return internalCandidateIndicator;
    }

    public void setInternalCandidateIndicator(final Boolean internalCandidateIndicator) {
        this.internalCandidateIndicator = internalCandidateIndicator;
    }

    public CandidateRelationshipCodeList getCandidateRelationshipCode() {
        return candidateRelationshipCode;
    }

    public void setCandidateRelationshipCode(final CandidateRelationshipCodeList candidateRelationshipCode) {
        this.candidateRelationshipCode = candidateRelationshipCode;
    }

    public String getOtherCandidateRelationshipCode() {
        return otherCandidateRelationshipCode;
    }

    public void setOtherCandidateRelationshipCode(final String otherCandidateRelationshipCode) {
        this.otherCandidateRelationshipCode = otherCandidateRelationshipCode;
    }
}

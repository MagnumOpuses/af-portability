
package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateRelationshipType", propOrder = {

})
public class CandidateRelationshipType {

    protected IdentifierType candidateRelationshipId;
    protected Boolean internalCandidateIndicator;
    protected CandidateRelationshipCodeList candidateRelationshipCode;
    protected String otherCandidateRelationshipCode;

    public IdentifierType getCandidateRelationshipId() {
        return candidateRelationshipId;
    }

    public void setCandidateRelationshipId(IdentifierType candidateRelationshipId) {
        this.candidateRelationshipId = candidateRelationshipId;
    }

    public Boolean getInternalCandidateIndicator() {
        return internalCandidateIndicator;
    }

    public void setInternalCandidateIndicator(Boolean internalCandidateIndicator) {
        this.internalCandidateIndicator = internalCandidateIndicator;
    }

    public CandidateRelationshipCodeList getCandidateRelationshipCode() {
        return candidateRelationshipCode;
    }

    public void setCandidateRelationshipCode(CandidateRelationshipCodeList candidateRelationshipCode) {
        this.candidateRelationshipCode = candidateRelationshipCode;
    }

    public String getOtherCandidateRelationshipCode() {
        return otherCandidateRelationshipCode;
    }

    public void setOtherCandidateRelationshipCode(String otherCandidateRelationshipCode) {
        this.otherCandidateRelationshipCode = otherCandidateRelationshipCode;
    }
}

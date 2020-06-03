package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferObject {

    private String documentType;
    private String dataStructureLink;
    private List<CandidateType> data;


    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(final String documentType) {
        this.documentType = documentType;
    }

    public String getDataStructureLink() {
        return dataStructureLink;
    }

    public void setDataStructureLink(final String dataStructureLink) {
        this.dataStructureLink = dataStructureLink;
    }

    public List<CandidateType> getData() {
        if (data == null) {
            data = new ArrayList<CandidateType>();
        }
        return this.data;
    }

    public void setData(final List<CandidateType> data) {
        this.data = data;
    }
}

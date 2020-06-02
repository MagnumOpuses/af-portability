package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;

public class TransferObject {

    private int size;
    private String documentType;
    private String dataStructureLink;
    private List<CandidateType> data;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDataStructureLink() {
        return dataStructureLink;
    }

    public void setDataStructureLink(String dataStructureLink) {
        this.dataStructureLink = dataStructureLink;
    }

    public List<CandidateType> getData() {
        if (data == null) {
            data = new ArrayList<CandidateType>();
        }
        return this.data;
    }

    public void setData(List<CandidateType> data) {
        this.data = data;
    }
}

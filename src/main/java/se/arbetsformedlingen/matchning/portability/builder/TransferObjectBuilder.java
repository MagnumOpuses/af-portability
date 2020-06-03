package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateType;
import se.arbetsformedlingen.matchning.portability.dto.TransferObject;

import java.util.List;

public class TransferObjectBuilder {
    private TransferObject transferObject = new TransferObject();

    public TransferObjectBuilder setDocumentType(String documentType) {
        transferObject.setDocumentType(documentType);
        return this;
    }

    public TransferObjectBuilder setDataStructureLink(String dataStructureLink) {
        transferObject.setDataStructureLink(dataStructureLink);
        return this;
    }

    public TransferObjectBuilder setData(List<CandidateType> data) {
        transferObject.getData().addAll(data);
        return this;
    }

    public TransferObject build() {
        return transferObject;
    }
}
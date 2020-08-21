package se.arbetsformedlingen.matchning.portability.builder;


import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.util.ArrayList;
import java.util.List;

public class EmployerHistoryTypeBuilder {
    private EmployerHistoryType employerHistoryType = new EmployerHistoryType();

    public EmployerHistoryTypeBuilder setId(IdentifierType id) {
        employerHistoryType.setId(id);
        return this;
    }

    public EmployerHistoryTypeBuilder setStart(String start) {
        employerHistoryType.setStart(start);
        return this;
    }

    public EmployerHistoryTypeBuilder setEnd(String end) {
        employerHistoryType.setEnd(end);
        return this;
    }

    public EmployerHistoryTypeBuilder setCurrent(Boolean current) {
        employerHistoryType.setCurrent(current);
        return this;
    }

    public EmployerHistoryTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        employerHistoryType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public EmployerHistoryTypeBuilder setDescriptions(List<String> descriptions) {
        employerHistoryType.getDescriptions().addAll(descriptions);
        return this;
    }

    public EmployerHistoryTypeBuilder setOrganization(OrganizationType organization) {
        employerHistoryType.setOrganization(organization);
        return this;
    }

    public EmployerHistoryTypeBuilder setPositionHistories(List<PositionHistoryType> positionHistories) {
        employerHistoryType.getPositionHistories().addAll(positionHistories);
        return this;
    }

    public EmployerHistoryType build() {
        return employerHistoryType;
    }


    public EmployerHistoryTypeBuilder withCodes(String yrkesbenamning) {
        //TODO change jobterm from Name to ID
        //TODO map yrkesbenamning taxonomy result to Name
        List<PositionHistoryType> list = new ArrayList<>();
        List<EntityType> joblevels = new ArrayList<>();
        joblevels.add(new EntityTypeBuilder().setCode(yrkesbenamning).setName(String.valueOf(Concept.EntityType.jobterm)).build());
        list.add(new PositionHistoryTypeBuilder().setJobLevels(joblevels).build());

        return this;
    }


}
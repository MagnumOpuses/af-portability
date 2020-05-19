package se.arbetsformedlingen.matchning.portability.builder;


import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.util.ArrayList;
import java.util.List;

public class EmployerHistoryTypeBuilder {
    private EmployerHistoryType employerHistoryType = new EmployerHistoryType();

    public EmployerHistoryTypeBuilder setId(IdentifierType id) {
        employerHistoryType.id = id;
        return this;
    }

    public EmployerHistoryTypeBuilder setStart(String start) {
        employerHistoryType.start = start;
        return this;
    }

    public EmployerHistoryTypeBuilder setEnd(String end) {
        employerHistoryType.end = end;
        return this;
    }

    public EmployerHistoryTypeBuilder setCurrent(Boolean current) {
        employerHistoryType.current = current;
        return this;
    }

    public EmployerHistoryTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        employerHistoryType.attachmentReferences = attachmentReferences;
        return this;
    }

    public EmployerHistoryTypeBuilder setDescriptions(List<String> descriptions) {
        employerHistoryType.descriptions = descriptions;
        return this;
    }

    public EmployerHistoryTypeBuilder setOrganization(OrganizationType organization) {
        employerHistoryType.organization = organization;
        return this;
    }

    public EmployerHistoryTypeBuilder setPositionHistories(List<PositionHistoryType> positionHistories) {
        employerHistoryType.positionHistories = positionHistories;
        return this;
    }

    public EmployerHistoryType build() {
        return employerHistoryType;
    }


    public EmployerHistoryTypeBuilder withCodes(String yrkesbenamning) {
        List<PositionHistoryType> list = new ArrayList<>();
        List<EntityType> joblevels = new ArrayList<>();
        joblevels.add(new EntityTypeBuilder().setCode(yrkesbenamning).setName(String.valueOf(Concept.EntityType.jobterm)).build());
        list.add(new PositionHistoryTypeBuilder().setJobLevels(joblevels).build());

        return this;
    }


}
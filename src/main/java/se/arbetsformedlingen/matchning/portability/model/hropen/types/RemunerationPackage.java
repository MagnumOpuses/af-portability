package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemunerationPackage {
    private String basisCode;
    private List<RemunerationRange> ranges;
    private List<String> descriptions;
}

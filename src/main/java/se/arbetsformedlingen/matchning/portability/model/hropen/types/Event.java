package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Entity;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event extends Entity {
    private String venue;
    private String location;
    private Date when;
}

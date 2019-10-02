package se.arbetsformedlingen.matchning.portability.rest;

import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.Candidate;
import se.arbetsformedlingen.matchning.portability.repository.AspRespository;

@RestController
public class ProfileApi {

    @Autowired
    AspRespository aspRespository;

    private Logger LOG = LoggerFactory.getLogger(ProfileApi.class);

    @CrossOrigin
    @RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
    public Candidate fetchCandidate(
            @ApiParam(value="JWT-token för användare") @RequestHeader("X-JWT-Assertion") String jwtToken
    ) {
        Candidate candidate = aspRespository.getCandidateForToken(jwtToken);
        if (candidate == null) {
            throw new UnauthorizedException(Strings.isEmpty(jwtToken) ? "Missing JWT token" : "JWT token is invalid");
        }
        return candidate;
    }
}

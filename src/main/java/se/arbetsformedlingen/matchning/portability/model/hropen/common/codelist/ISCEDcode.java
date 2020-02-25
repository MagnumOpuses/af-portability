package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ISCEDcode {
    private int code = 0;

    private static final List<String> values = Arrays.asList(
            "Early childhood education",
            "Primary education",
            "Lower secondary education",
            "Upper secondary education",
            "Post-secondary non-tertiary education",
            "Short-cycle tertiary education",
            "Bachelor or equivalent",
            "Master or equivalent",
            "Doctoral or equivalent"
    );

    public ISCEDcode() {
    }

    public ISCEDcode(int code) {
        setCode(code);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        assert (code >= 0 && code < values.size());
        this.code = code;
    }

    public String getValue() {
        return values.get(code);
    }

    @Override
    public String toString() {
        return "" + code + ": " + values.get(this.code);
    }

}


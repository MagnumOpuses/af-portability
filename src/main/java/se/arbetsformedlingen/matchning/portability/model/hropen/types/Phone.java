package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Phone {
    private String useCode;
    private int preference;
    private String formattedNumber;
    private String countryDialingCode;
    private String areaDialingCode;
    private String dialNumber;

    @JsonIgnore
    private Logger LOG = LoggerFactory.getLogger(Phone.class);

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(String useCode) {
        this.useCode = useCode;
    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    public void setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        parseFormattedNumber(formattedNumber);
    }

    private void parseFormattedNumber(String formattedNumber) {
        if (formattedNumber != null && !formattedNumber.matches("\\d+")) {
            String fullNumberWithCountryCode = "(\\+\\d+){0,1}[- ]*\\({0,1}0{0,1}\\){0,1}(\\d+)[- ]*([\\d ]+)";
            Pattern p = Pattern.compile(fullNumberWithCountryCode);
            Matcher m = p.matcher(formattedNumber);
            LOG.debug("Matches pattern: " + m.matches());
            if (m.matches()) {
                LOG.debug("Group 1: " + m.group(1));
                LOG.debug("Group 2: " + m.group(2));
                LOG.debug("Group 3: " + m.group(3));
                if (m.group(1) != null) {
                    setCountryDialingCode(m.group(1).substring(1));
                }
                setAreaDialingCode("0" + m.group(2));
                setDialNumber(m.group(3).replaceAll(" ", ""));
            }
        }
    }

    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    public void setCountryDialingCode(String countryDialingCode) {
        this.countryDialingCode = countryDialingCode;
    }

    public String getAreaDialingCode() {
        return areaDialingCode;
    }

    public void setAreaDialingCode(String areaDialingCode) {
        this.areaDialingCode = areaDialingCode;
    }

    public String getDialNumber() {
        return dialNumber;
    }

    public void setDialNumber(String dialNumber) {
        this.dialNumber = dialNumber;
    }
}

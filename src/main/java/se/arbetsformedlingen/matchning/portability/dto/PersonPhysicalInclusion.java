package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPhysicalInclusion", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonPhysicalInclusion {

    protected MeasureType height;
    protected MeasureType weight;
    protected DisabilityType disability;
    protected Boolean tobaccoUserIndicator;
    protected String hairColor;
    protected String eyeColor;
    protected List<String> identifyingMarks;
    protected BigInteger age;
    protected String bloodType;

    public MeasureType getHeight() {
        return height;
    }

    public void setHeight(final MeasureType height) {
        this.height = height;
    }

    public MeasureType getWeight() {
        return weight;
    }

    public void setWeight(final MeasureType weight) {
        this.weight = weight;
    }

    public DisabilityType getDisability() {
        return disability;
    }

    public void setDisability(final DisabilityType disability) {
        this.disability = disability;
    }

    public Boolean getTobaccoUserIndicator() {
        return tobaccoUserIndicator;
    }

    public void setTobaccoUserIndicator(final Boolean tobaccoUserIndicator) {
        this.tobaccoUserIndicator = tobaccoUserIndicator;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(final String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(final String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public List<String> getIdentifyingMarks() {
        return identifyingMarks;
    }

    public void setIdentifyingMarks(final List<String> identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(final BigInteger age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(final String bloodType) {
        this.bloodType = bloodType;
    }
}

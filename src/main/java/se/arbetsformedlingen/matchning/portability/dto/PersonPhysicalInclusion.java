package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPhysicalInclusion", propOrder = {

})
public class PersonPhysicalInclusion {

    protected MeasureType height;
    protected MeasureType weight;
    protected DisabilityType disability;
    protected Boolean tobaccoUserIndicator;
    protected String hairColor;
    protected String eyeColor;
    protected StringTypeArray identifyingMarks;
    protected BigInteger age;
    protected String bloodType;

    public MeasureType getHeight() {
        return height;
    }

    public void setHeight(MeasureType height) {
        this.height = height;
    }

    public MeasureType getWeight() {
        return weight;
    }

    public void setWeight(MeasureType weight) {
        this.weight = weight;
    }

    public DisabilityType getDisability() {
        return disability;
    }

    public void setDisability(DisabilityType disability) {
        this.disability = disability;
    }

    public Boolean getTobaccoUserIndicator() {
        return tobaccoUserIndicator;
    }

    public void setTobaccoUserIndicator(Boolean tobaccoUserIndicator) {
        this.tobaccoUserIndicator = tobaccoUserIndicator;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public StringTypeArray getIdentifyingMarks() {
        return identifyingMarks;
    }

    public void setIdentifyingMarks(StringTypeArray identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}

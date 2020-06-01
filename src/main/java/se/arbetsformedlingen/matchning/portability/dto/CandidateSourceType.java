package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateSourceType", propOrder = {

})
public class CandidateSourceType {

    protected IdentifierType id;
    protected String name;
    protected String code;
    protected String type;
    protected BigDecimal order;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getOrder() {
        return order;
    }

    public void setOrder(BigDecimal order) {
        this.order = order;
    }
}

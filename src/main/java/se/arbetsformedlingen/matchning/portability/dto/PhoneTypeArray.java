package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneTypeArray", propOrder = {
    "item"
})
public class PhoneTypeArray {

    protected List<PhoneType> item;

    public List<PhoneType> getItem() {
        if (item == null) {
            item = new ArrayList<PhoneType>();
        }
        return this.item;
    }
}

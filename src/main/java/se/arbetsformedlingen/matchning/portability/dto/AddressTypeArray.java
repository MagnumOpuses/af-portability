package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressTypeArray", propOrder = {
    "item"
})
public class AddressTypeArray {

    protected List<AddressType> item;

    public List<AddressType> getItem() {
        if (item == null) {
            item = new ArrayList<AddressType>();
        }
        return this.item;
    }
}

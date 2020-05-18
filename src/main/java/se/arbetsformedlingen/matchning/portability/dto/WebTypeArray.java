package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebTypeArray", propOrder = {
    "item"
})
public class WebTypeArray {

    protected List<WebType> item;

    public List<WebType> getItem() {
        if (item == null) {
            item = new ArrayList<WebType>();
        }
        return this.item;
    }

}

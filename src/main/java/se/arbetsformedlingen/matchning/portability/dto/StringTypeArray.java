package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringTypeArray", propOrder = {
    "item"
})
public class StringTypeArray {

    protected List<String> item;


    public List<String> getItem() {
        if (item == null) {
            item = new ArrayList<String>();
        }
        return this.item;
    }

}

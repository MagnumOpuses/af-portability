package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessHistoryType", propOrder = {
    "item"
})
public class ProcessHistoryType {

    protected List<ProcessHistoryItemType> item;

    public List<ProcessHistoryItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ProcessHistoryItemType>();
        }
        return this.item;
    }

}

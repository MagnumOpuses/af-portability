package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessHistoryType", propOrder = {
        "item"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessHistoryType {

    public List<ProcessHistoryItemType> item;

    public List<ProcessHistoryItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ProcessHistoryItemType>();
        }
        return this.item;
    }

}

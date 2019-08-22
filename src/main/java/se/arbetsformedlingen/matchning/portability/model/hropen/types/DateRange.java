package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.text.SimpleDateFormat;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateRange {
    private boolean currentIndicator = true;
    private Date start;
    private Date end;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

    public boolean isCurrentIndicator() {
        return currentIndicator;
    }

    public void setCurrentIndicator(boolean currentIndicator) {
        this.currentIndicator = currentIndicator;
    }

    public String getStart() {
        if (start != null) {
            return sdf.format(start);
        }
        return null;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getEnd() {
        if (end != null) {
            return sdf.format(end);
        }
        return null;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setEnd(String year, String month) {
        if (month == null) {
            month = "01";
            if (year == null) {
                return;
            }
        }
        try {
            setEnd(sdf.parse(year + "-" + month));
            setCurrentIndicator(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setStart(String year, String month) {
        if (month == null) {
            month = "01";
            if (year == null) {
                return;
            }
        }
        try {
            setStart(sdf.parse(year + "-" + month));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DateRange withStart(String year, String month) {
        setStart(year, month);
        return this;
    }
    public DateRange withEnd(String year, String month) {
        setEnd(year, month);
        return this;
    }
}

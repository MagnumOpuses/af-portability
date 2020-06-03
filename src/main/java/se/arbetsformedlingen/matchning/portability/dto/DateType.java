package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class DateType {
    protected XMLGregorianCalendar date;

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final LocalDate date = LocalDate.of(this.getDate().getYear(),
                this.getDate().getMonth(),
                this.getDate().getDay());

        final DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        final String formatted = date.format(formatter);
        return formatted;
    }

    public static class DateTypeSerializer extends JsonSerializer<DateType> {
        @Override
        public void serialize(final DateType dateType, final JsonGenerator jsonGenerator, final SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeObject(dateType.toString());
        }
    }

    public static class DateTypeDeserializer extends JsonDeserializer<DateType> {

        @Override
        public DateType deserialize(final JsonParser jsonParser, final DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            final DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
            final LocalDate parsedDate = LocalDate.parse(jsonParser.getText(), formatter);

            final GregorianCalendar gcal = GregorianCalendar.from(parsedDate.atStartOfDay(ZoneId.systemDefault()));

            try {
                final XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
                final DateType dateType = new DateType();
                dateType.setDate(xcal);
                return dateType;
            } catch (final DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}

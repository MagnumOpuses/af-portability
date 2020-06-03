package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateTimeType {
    protected XMLGregorianCalendar date;

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return getDate().toString();
    }

    public static class DateTypeSerializer extends JsonSerializer<DateTimeType> {
        @Override
        public void serialize(final DateTimeType dateTimeType, final JsonGenerator jsonGenerator, final SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeObject(dateTimeType.toString());
        }
    }

    public static class DateTypeDeserializer extends JsonDeserializer<DateTimeType> {

        @Override
        public DateTimeType deserialize(final JsonParser jsonParser, final DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            try {
                final XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(jsonParser.getText());
                final DateTimeType dateTimeType = new DateTimeType();
                dateTimeType.setDate(xcal);
                return dateTimeType;
            } catch (final DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}

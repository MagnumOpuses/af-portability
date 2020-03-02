package se.arbetsformedlingen.matchning.portability.model.hropen;

import org.junit.Test;
import se.arbetsformedlingen.matchning.portability.builder.hropen.PhoneTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.communication.PhoneType;

public class PhoneTest {

    @Test
    public void FormattingWithCountryPrefix() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "+46 8-12345678";
        phone.setFormattedNumber(phoneNumber);

        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() != null);
        assert(phone.getCountryDialingCode().equals("46"));
        assert(phone.getAreaDialingCode() != null);
        assert(phone.getAreaDialingCode().equals("08"));
        assert(phone.getDialNumber() != null);
        assert(phone.getDialNumber().equals("12345678"));
    }

    @Test
    public void FormattingWithCountryPrefixAndParenthesis() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "+46(0)8-12345678";
        phone.setFormattedNumber(phoneNumber);

        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() != null);
        assert(phone.getCountryDialingCode().equals("46"));
        assert(phone.getAreaDialingCode() != null);
        assert(phone.getAreaDialingCode().equals("08"));
        assert(phone.getDialNumber() != null);
        assert(phone.getDialNumber().equals("12345678"));
    }

    @Test
    public void FormattingWithCountryPrefixAndParenthesisAndSpaces() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "+46  (0)8 - 12345678";
        phone.setFormattedNumber(phoneNumber);

        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() != null);
        assert(phone.getCountryDialingCode().equals("46"));
        assert(phone.getAreaDialingCode() != null);
        assert(phone.getAreaDialingCode().equals("08"));
        assert(phone.getDialNumber() != null);
        assert(phone.getDialNumber().equals("12345678"));
    }

    @Test
    public void FormattingWithoutCountryPrefix() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "0290-123456";
        phone.setFormattedNumber(phoneNumber);
        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() == null);
        assert(phone.getAreaDialingCode() != null);
        assert(phone.getAreaDialingCode().equals("0290"));
        assert(phone.getDialNumber() != null);
        assert(phone.getDialNumber().equals("123456"));
    }

    @Test
    public void FormattingWithoutCountryPrefixAndRandomSpaces() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "0290 - 123 456";
        phone.setFormattedNumber(phoneNumber);
        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() == null);
        assert(phone.getAreaDialingCode() != null);
        assert(phone.getAreaDialingCode().equals("0290"));
        assert(phone.getDialNumber() != null);
        assert(phone.getDialNumber().equals("123456"));

    }

    @Test
    public void FormattingPhoneNumberInOneNumberSequence() {
        PhoneType phone = new PhoneTypeBuilder().build();
        String phoneNumber = "0707774411";
        phone.setFormattedNumber(phoneNumber);
        assert(phone.getFormattedNumber() != null);
        assert(phone.getFormattedNumber().equals(phoneNumber));
        assert(phone.getCountryDialingCode() == null);
        assert(phone.getAreaDialingCode() == null);
        assert(phone.getDialNumber() == null);
    }

    @Test
    public void NullPhoneNumber() {
        PhoneType phone = new PhoneTypeBuilder().build();
        phone.setFormattedNumber(null);
        assert (phone.getFormattedNumber() == null);
        assert(phone.getCountryDialingCode() == null);
        assert(phone.getAreaDialingCode() == null);
        assert (phone.getDialNumber() == null);
    }
}

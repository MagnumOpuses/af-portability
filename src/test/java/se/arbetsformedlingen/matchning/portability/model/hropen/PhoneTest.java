package se.arbetsformedlingen.matchning.portability.model.hropen;

import org.junit.Test;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Phone;

public class PhoneTest {

    @Test
    public void FormattingWithCountryPrefix() {
        Phone phone = new Phone();
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
        Phone phone = new Phone();
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
        Phone phone = new Phone();
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
        Phone phone = new Phone();
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
        Phone phone = new Phone();
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
        Phone phone = new Phone();
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
        Phone phone = new Phone();
        phone.setFormattedNumber(null);
        assert (phone.getFormattedNumber() == null);
        assert(phone.getCountryDialingCode() == null);
        assert(phone.getAreaDialingCode() == null);
        assert (phone.getDialNumber() == null);
    }
}

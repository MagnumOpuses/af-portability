package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.LicenseType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PhoneTypeArray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PhoneTypeArrayBuilder {
    private List<PhoneTypeArray.Item> item;

    public PhoneTypeArrayBuilder setItem(List<PhoneTypeArray.Item> item) {
        this.item = item;
        return this;
    }

    public PhoneTypeArray createPhoneTypeArray() {
        return new PhoneTypeArray(item);
    }

    public PhoneTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<PhoneTypeArray.Item> list = new ArrayList<>();
        if (personUppgifter.getTelefonnummerHem() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerHem()).setName("Home").setPreference(BigInteger.valueOf(list.size()+1)).createItem());
        }
        if (personUppgifter.getTelefonnummerMobil() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerMobil()).setName("Mobile").setPreference(BigInteger.valueOf(list.size()+1)).createItem());
        }
        if (personUppgifter.getTelefonnummerOvrig() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerOvrig()).setName("Other").setPreference(BigInteger.valueOf(list.size()+1)).createItem());
        }
        setItem(list);
        return this;
    }
}
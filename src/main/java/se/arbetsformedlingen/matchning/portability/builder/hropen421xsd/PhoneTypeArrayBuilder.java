package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PhoneTypeArray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PhoneTypeArrayBuilder {
    private PhoneTypeArray phoneTypeArray = new PhoneTypeArray();

    public PhoneTypeArrayBuilder setItem(List<PhoneTypeArray.Item> item) {
        phoneTypeArray.getItem().addAll(item);
        return this;
    }

    public PhoneTypeArray build() {
        return phoneTypeArray;
    }

    public PhoneTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<PhoneTypeArray.Item> list = new ArrayList<>();
        if (personUppgifter.getTelefonnummerHem() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerHem()).setName("Home").setPreference(BigInteger.valueOf(list.size()+1)).build());
        }
        if (personUppgifter.getTelefonnummerMobil() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerMobil()).setName("Mobile").setPreference(BigInteger.valueOf(list.size()+1)).build());
        }
        if (personUppgifter.getTelefonnummerOvrig() != null){
            list.add(new PhoneTypeArrayItemBuilder().setFormattedNumber(personUppgifter.getTelefonnummerOvrig()).setName("Other").setPreference(BigInteger.valueOf(list.size()+1)).build());
        }
        setItem(list);
        return this;
    }
}
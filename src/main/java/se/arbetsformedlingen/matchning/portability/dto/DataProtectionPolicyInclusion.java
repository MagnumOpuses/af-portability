package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProtectionPolicyInclusion", propOrder = {

})
public class DataProtectionPolicyInclusion {

    protected DataProtectionPolicy dataProtectionPolicy;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class DataProtectionPolicy {

        protected XMLGregorianCalendar retentionDate;
        protected BigInteger retentionDays;
        protected GeoRestrictions geoRestrictions;

        public XMLGregorianCalendar getRetentionDate() {
            return retentionDate;
        }

        public void setRetentionDate(XMLGregorianCalendar retentionDate) {
            this.retentionDate = retentionDate;
        }

        public BigInteger getRetentionDays() {
            return retentionDays;
        }

        public void setRetentionDays(BigInteger retentionDays) {
            this.retentionDays = retentionDays;
        }

        public GeoRestrictions getGeoRestrictions() {
            return geoRestrictions;
        }

        public void setGeoRestrictions(GeoRestrictions geoRestrictions) {
            this.geoRestrictions = geoRestrictions;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class GeoRestrictions {

            protected List<Item> item;


            public List<Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Item>();
                }
                return this.item;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class Item {

                protected CountryCodeList country;
                protected SecurityPermissionType policy;

                public CountryCodeList getCountry() {
                    return country;
                }

                public void setCountry(CountryCodeList country) {
                    this.country = country;
                }

                public SecurityPermissionType getPolicy() {
                    return policy;
                }

                public void setPolicy(SecurityPermissionType policy) {
                    this.policy = policy;
                }
            }

        }

    }

}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package se.arbetsformedlingen.matchning.taxonomy.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import se.arbetsformedlingen.matchning.taxonomy.model.TaxonomyConcept;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept.EntityType;

public class TaxonomySoapHandler extends DefaultHandler {
    private List<TaxonomyConcept> taxonomyConceptList = null;
    private TaxonomyConcept taxonomyConcept = null;
    private Map<String, EntityType> qNameTypeMap = new HashMap();
    boolean readingLabel = false;
    boolean readingDescription = false;
    boolean readingParentId = false;
    boolean readingId = false;

    public List<TaxonomyConcept> getTaxonomyConceptList() {
        return this.taxonomyConceptList;
    }

    public TaxonomySoapHandler() {
        this.qNameTypeMap.put("OccupationName", EntityType.jobterm);
        this.qNameTypeMap.put("LocaleGroup", EntityType.jobgroup);
        this.qNameTypeMap.put("LocaleField", EntityType.jobfield);
        this.qNameTypeMap.put("Skill", EntityType.skill);
        this.qNameTypeMap.put("DrivingLicence", EntityType.drivers_license);
        this.qNameTypeMap.put("Language", EntityType.language);
        this.qNameTypeMap.put("SUNLevel1", EntityType.education_level);
        this.qNameTypeMap.put("SUNLevel2", EntityType.education_level);
        this.qNameTypeMap.put("SUNLevel3", EntityType.education_level);
        this.qNameTypeMap.put("SUNField1", EntityType.education);
        this.qNameTypeMap.put("SUNField2", EntityType.education);
        this.qNameTypeMap.put("SUNField3", EntityType.education);
        this.qNameTypeMap.put("WageType", EntityType.wage_type);
        this.qNameTypeMap.put("EmploymentDuration", EntityType.duration_type);
        this.qNameTypeMap.put("EmploymentType", EntityType.employment_type);
        this.qNameTypeMap.put("WorkTimeExtent", EntityType.worktime_extent);
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (this.taxonomyConceptList == null) {
            this.taxonomyConceptList = new ArrayList();
        }

        if (this.qNameTypeMap.containsKey(qName)) {
            this.taxonomyConcept = new TaxonomyConcept();
            this.taxonomyConcept.setType((EntityType)this.qNameTypeMap.get(qName));
        }

        if (this.taxonomyConcept != null) {
            this.handleStartElement(qName);
        }

    }

    private void handleStartElement(String qName) {
        if (this.taxonomyConcept.getType() == EntityType.jobterm) {
            if (qName.equalsIgnoreCase("OccupationNameID")) {
                this.readingId = true;
            } else if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            } else if (qName.equalsIgnoreCase("LocaleCode")) {
                this.readingParentId = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.jobgroup) {
            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }

            if (qName.equalsIgnoreCase("Description")) {
                this.readingDescription = true;
            }

            if (qName.equalsIgnoreCase("LocaleCode")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("LocaleFieldID")) {
                this.readingParentId = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.jobfield) {
            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }

            if (qName.equalsIgnoreCase("Description")) {
                this.readingDescription = true;
            }

            if (qName.equalsIgnoreCase("LocaleFieldID")) {
                this.readingId = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.skill) {
            if (qName.equalsIgnoreCase("SkillID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
                this.readingDescription = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.drivers_license) {
            if (qName.equalsIgnoreCase("DrivingLicenceID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }

            if (qName.equalsIgnoreCase("Description")) {
                this.readingDescription = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.language) {
            if (qName.equalsIgnoreCase("LanguageID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.education_level) {
            if (qName.equalsIgnoreCase("SUNLevel1Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("SUNLevel2Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("SUNLevel3Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.education) {
            if (qName.equalsIgnoreCase("SUNField1Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("SUNField2Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("SUNField3Code")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.wage_type) {
            if (qName.equalsIgnoreCase("WageTypeID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.duration_type) {
            if (qName.equalsIgnoreCase("EmploymentDurationID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.employment_type) {
            if (qName.equalsIgnoreCase("EmploymentTypeID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

        if (this.taxonomyConcept.getType() == EntityType.worktime_extent) {
            if (qName.equalsIgnoreCase("WorkTimeExtentID")) {
                this.readingId = true;
            }

            if (qName.equalsIgnoreCase("Term")) {
                this.readingLabel = true;
            }
        }

    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (this.qNameTypeMap.containsKey(qName)) {
            this.taxonomyConceptList.add(this.taxonomyConcept);
            this.taxonomyConcept = null;
        }

    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (this.readingId) {
            this.taxonomyConcept.setId(new String(ch, start, length));
            this.readingId = false;
        }

        if (this.readingLabel) {
            this.taxonomyConcept.setLabel(new String(ch, start, length));
            this.readingLabel = false;
        }

        if (this.readingDescription) {
            this.taxonomyConcept.setDescription(new String(ch, start, length));
            this.readingDescription = false;
        }

        if (this.readingParentId) {
            this.taxonomyConcept.setParentId(new String(ch, start, length));
            this.readingParentId = false;
        }

    }
}

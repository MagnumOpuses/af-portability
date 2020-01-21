//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package se.arbetsformedlingen.matchning.taxonomy.model;

public class Concept {
    private String id;
    private Concept.EntityType type;
    private String label;

    public Concept() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Concept.EntityType getType() {
        return this.type;
    }

    public void setType(Concept.EntityType type) {
        this.type = type;
    }

    public void setType(String st) {
        String var2 = st.toLowerCase();
        byte var3 = -1;
        switch(var2.hashCode()) {
            case 97427706:
                if (var2.equals("field")) {
                    var3 = 2;
                }
                break;
            case 98629247:
                if (var2.equals("group")) {
                    var3 = 1;
                }
                break;
            case 1615358283:
                if (var2.equals("occupation")) {
                    var3 = 0;
                }
        }

        switch(var3) {
            case 0:
                this.setType(Concept.EntityType.jobterm);
                break;
            case 1:
                this.setType(Concept.EntityType.jobgroup);
                break;
            case 2:
                this.setType(Concept.EntityType.jobfield);
                break;
            default:
                this.setType(Concept.EntityType.valueOf(st.toLowerCase()));
        }

    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static enum EntityType {
        skill,
        jobterm,
        jobgroup,
        jobfield,
        drivers_license,
        language,
        education_level,
        education,
        wage_type,
        duration_type,
        employment_type,
        worktime_extent;

        private EntityType() {
        }
    }
}

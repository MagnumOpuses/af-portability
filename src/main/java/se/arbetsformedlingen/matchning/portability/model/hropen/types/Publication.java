package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Publication {
    private Identifier id;
    private String type;
    private Date date;
    private String title;
    private List<PublicationContributor> contributors;
    private List<Copyright> copyrights;
    private String languageCode;
    private List<String> comments;
    private String journal;
    private String issn;
    private String volume;
    private String issue;
    private String pages;
    private String edition;
    private String chapters;
    private String isbn;
    private String publisher;
    private String publisherLocation;
    private Event event;

    public class PublicationContributor {
        private String name;
        private String role;

        public PublicationContributor() { }
        public PublicationContributor(String name) {
            setName(name);
        }
        public PublicationContributor(String name, String role) {
            setName(name);
            setRole(role);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    public class Copyright {
        private String owner;
        private int year = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();
        private final int MIN_YEAR = 1900;
        private final int MAX_YEAR = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() + 50;

        public Copyright() {
        }

        public Copyright(String owner) {
            setOwner(owner);
        }

        public Copyright(String owner, int year) {
            setOwner(owner);
            setYear(year);
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            assert (year > MIN_YEAR && year < MAX_YEAR);
            this.year = year;
        }

        @Override
        public String toString() {
            return owner + " ("+year+")";
        }
    }
}

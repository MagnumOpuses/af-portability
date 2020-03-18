package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;
import java.util.List;

public class ArbetsSokandeProfil {
    private long id;
    private long anvandarId;
    private String namn;
    private String beskrivning;
    private long matchningsprofilId;
    private Date senastUppdaterad;
    private boolean publicerad;
    private String profilstatus;
    private String presentation;
    private int styrka;
    private List<Utbildning> utbildningar;
    private List<Sprak> sprak;
    private List<Anstallning> anstallningar;
    private List<Merit> ovrigaMeriter;
    private Anstallningsvillkor anstallningsvillkor;
    private List<Yrkesroll> yrkesroller;
    private List<Kompetens> kompetenser;
    private List<Yrkeserfarenhet> yrkeserfarenheter;
    private List<Arbetsort> arbetsorter;
    private Korkort korkort;
    private Kontaktuppgiftmask kontaktuppgiftmask;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAnvandarId() {
        return anvandarId;
    }

    public void setAnvandarId(long anvandarId) {
        this.anvandarId = anvandarId;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public long getMatchningsprofilId() {
        return matchningsprofilId;
    }

    public void setMatchningsprofilId(long matchningsprofilId) {
        this.matchningsprofilId = matchningsprofilId;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }

    public boolean isPublicerad() {
        return publicerad;
    }

    public void setPublicerad(boolean publicerad) {
        this.publicerad = publicerad;
    }

    public String getProfilstatus() {
        return profilstatus;
    }

    public void setProfilstatus(String profilstatus) {
        this.profilstatus = profilstatus;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public int getStyrka() {
        return styrka;
    }

    public void setStyrka(int styrka) {
        this.styrka = styrka;
    }

    public List<Utbildning> getUtbildningar() {
        return utbildningar;
    }

    public void setUtbildningar(List<Utbildning> utbildningar) {
        this.utbildningar = utbildningar;
    }

    public List<Sprak> getSprak() {
        return sprak;
    }

    public void setSprak(List<Sprak> sprak) {
        this.sprak = sprak;
    }

    public List<Anstallning> getAnstallningar() {
        return anstallningar;
    }

    public void setAnstallningar(List<Anstallning> anstallningar) {
        this.anstallningar = anstallningar;
    }

    public List<Merit> getOvrigaMeriter() {
        return ovrigaMeriter;
    }

    public void setOvrigaMeriter(List<Merit> ovrigaMeriter) {
        this.ovrigaMeriter = ovrigaMeriter;
    }

    public Anstallningsvillkor getAnstallningsvillkor() {
        return anstallningsvillkor;
    }

    public void setAnstallningsvillkor(Anstallningsvillkor anstallningsvillkor) {
        this.anstallningsvillkor = anstallningsvillkor;
    }

    public List<Yrkesroll> getYrkesroller() {
        return yrkesroller;
    }

    public void setYrkesroller(List<Yrkesroll> yrkesroller) {
        this.yrkesroller = yrkesroller;
    }

    public List<Kompetens> getKompetenser() {
        return kompetenser;
    }

    public void setKompetenser(List<Kompetens> kompetenser) {
        this.kompetenser = kompetenser;
    }

    public List<Yrkeserfarenhet> getYrkeserfarenheter() {
        return yrkeserfarenheter;
    }

    public void setYrkeserfarenheter(List<Yrkeserfarenhet> yrkeserfarenheter) {
        this.yrkeserfarenheter = yrkeserfarenheter;
    }

    public List<Arbetsort> getArbetsorter() {
        return arbetsorter;
    }

    public void setArbetsorter(List<Arbetsort> arbetsorter) {
        this.arbetsorter = arbetsorter;
    }

    public Korkort getKorkort() {
        return korkort;
    }

    public void setKorkort(Korkort korkort) {
        this.korkort = korkort;
    }

    public Kontaktuppgiftmask getKontaktuppgiftmask() {
        return kontaktuppgiftmask;
    }

    public void setKontaktuppgiftmask(Kontaktuppgiftmask kontaktuppgiftmask) {
        this.kontaktuppgiftmask = kontaktuppgiftmask;
    }

    public class Anstallningsvillkor {
        private int[] anstallningstyper;
        private int omfattningMin;
        private int omfattningMax;

        public int[] getAnstallningstyper() {
            return anstallningstyper;
        }

        public void setAnstallningstyper(int[] anstallningstyper) {
            this.anstallningstyper = anstallningstyper;
        }

        public int getOmfattningMin() {
            return omfattningMin;
        }

        public void setOmfattningMin(int omfattningMin) {
            this.omfattningMin = omfattningMin;
        }

        public int getOmfattningMax() {
            return omfattningMax;
        }

        public void setOmfattningMax(int omfattningMax) {
            this.omfattningMax = omfattningMax;
        }
    }

    public class Korkort {
        private List<String> korkortsklasser;
        private Date senastUppdaterad;

        public List<String> getKorkortsklasser() {
            return korkortsklasser;
        }

        public void setKorkortsklasser(List<String> korkortsklasser) {
            this.korkortsklasser = korkortsklasser;
        }

        public Date getSenastUppdaterad() {
            return senastUppdaterad;
        }

        public void setSenastUppdaterad(Date senastUppdaterad) {
            this.senastUppdaterad = senastUppdaterad;
        }
    }

    public class Kontaktuppgiftmask {
        private long id;
        private long arbetssokandeprofilId;
        private boolean fornamn;
        private boolean efternamn;
        private boolean epostadress;
        private boolean telefonHem;
        private boolean telefonMobil;
        private boolean telefonOvrig;
        private boolean adress;
        private boolean postnummer;
        private boolean postort;
        private boolean coAdress;
        private boolean land;
        private boolean hemsidaUrl;
        private Date senastUppdaterad;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getArbetssokandeprofilId() {
            return arbetssokandeprofilId;
        }

        public void setArbetssokandeprofilId(long arbetssokandeprofilId) {
            this.arbetssokandeprofilId = arbetssokandeprofilId;
        }

        public boolean isFornamn() {
            return fornamn;
        }

        public void setFornamn(boolean fornamn) {
            this.fornamn = fornamn;
        }

        public boolean isEfternamn() {
            return efternamn;
        }

        public void setEfternamn(boolean efternamn) {
            this.efternamn = efternamn;
        }

        public boolean isEpostadress() {
            return epostadress;
        }

        public void setEpostadress(boolean epostadress) {
            this.epostadress = epostadress;
        }

        public boolean isTelefonHem() {
            return telefonHem;
        }

        public void setTelefonHem(boolean telefonHem) {
            this.telefonHem = telefonHem;
        }

        public boolean isTelefonMobil() {
            return telefonMobil;
        }

        public void setTelefonMobil(boolean telefonMobil) {
            this.telefonMobil = telefonMobil;
        }

        public boolean isTelefonOvrig() {
            return telefonOvrig;
        }

        public void setTelefonOvrig(boolean telefonOvrig) {
            this.telefonOvrig = telefonOvrig;
        }

        public boolean isAdress() {
            return adress;
        }

        public void setAdress(boolean adress) {
            this.adress = adress;
        }

        public boolean isPostnummer() {
            return postnummer;
        }

        public void setPostnummer(boolean postnummer) {
            this.postnummer = postnummer;
        }

        public boolean isPostort() {
            return postort;
        }

        public void setPostort(boolean postort) {
            this.postort = postort;
        }

        public boolean isCoAdress() {
            return coAdress;
        }

        public void setCoAdress(boolean coAdress) {
            this.coAdress = coAdress;
        }

        public boolean isLand() {
            return land;
        }

        public void setLand(boolean land) {
            this.land = land;
        }

        public boolean isHemsidaUrl() {
            return hemsidaUrl;
        }

        public void setHemsidaUrl(boolean hemsidaUrl) {
            this.hemsidaUrl = hemsidaUrl;
        }

        public Date getSenastUppdaterad() {
            return senastUppdaterad;
        }

        public void setSenastUppdaterad(Date senastUppdaterad) {
            this.senastUppdaterad = senastUppdaterad;
        }
    }
}

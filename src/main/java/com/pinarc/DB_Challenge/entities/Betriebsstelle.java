package com.pinarc.DB_Challenge.entities;

public class Betriebsstelle {

    private String abk;
    private String name;
    private String kurzname;
    private String typ;
    private String betrZust;
    private String primaryLocationCode;
    private String uic;
    private String rb;
    private String gueltigVon;
    private String gueltigBis;
    private String netzKey;
    private String fplRel;
    private String fplGr;


    public Betriebsstelle(String abk, String name, String kurzname, String typ, String betrZust, String primaryLocationCode, String uic, String rb, String gueltigVon, String gueltigBis, String netzKey, String fplRel, String fplGr) {
        this.abk = abk;
        this.name = name;
        this.kurzname = kurzname;
        this.typ = typ;
        this.betrZust = betrZust;
        this.primaryLocationCode = primaryLocationCode;
        this.uic = uic;
        this.rb = rb;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.netzKey = netzKey;
        this.fplRel = fplRel;
        this.fplGr = fplGr;
    }

    public Betriebsstelle() {
    }

    public String getAbk() {
            return abk;
        }

        public void setAbk(String abk) {
            this.abk = abk;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKurzname() {
            return kurzname;
        }

        public void setKurzname(String kurzname) {
            this.kurzname = kurzname;
        }

        public String getTyp() {
            return typ;
        }

        public void setTyp(String typ) {
            this.typ = typ;
        }

        public String getBetrZust() {
            return betrZust;
        }

        public void setBetrZust(String betrZust) {
            this.betrZust = betrZust;
        }

        public String getPrimaryLocationCode() {
            return primaryLocationCode;
        }

        public void setPrimaryLocationCode(String primaryLocationCode) {
            this.primaryLocationCode = primaryLocationCode;
        }

        public String getUic() {
            return uic;
        }

        public void setUic(String uic) {
            this.uic = uic;
        }

        public String getRb() {
            return rb;
        }

        public void setRb(String rb) {
            this.rb = rb;
        }

        public String getGueltigVon() {
            return gueltigVon;
        }

        public void setGueltigVon(String gueltigVon) {
            this.gueltigVon = gueltigVon;
        }

        public String getGueltigBis() {
            return gueltigBis;
        }

        public void setGueltigBis(String gueltigBis) {
            this.gueltigBis = gueltigBis;
        }

        public String getNetzKey() {
            return netzKey;
        }

        public void setNetzKey(String netzKey) {
            this.netzKey = netzKey;
        }

        public String getFplRel() {
            return fplRel;
        }

        public void setFplRel(String fplRel) {
            this.fplRel = fplRel;
        }

        public String getFplGr() {
            return fplGr;
        }

        public void setFplGr(String fplGr) {
            this.fplGr = fplGr;
        }

        @Override
        public String toString() {
            return "Betriebsstelle{" +
                    "Abk='" + abk + '\'' +
                    ", Name='" + name + '\'' +
                    ", Kurzname='" + kurzname + '\'' +
                    ", Typ='" + typ + '\'' +
                    ", BetrZust='" + betrZust + '\'' +
                    ", PrimaryLocationCode='" + primaryLocationCode + '\'' +
                    ", UIC='" + uic + '\'' +
                    ", RB='" + rb + '\'' +
                    ", gueltigVon='" + gueltigVon + '\'' +
                    ", gueltigBis='" + gueltigBis + '\'' +
                    ", NetzKey='" + netzKey + '\'' +
                    ", FplRel='" + fplRel + '\'' +
                    ", FplGr='" + fplGr + '\'' +
                    '}';
        }
    }



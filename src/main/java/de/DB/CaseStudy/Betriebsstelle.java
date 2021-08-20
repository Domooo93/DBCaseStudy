package de.DB.CaseStudy;

public class Betriebsstelle {
    private String plc;
    private String code;
    private String langname;
    private String kurzname;
    private String typ_kurz;
    private String typ_lang;
    private String betriebszustand;
    private String datum_ab;
    private String datum_bis;
    private String niederlassung;
    private String regionalbereich;
    private String letzte_Aenderung;

    public Betriebsstelle(String plc, String code, String langname, String kurzname, String typ_kurz, String typ_lang,
                          String betriebszustand, String datum_ab, String datum_bis, String niederlassung,
                          String regionalbereich, String letzte_Aenderung) {
        this.plc = plc;
        this.code = code;
        this.langname = langname;
        this.kurzname = kurzname;
        this.typ_kurz = typ_kurz;
        this.typ_lang = typ_lang;
        this.betriebszustand = betriebszustand;
        this.datum_ab = datum_ab;
        this.datum_bis = datum_bis;
        this.niederlassung = niederlassung;
        this.regionalbereich = regionalbereich;
        this.letzte_Aenderung = letzte_Aenderung;
    }

    public String getPlc() {
        return plc;
    }

    public String getCode() {
        return code;
    }

    public String getLangname() {
        return langname;
    }

    public String getKurzname() {
        return kurzname;
    }

    public String getTyp_kurz() {
        return typ_kurz;
    }

    public String getTyp_lang() {
        return typ_lang;
    }

    public String getBetriebszustand() {
        return betriebszustand;
    }

    public String getDatum_ab() {
        return datum_ab;
    }

    public String getDatum_bis() {
        return datum_bis;
    }

    public String getNiederlassung() {
        return niederlassung;
    }

    public String getRegionalbereich() {
        return regionalbereich;
    }

    public String getLetzte_Aenderung() {
        return letzte_Aenderung;
    }
}

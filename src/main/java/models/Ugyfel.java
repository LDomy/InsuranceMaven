package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
public class Ugyfel extends Person{
    private String szemelyiszam;
    private String lakcim;
    private String anyjaNeve;
    private Date szulDatum;


    public Ugyfel(String nev, String emailCim, String szemelyiszam, String lakcim, String anyjaNeve, Date szulDatum) {
        super(nev, emailCim);
        this.szemelyiszam = szemelyiszam;
        this.lakcim = lakcim;
        this.anyjaNeve = anyjaNeve;
        this.szulDatum = szulDatum;
    }
    public Ugyfel(){}

    public String getSzemelyiszam() {
        return szemelyiszam;
    }

    public void setSzemelyiszam(String szemelyiszam) {
        this.szemelyiszam = szemelyiszam;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    public String getAnyjaNeve() {
        return anyjaNeve;
    }

    public void setAnyjaNeve(String anyjaNeve) {
        this.anyjaNeve = anyjaNeve;
    }

    public Date getSzulDatum() {
        return szulDatum;
    }

    public void setSzulDatum(Date szulDatum) {
        this.szulDatum = szulDatum;
    }
}

package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

enum KocsiTipus {
    Jokocsi, Megrosszkocsi
}
@XmlAccessorType(XmlAccessType.FIELD)
public class GepJarmuBiztositas extends Biztositas {
    private String rendszam;
    private KocsiTipus kocsiTipus;
    private Date evjarat;
    private int sulya;

    private boolean szervizkonyv;

    public GepJarmuBiztositas(Date letrehozasDatum, int biztositasiOsszeg, String rendszam, KocsiTipus kocsiTipus, Date evjarat, int sulya, boolean szervizkonyv) {
        super(letrehozasDatum, biztositasiOsszeg);
        this.rendszam = rendszam;
        this.kocsiTipus = kocsiTipus;
        this.evjarat = evjarat;
        this.sulya = sulya;
        this.szervizkonyv = szervizkonyv;
    }
    public GepJarmuBiztositas(){}
}

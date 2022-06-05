package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Biztositas {
    protected Date letrehozasDatum;
    protected int biztositasiOsszeg;

    public Biztositas(Date letrehozasDatum, int biztositasiOsszeg) {
        this.letrehozasDatum = letrehozasDatum;
        this.biztositasiOsszeg = biztositasiOsszeg;
    }
    public Biztositas(){}
}

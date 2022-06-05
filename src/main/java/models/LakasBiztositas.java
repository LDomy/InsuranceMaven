package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
public class LakasBiztositas extends Biztositas {
    private boolean lakotterulet;
    private int negyzetmeter;
    private boolean csaladihaz;

    public LakasBiztositas(Date letrehozasDatum, int biztositasiOsszeg, boolean lakotterulet, int negyzetmeter, boolean csaladihaz) {
        super(letrehozasDatum, biztositasiOsszeg);
        this.lakotterulet = lakotterulet;
        this.negyzetmeter = negyzetmeter;
        this.csaladihaz = csaladihaz;
    }
    public LakasBiztositas(){}
}

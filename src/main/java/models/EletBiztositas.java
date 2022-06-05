package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class EletBiztositas extends Biztositas {
    private Ugyfel kirekotik;
    private boolean kronikusBetegseg;
    private boolean halalosBetegseg;

    public EletBiztositas(Date letrehozasDatum, int biztositasiOsszeg, Ugyfel kirekotik, boolean kronikusBetegseg, boolean halalosBetegseg) {
        super(letrehozasDatum, biztositasiOsszeg);
        this.kirekotik = kirekotik;
        this.kronikusBetegseg = kronikusBetegseg;
        this.halalosBetegseg = halalosBetegseg;
    }
    public EletBiztositas(){}

    public Ugyfel getKirekotik() {
        return kirekotik;
    }

    public void setKirekotik(Ugyfel kirekotik) {
        this.kirekotik = kirekotik;
    }

    public boolean isKronikusBetegseg() {
        return kronikusBetegseg;
    }

    public void setKronikusBetegseg(boolean kronikusBetegseg) {
        this.kronikusBetegseg = kronikusBetegseg;
    }

    public boolean isHalalosBetegseg() {
        return halalosBetegseg;
    }

    public void setHalalosBetegseg(boolean halalosBetegseg) {
        this.halalosBetegseg = halalosBetegseg;
    }
}

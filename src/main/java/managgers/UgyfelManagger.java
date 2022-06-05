package managgers;
import models.Ugyfel;

import javax.xml.bind.annotation.*;
import java.util.HashMap;

@XmlRootElement(name = "Ugyfeltar")
@XmlAccessorType(XmlAccessType.FIELD)
public class UgyfelManagger {

    @XmlElementWrapper(name = "ugyfelBiztositasok")
    private HashMap<Ugyfel, Biztositasok> ugyfelBiztositasok;

    public UgyfelManagger() {
        this.ugyfelBiztositasok = new HashMap<>();
    }

    public HashMap<Ugyfel, Biztositasok> getUgyfelBiztositasok() {
        return ugyfelBiztositasok;
    }
}


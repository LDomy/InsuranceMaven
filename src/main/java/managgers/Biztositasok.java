package managgers;

import models.Biztositas;
import models.EletBiztositas;
import models.GepJarmuBiztositas;
import models.LakasBiztositas;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Biztositasok {


    @XmlElements({
            @XmlElement(type= LakasBiztositas.class),
            @XmlElement(type= EletBiztositas.class),
            @XmlElement(type= GepJarmuBiztositas.class)
    })
    public ArrayList<Biztositas> biztositasok = new ArrayList<>();
}

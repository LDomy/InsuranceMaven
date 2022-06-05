import managgers.Biztositasok;
import managgers.UgyfelManagger;
import models.Biztositas;
import models.EletBiztositas;
import models.LakasBiztositas;
import models.Ugyfel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class XMLUgyfelHasmapTest {
    public static UgyfelManagger um = new UgyfelManagger();
    static File xmlFile = new File("UgyfelManagger.xml");
    public static void main(String[] args) throws Exception {

//        xmlLoad();
//        for (Map.Entry<Ugyfel, Biztositasok> entry: um.getUgyfelBiztositasok().entrySet()) {
//            System.out.println(entry.getValue().biztositasok);
//        }

        UgyfelFillTest();
        xmlWrite();



    }

    public static void UgyfelFillTest(){
        Ugyfel ugyfel1 = new Ugyfel(
                "Viktor",
                "wolgyes@gmail.com",
                "Cica",
                "Csobanka",
                "Anna",
                new Date(2020, Calendar.MARCH,2)
        );

        um.getUgyfelBiztositasok().put(ugyfel1, new Biztositasok());

        um.getUgyfelBiztositasok().get(ugyfel1).biztositasok.add(
                new EletBiztositas(
                        new Date(2020, Calendar.MARCH,2),
                        2000,
                        ugyfel1,
                        true,
                        false
                )
        );
        um.getUgyfelBiztositasok().get(ugyfel1).biztositasok.add(
                new EletBiztositas(
                        new Date(2020, Calendar.MARCH,2),
                        2000,
                        new Ugyfel(
                                "Jozsi",
                                "jozsi@gmail.com",
                                "jozsiszemszam",
                                "Pomazi",
                                "Juli",
                                new Date(2020, Calendar.MARCH,2)
                        ),
                        false,
                        false
                )
        );

        um.getUgyfelBiztositasok().get(ugyfel1).biztositasok.add(
                new LakasBiztositas(
                        new Date(2020, Calendar.MARCH,2),
                        2000,
                        true,
                        54,
                        false
                )
        );


//        for (Biztositas b: um.getUgyfelBiztositasok().get(ugyfel1)) {
//            if (b.getClass() == EletBiztositas.class){
//
//
//                EletBiztositas tmpBizt = (EletBiztositas) b;
//                System.out.println("Nev: \t" + tmpBizt.getKirekotik().getNev());
//                System.out.print("Van e kronikus betegsege:");
//                if (tmpBizt.isKronikusBetegseg()){
//                    System.out.println(" van\n");
//                }
//                else System.out.println(" nincs\n");
//            }
//            else {
//                System.out.println("Ez nem egy eletbiztositas");
//            }
//        }
//
//
//        for (Map.Entry<Ugyfel, ArrayList<Biztositas>> ugyfelBiztositasokPair : um.getUgyfelBiztositasok().entrySet()) {
//            for (Biztositas b: ugyfelBiztositasokPair.getValue()) {
//                if (b.getClass() == EletBiztositas.class){
//
//
//                    EletBiztositas tmpBizt = (EletBiztositas) b;
//                    System.out.println("Nev: \t" + tmpBizt.getKirekotik().getNev());
//                    System.out.print("Van e kronikus betegsege:");
//                    if (tmpBizt.isKronikusBetegseg()){
//                        System.out.println(" van\n");
//                    }
//                    else System.out.println(" nincs\n");
//                }
//                else {
//                    System.out.println("Ez nem egy eletbiztositas");
//                }
//            }
//        }
    }



    public static void xmlLoad() throws Exception {
        try {
            JAXBContext jc = JAXBContext.newInstance(UgyfelManagger.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            um = (UgyfelManagger) unmarshaller.unmarshal(xmlFile);
        }

        catch (UnmarshalException e) {
            throw new Exception("File has bad structure!");
        }

    }

    public static void xmlWrite() {
        try {
            JAXBContext context = JAXBContext.newInstance(UgyfelManagger.class);
            Marshaller marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marsh.marshal(um, new File(String.valueOf(xmlFile)));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

import managgers.Biztositasok;
import managgers.UgyfelManagger;
import models.Biztositas;
import models.EletBiztositas;
import models.LakasBiztositas;
import models.Ugyfel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class BiztositasokCastTest {
    public static void main(String[] args) {
         UgyfelManagger um = new UgyfelManagger();

         Ugyfel ugyfel1 = new Ugyfel(
                 "Viktor",
                 "wolgyes@gmail.com",
                 "Cica",
                 "Csobanka",
                 "Anna",
                 new Date(2020, Calendar.MARCH,2)
         );

         Biztositasok ugyfel1Biztositasai = new Biztositasok();

        um.getUgyfelBiztositasok().put(ugyfel1, ugyfel1Biztositasai);

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


        for (Biztositas b: um.getUgyfelBiztositasok().get(ugyfel1).biztositasok) {
             if (b.getClass() == EletBiztositas.class){


                 EletBiztositas tmpBizt = (EletBiztositas) b;
                 System.out.println("Nev: \t" + tmpBizt.getKirekotik().getNev());
                 System.out.print("Van e kronikus betegsege:");
                 if (tmpBizt.isKronikusBetegseg()){
                     System.out.println(" van\n");
                 }
                 else System.out.println(" nincs\n");
             }
             else {
                 System.out.println("Ez nem egy eletbiztositas");
             }
        }


        for (Map.Entry<Ugyfel, Biztositasok> ugyfelBiztositasokPair : um.getUgyfelBiztositasok().entrySet()) {
            for (Biztositas b: ugyfelBiztositasokPair.getValue().biztositasok) {
                if (b.getClass() == EletBiztositas.class){


                    EletBiztositas tmpBizt = (EletBiztositas) b;
                    System.out.println("Nev: \t" + tmpBizt.getKirekotik().getNev());
                    System.out.print("Van e kronikus betegsege:");
                    if (tmpBizt.isKronikusBetegseg()){
                        System.out.println(" van\n");
                    }
                    else System.out.println(" nincs\n");
                }
                else {
                    System.out.println("Ez nem egy eletbiztositas");
                }
            }
        }


//        for (Biztositas b: bm.getBiztositasok()) {
//             if (b.getClass() == EletBiztositas.class){
//
//
//                 EletBiztositas tmpBizt = (EletBiztositas) b;
//                 System.out.println("Nev: \t" + tmpBizt.getKirekotik().getNev());
//                 System.out.print("Van e kronikus betegsege:");
//                 if (tmpBizt.isKronikusBetegseg()){
//                     System.out.println(" van\n");
//                 }
//                 else System.out.println(" nincs\n");
//             }
//             else {
//                 System.out.println("Ez nem egy eletbiztositas");
//             }
//        }
    }
}

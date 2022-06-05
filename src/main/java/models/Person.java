package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Person {
    protected String nev;
    protected String emailCim;

    public Person(String nev, String emailCim) {
        this.nev = nev;
        this.emailCim = emailCim;
    }
    public Person(){}

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmailCim() {
        return emailCim;
    }

    public void setEmailCim(String emailCim) {
        this.emailCim = emailCim;
    }
}

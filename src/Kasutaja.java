import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kasutaja {
    private String eesnimi;
    private String perenimi;
    private String email;
    private String telefon;
    private Date synnipaev;

    public Kasutaja() {
    }

    public Kasutaja(String eesnimi, String perenimi, String email, String telefon, String sünnipaev) throws ParseException {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.email = email;
        this.telefon = telefon;
        this.synnipaev = new SimpleDateFormat("dd/MM/yyyy").parse(sünnipaev);
    }


    public String getEesnimi() {
        return eesnimi;
    }

    public String getPerenimi() {
        return perenimi;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public Date getSynnipaev() {return synnipaev;}

    public void setEesnimi(String eesnimi) {
        this.eesnimi = eesnimi;
    }

    public void setPerenimi(String perenimi) {
        this.perenimi = perenimi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setSynnipaev(Date synnipaev) {this.synnipaev = synnipaev;}

    @Override
    public String toString() {
        return "nimi = " + eesnimi + " " + perenimi +
                ", email = " + email +
                ", telefon = " + telefon +
                ", sünnipaev = " + synnipaev;
    }
}

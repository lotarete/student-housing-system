import java.util.Date;

public class Rentnik implements Kasutajad {
    private String eesnimi;
    private String perenimi;
    private String email;
    private String telefon;
    private Date synnipaev;

    public Rentnik(String eesnimi, String perenimi, String email, String telefon, Date synnipaev) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.email = email;
        this.telefon = telefon;
        this.synnipaev = synnipaev;
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

    public Date getSynnipaev() {
        return synnipaev;
    }

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

    public void setSynnipaev(Date synnipaev) {
        this.synnipaev = synnipaev;
    }

    @Override
    public String toString() {
        return "rentnik{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perenimi='" + perenimi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", synnipaev=" + synnipaev +
                '}';
    }
}

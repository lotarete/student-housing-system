import java.util.Date;

public class omanik {
    private String eesnimi;
    private String perenimi;
    private String email;
    private String telefon;
    private Date synnipaev;

    public omanik(String eesnimi, String perenimi, String email, String telefon) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.email = email;
        this.telefon = telefon;
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

    @Override
    public String toString() {
        return "omanik{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perenimi='" + perenimi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rentnik implements Kasutajad {
    private String eesnimi;
    private String perenimi;
    private String email;
    private String telefon;
    private Date synnipaev;
    private List<Kaust> kaustad = new ArrayList<>();
    private List<Kinnisvara> kinnisvarad = new ArrayList<>();

    public Rentnik(String eesnimi, String perenimi, String email, String telefon, Date synnipaev) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.email = email;
        this.telefon = telefon;
        this.synnipaev = synnipaev;
    }


    public String otsiKinnisvara(){
        return null;
    }

    public void lisaKaust(Kaust kaust){
        kaustad.add(kaust);
    }

    public void eemaldaKaust(Kaust kaust){
        kaustad.remove(kaust);
    }

    public void jagaKausta(Kaust kaust, Rentnik sõber){
        List<Rentnik> kasutajad = kaust.getKasutajad();
        kasutajad.add(sõber);
    }

    public void lahkuKaustast(Kaust kaust, Rentnik sõber){
        List<Rentnik> kasutajad = kaust.getKasutajad();
        kasutajad.remove(sõber);

    }

    //?
    public void otsiOmanik(){
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

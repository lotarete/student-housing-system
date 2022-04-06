import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Rentnik extends Kasutaja {
    private List<Kaust> kaustad = new ArrayList<>();

    public Rentnik(String eesnimi, String perenimi, String email, String telefon, String sünnipaev) throws ParseException {
        super(eesnimi, perenimi, email, telefon, sünnipaev);
    }
    /*
    public String otsiKinnisvara(){
        return null;
    }
     */

    public void lisaKaust(Kaust kaust){
        kaustad.add(kaust);
    }

    public void eemaldaKaust(Kaust kaust){
        kaustad.remove(kaust);
    }

    public void jagaKausta(Kaust kaust, Rentnik sõber){
        List<Rentnik> kasutajad = kaust.getKaustaKasutajad();
        kasutajad.add(sõber);
    }

    public void lahkuKaustast(Kaust kaust, Rentnik sõber){
        List<Rentnik> kasutajad = kaust.getKaustaKasutajad();
        kasutajad.remove(sõber);

    }

    //?
    public void otsiOmanik(){
    }

    public List<Kaust> getKaustad() {
        return kaustad;
    }


    public void setKaustad(List<Kaust> kaustad) {
        this.kaustad = kaustad;
    }

}

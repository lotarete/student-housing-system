import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rentnik extends Kasutaja {
    private List<Kaust> kaustad = new ArrayList<>();
    private List<Kinnisvara> kinnisvarad = new ArrayList<>();

    public Rentnik(String eesnimi, String perenimi, String email, String telefon, String sünnipaev) throws ParseException {
        super(eesnimi, perenimi, email, telefon, sünnipaev);
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


}

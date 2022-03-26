import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Omanik extends Kasutaja {
    private List<Kinnisvara> omanikukinnisvarad = new ArrayList<>();

    public Omanik(String eesnimi, String perenimi, String email, String telefon, String sünnipaev) throws ParseException {
        super(eesnimi, perenimi, email, telefon, sünnipaev);
    }

    public void lisaKinnisvara(Kinnisvara kinnisvara) {
        omanikukinnisvarad.add(kinnisvara);
    }

    public void kustutaKinnisvara(Kinnisvara kinnisvara){
        omanikukinnisvarad.remove(kinnisvara);
    }

    public List<Kinnisvara> getOmanikukinnisvarad() {
        return omanikukinnisvarad;
    }
}

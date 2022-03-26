import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kaust {
    private String nimi;
    private Rentnik omanik;
    private List<Rentnik> kasutajad = new ArrayList<>();
    private List<Kinnisvara> kinnisvarad = new ArrayList<>();
    private HashMap<List<Kinnisvara>, List<Double>> KinnisvaradHinnangud = new HashMap<List<Kinnisvara>, List<Double>>();
    private HashMap<List<Kinnisvara>, Double> KinnisvaradKeskmised = new HashMap<List<Kinnisvara>, Double>();

    public Kaust(String nimi, Rentnik omanik, List<Rentnik> kasutajad) {
        this.nimi = nimi;
        this.omanik = omanik;
        this.kasutajad = kasutajad;
    }

    //võimaldab kõigil kasutajatel lisada hinnangu kaustas olevale kinnisvarale, kõik ei pea lisama aga võivad.

    public void lisaHinnang(){
        //loome hinnangute listi, kui kinnisvarale vastav hinnagutelist on tühi? (if lause)
        //else kui hinnangute list on juba olemas siis lisame sinna hinnangu;
        //käivitame arvutakeskmine (keskmise sees ->  ja arvutame listi uue keskmise ja lisame selle hashmapile Kinnisvaradkeskmine)

    }

    public void arvutaKeskmineHinnang(){} //arvutab kinnisvarale keskmise hinnagulistie järgi ja lisab selle hashmappi



    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Rentnik getOmanik() {
        return omanik;
    }

    public void setOmanik(Rentnik omanik) {
        this.omanik = omanik;
    }

    public List<Rentnik> getKasutajad() {
        return kasutajad;
    }

    public void setKasutajad(List<Rentnik> kasutajad) {
        this.kasutajad = kasutajad;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kaust {
    private String nimi;
    private Rentnik omanik;
    private List<Rentnik> kasutajad = new ArrayList<>();
    //private List<Kinnisvara> kinnisvarad = new ArrayList<>();
    private HashMap<Kinnisvara, List<Double>> KinnisvaradHinnangud = new HashMap<Kinnisvara, List<Double>>();
    private HashMap<Kinnisvara, Double> KinnisvaradKeskmised = new HashMap<Kinnisvara, Double>();

    public Kaust(String nimi, Rentnik omanik, List<Rentnik> kasutajad) {
        this.nimi = nimi;
        this.omanik = omanik;
        //this.kasutajad = kasutajad.add(omanik);
    }

    //võimaldab kõigil kasutajatel lisada hinnangu kaustas olevale kinnisvarale, kõik ei pea lisama aga võivad.

    public void lisaHinnang(){
        //loome hinnangute listi, kui kinnisvarale vastav hinnagutelist on tühi? (if lause)
        //else kui hinnangute list on juba olemas siis lisame sinna hinnangu;
        //käivitame arvutakeskmine (keskmise sees ->  ja arvutame listi uue keskmise ja lisame selle hashmapile Kinnisvaradkeskmine)

    }

    public void arvutaKeskmineHinnang(){} //arvutab kinnisvarale keskmise hinnagulistie järgi ja lisab selle hashmappi
}

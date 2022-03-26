import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kaust {
    private String nimi;
    private Rentnik omanik;
    private List<Rentnik> kasutajad = new ArrayList<>();
    //private List<Kinnisvara> kinnisvarad = new ArrayList<>();
    private HashMap<Kinnisvara, Double> hinnangud = new HashMap<Kinnisvara, Double>();

    public Kaust(String nimi, Rentnik omanik, List<Rentnik> kasutajad) {
        this.nimi = nimi;
        this.omanik = omanik;
        //this.kasutajad = kasutajad.add(omanik);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kaust {
    private String nimi;
    private Rentnik omanik;
    private List<Rentnik> kasutajad = new ArrayList<>();
    private List<Kinnisvara> kinnisvarad = new ArrayList<>();
    private List<Double> hinnangud=new ArrayList<>();
    private HashMap<Kinnisvara, List<Double>> KinnisvaradHinnangud = new HashMap<Kinnisvara, List<Double>>();
    private HashMap<Kinnisvara, Double> KinnisvaradKeskmised = new HashMap<Kinnisvara, Double>();

    public Kaust(String nimi, Rentnik omanik, List<Rentnik> kasutajad) {
        this.nimi = nimi;
        this.omanik = omanik;
        this.kasutajad = kasutajad;
    }

    public void lisaHinnang(Kinnisvara kinnisvara, double hinnang){
        hinnangud.add(hinnang);
        arvutaKeskmineHinnang(kinnisvara, hinnangud);
    }

    public void arvutaKeskmineHinnang(Kinnisvara kinnisvara,List<Double> hinnangud){
        double summa=0; int n=0;
        for(double arv:hinnangud){
            summa+=arv;
            n++;
        }
        double keskm = summa/n;
        KinnisvaradKeskmised.put(kinnisvara, keskm);

    }


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

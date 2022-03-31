import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaust {
    private String nimi;
    private Rentnik omanik;
    private List<Rentnik> kaustaKasutajad = new ArrayList<>();
    private HashMap<Kinnisvara, Double> KinnisvaradKeskmised = new HashMap<Kinnisvara, Double>();
    private HashMap<Kinnisvara, List<Double>> KinnisvaradHinnangud = new HashMap<Kinnisvara, List<Double>>();


    public Kaust(String nimi, Rentnik omanik) {
        this.nimi = nimi;
        this.omanik = omanik;
    }

    public Kaust() {
    }

    public void lisaHinnang(Kinnisvara kinnisvara, double hinnang){
        List<Double> hinnangud;
        if(KinnisvaradHinnangud.get(kinnisvara) == null){
            hinnangud= new ArrayList<>();
        }
        else{
            hinnangud= KinnisvaradHinnangud.get(kinnisvara);
        }
        hinnangud.add(hinnang);
        KinnisvaradHinnangud.put(kinnisvara,hinnangud);
        arvutaKeskmineHinnang(kinnisvara, hinnangud);
    }

    public void arvutaKeskmineHinnang(Kinnisvara kinnisvara, List<Double> hinnangud){
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

    public List<Rentnik> getKaustaKasutajad() {
        return kaustaKasutajad;
    }

    public void setKaustaKasutajad(List<Rentnik> kaustaKasutajad) {
        this.kaustaKasutajad = kaustaKasutajad;
    }

    public HashMap<Kinnisvara, Double> getKinnisvaradKeskmised() {
        return KinnisvaradKeskmised;
    }

    public void setKinnisvaradKeskmised(HashMap<Kinnisvara, Double> kinnisvaradKeskmised) {
        KinnisvaradKeskmised = kinnisvaradKeskmised;
    }

    public String kasutajateNimed(){
        String kasutajanimed = null;
        for (Kasutaja i:kaustaKasutajad) {
            kasutajanimed += i.getEesnimi() + " " + i.getPerenimi() + "   ";
        }
        return kasutajanimed;
    }

    public String väljastaKinnisvarad(){
        for(Map.Entry<Kinnisvara, Double> entry : KinnisvaradKeskmised.entrySet()) {
            Integer kvid = entry.getKey().getId();
            Double khinnang = entry.getValue();
            System.out.println("Kinnisvara id-ga: " + kvid + " hinnang = " + khinnang + "; ");
        }
        return " ";
    }


    @Override
    public String toString() {
        return "Kaust: " + "\n" +
                "nimi = " + nimi + "\n" +
                ", kasutajad = " + kasutajateNimed() + "\n" +
                ", kinnisvarad = " +  "\n" + väljastaKinnisvarad();

    }
}

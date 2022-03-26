import java.util.ArrayList;
import java.util.List;

public class Kinnisvara {
    static int counter = 0; //couner aitab luua id-d, pärast iga uut kinnisvara seda suurendatakse 1 võrra
    private int Id; //loome id
    private String nimi = null; //kinnisvara nime ei pea lisama, kui ei ole lisatud siis genereeritakse nimeks aadressi ja tubade arvu järgi pealkiri
    private Kasutaja omanik;
    private double hindkuus;
    private double m2; // ruutmeeri hind arvutatakse meetodiga
    private String maakond = null;
    private String linn = null;
    private String tänav = null;
    private String majanumber = null; // kujul maja/korter
    private String korrus = null; //kujul korrus/korruseidkokku, kui mitu korrust siis korrus-korrus/korruseidkokku
    private int tube;
    private double magamistube; //võib olla ka nt 2,5 magamistuba, kus poolik on potentsiaalne magamistuba
    private double vannitube; //võib olla ka 0,5 vannituba, kus pooliu all on mõeldud ainult vetsu
    private String aed; //väärtused 0 - ei 1 - on
    private String kirjeldus;
    private List<String> lisad = new ArrayList<>(); //garaaž,parkimiskoht,nõudepesumasin, pesumasin jne, neid saab lisada kas kohe konstruktoris või hiljem lisada ka eraldi meetodiga

    public Kinnisvara() {
    }

    public Kinnisvara(Kasutaja omanik, double hindkuus, double m2, String maakond, String linn, String tänav, String majanumber, String korrus, int tube, double magamistube, double vannitube, String aed, String kirjeldus) {
        Id = Id = ++counter;
        this.omanik = omanik;
        this.hindkuus = hindkuus;
        this.m2 = m2;
        this.maakond = maakond;
        this.linn = linn;
        this.tänav = tänav;
        this.majanumber = majanumber;
        this.korrus = korrus;
        this.tube = tube;
        this.magamistube = magamistube;
        this.vannitube = vannitube;
        this.aed = aed;
        this.kirjeldus = kirjeldus;
    }

    public int getId() {
        return Id;
    }

    public String getNimi() {
        return nimi;
    }

    public Kasutaja getOmanik() {
        return omanik;
    }

    public double getHindkuus() {
        return hindkuus;
    }

    public double getM2() {
        return m2;
    }

    public String getMaakond() {
        return maakond;
    }

    public String getLinn() {
        return linn;
    }

    public String getTänav() {
        return tänav;
    }

    public String getMajanumber() {
        return majanumber;
    }

    public String getKorrus() {
        return korrus;
    }

    public int getTube() {
        return tube;
    }

    public double getMagamistube() {
        return magamistube;
    }

    public double getVannitube() {
        return vannitube;
    }

    public String getAed() {
        return aed;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public List<String> getLisad() {
        return lisad;
    }


    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setHindkuus(double hindkuus) {
        this.hindkuus = hindkuus;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public void setMaakond(String maakond) {
        this.maakond = maakond;
    }

    public void setLinn(String linn) {
        this.linn = linn;
    }

    public void setTänav(String tänav) {
        this.tänav = tänav;
    }

    public void setMajanumber(String majanumber) {
        this.majanumber = majanumber;
    }

    public void setKorrus(String korrus) {
        this.korrus = korrus;
    }

    public void setTube(int tube) {
        this.tube = tube;
    }

    public void setMagamistube(double magamistube) {
        this.magamistube = magamistube;
    }

    public void setVannitube(double vannitube) {
        this.vannitube = vannitube;
    }

    public void setAed(String aed) {
        this.aed = aed;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }


    public void lisaLisa(String lisa){
        lisad.add(lisa);
    }
    public void kustutaLisa(String lisa){
        int indeks = lisad.indexOf(lisa);
        lisad.remove(indeks);
    }

    @Override
    public String toString() {
        return "Kinnisvara{" +
                "Id=" + Id +
                ", nimi='" + nimi + '\'' +
                ", omanik=" + omanik +
                ", hindkuus=" + hindkuus +
                ", m2=" + m2 +
                ", maakond='" + maakond + '\'' +
                ", linn='" + linn + '\'' +
                ", tänav='" + tänav + '\'' +
                ", majanumber='" + majanumber + '\'' +
                ", korrus='" + korrus + '\'' +
                ", tube=" + tube +
                ", magamistube=" + magamistube +
                ", vannitube=" + vannitube +
                ", aed='" + aed + '\'' +
                ", kirjeldus='" + kirjeldus + '\'' +
                ", lisad=" + lisad +
                '}';
    }
}

import java.text.SimpleDateFormat;
import java.util.*;

public class Peaklass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Kasutaja> kasutajad = new ArrayList<>();
        List<Kinnisvara> kinnisvarad = new ArrayList<>();
        Kasutaja aktiivnekasutaja = new Kasutaja();
        //TEEME PORTAALI JUBA OSAD KASUTAJAD
        Omanik mari = new Omanik("Mari", "Maasikas","mari.maasikas@gmail.com", "568848473", "05/04/1998");
        Omanik jaan = new Omanik("Jaan", "Jaanis","mari.maasikas@gmail.com", "568848473", "09/04/1998");
        Maja marimaja = new Maja(mari,600,64.5,"Harjumaa", "Tallinn", "Wiedemanni", "52/11", "3/5", 3, 2.5, 1, "ei", "Ilus maja Kadriorus");
        Korter mariKorter = new Korter(mari, 350, 40,"Harjumaa", "puudub", "Kuu","44", "1/1", 1,1, 1, "ei", "Hea kodu rahulikule üliõpilasele");
        mari.lisaKinnisvara(mariKorter);mari.lisaKinnisvara(marimaja);
        Korter jaaniKorter = new Korter(jaan, 400, 46,"Tarumaa", "Tartu", "Soone","2", "2/3", 2,1, 1, "jah", "Kodu vaikses piirkonaas");
        jaan.lisaKinnisvara(jaaniKorter);
        kinnisvarad.add(mariKorter); kinnisvarad.add(marimaja); kinnisvarad.add(jaaniKorter);
        kasutajad.add(mari); kasutajad.add(jaan);
        Rentnik liisa = new Rentnik("Liisa", "Liblikas", "liisa@mail.ee", "5674839", "21/05/2000");

            System.out.println("Tere tulemast Üliõpilaskodu süsteemi!");
            //KASUTAJA KONTROLL
            System.out.println("Kas olete kinnisvaraomanik (sisesta 0) või rentnik (sisesta 1)?");
            int kasutaja = scan.nextInt();
            System.out.println("Kas teil on juba kasutaja olemas (sisesta 1) või soovite selle luua (sisestage 0)");
            int kasutajaolemas = scan.nextInt();
            if (kasutajaolemas == 0) {
                System.out.println("Loome teile kasutaja." + "\n" + "Selleks sisestage enda eesnimi");
                scan.nextLine();
                String eesnimi = scan.nextLine();
                System.out.println("Selleks sisestage enda perenimi");
                String perenimi = scan.nextLine();
                System.out.println("Selleks sisestage enda email");
                String email = scan.nextLine();
                System.out.println("Selleks sisestage enda telefon");
                String telefon = scan.nextLine();
                System.out.println("Selleks sisestage enda sünnipäev kujul pp/kk/aaaa");
                String kuupaev = scan.nextLine();
                //KASUTAJA LOOMINE
                if (kasutaja == 0) {
                    kasutajad.add(new Omanik(eesnimi, perenimi, email, telefon, kuupaev));
                    System.out.println("Omaniku kasutaja on loodud");
                } else if (kasutaja == 1) {
                    kasutajad.add(new Rentnik(eesnimi, perenimi, email, telefon, kuupaev));
                    System.out.println("Rentniku kasutaja on loodud");
                } else
                    System.out.println("Palun sisesta küsitud andmed korrektselt!");

                aktiivnekasutaja = kasutajad.get(kasutajad.size()-1);
            } else if (kasutajaolemas == 1) {
                //KASUTAJA LEIDMINE
                System.out.println("Selleks sisestage enda eesnimi");
                scan.nextLine();
                String eesnimi = scan.nextLine();
                System.out.println("Selleks sisestage enda perenimi");
                String perenimi = scan.nextLine();
                for (Kasutaja i: kasutajad) {
                    if(i.getEesnimi().equals(eesnimi) && i.getPerenimi().equals(perenimi)){
                        aktiivnekasutaja = i;
                    }
                }
            } else
                System.out.println("Palun sisesta küsitud andmed korrektselt!");
            System.out.println(aktiivnekasutaja.getClass());
            //omaniku tegevused
            if(aktiivnekasutaja instanceof Omanik){
                System.out.println("Vali tegevus:");
                System.out.println(
                        "1 - lisa kinnisvara" + "\n" +
                        "2 - kustuta kinnisvara" + "\n" +
                        "3 - vaata oma kinnisvara" + "\n");
                int tegevus = scan.nextInt();
                if(tegevus == 1){
                    Kasutaja omanik = aktiivnekasutaja;
                    System.out.println("Lisame kinnisvara." +"\n"+ "Kas tegu on maja (sistage 0) või korteriga (sisetage 1)");
                    scan.nextLine();
                    int kvtyyp = scan.nextInt();
                    System.out.println("Sisestage üüripinna kuurent eurodes");
                    scan.nextLine();
                    double hindkuus = scan.nextDouble();
                    System.out.println("Sisestage üüripind ruutmeetrites");
                    scan.nextLine();
                    double m2 = scan.nextDouble();
                    System.out.println("Sisetage maakond");
                    scan.nextLine();
                    String maakond = scan.nextLine();
                    System.out.println("Sisetage asula, kui asula puudub sisetage \"puudub\"");
                    String linnsisse = scan.nextLine();
                    String linn = new String();
                    if (!linnsisse.equals("puudub"))
                          linn = linnsisse;
                    else
                        linn = "täpsustamata";
                    System.out.println("Sisetage tänav, kui tänav puudub sisetage \"puudub\"");
                    String tänavsisse = scan.nextLine();
                    String tänav = new String();
                    if (!linnsisse.equals("puudub"))
                        tänav = tänav;
                    else
                        tänav = "täpsustamata";
                    System.out.println("Sisetage tänavanumber");
                    String majanumber = scan.nextLine();
                    System.out.println("Sisetage korrus kujul korrus/korruseid kokku, kui mitu korrust siis korrus-korrus/korruseidkokku");
                    String korrus = scan.nextLine();
                    System.out.println("Sisetage tubade arv");
                    int tube =  scan.nextInt();
                    System.out.println("Sisetage magamistubade arv");
                    double magamistube = scan.nextDouble();
                    System.out.println("Sisetage vannitubade arv");
                    double vannitube = scan.nextDouble();
                    System.out.println("Kas üüripinnal on aed? Sisetage \"jah\", \"ei\"");
                    scan.nextLine();
                    String aed = scan.nextLine();
                    System.out.println("Lisage lühike kirjeldus");
                    String kirjeldus = scan.nextLine();
                    if(kvtyyp==0)
                        kinnisvarad.add(new Maja(omanik, hindkuus,m2, maakond, linn, tänav, majanumber, korrus,tube,magamistube,vannitube,aed, kirjeldus));
                    else if (kvtyyp==1)
                        kinnisvarad.add(new Korter(omanik, hindkuus,m2, maakond, linn, tänav, majanumber, korrus,tube,magamistube,vannitube,aed, kirjeldus));
                    System.out.println("Kas korteril on erilisi lisasid nagu näiteks garaaž, saun, terass jne? Sistage 0, kui soovite sisetada kuulutusele lisasid, 1 kui soovite kinnisvara portaali lisada");
                    int lisasidsistema = scan.nextInt();
                    if(lisasidsistema==0){
                        System.out.println("Sisetage lisad kujul: lisa, lisa, lisa jne");
                        scan.nextLine();
                        String lisarida = scan.nextLine();
                        List<String> lisad = new ArrayList<String>(Arrays.asList(lisarida.strip().split(", ")));
                        for(String Lisa: lisad){
                            kinnisvarad.get(kinnisvarad.size()-1).lisaLisa(Lisa);
                        }
                    //lisame kinnisvara omaniku kinnisvaradele
                    ((Omanik) aktiivnekasutaja).lisaKinnisvara(kinnisvarad.get(kinnisvarad.size()-1));
                    System.out.println("Kinnisvara on lisatud!");
                    System.out.println("Sinu kinnisvarad on: ");
                        for (Kinnisvara kv: ((Omanik)aktiivnekasutaja).getOmanikukinnisvarad()) {
                            System.out.println(kv);
                        }
                }}
                else if(tegevus == 2){
                    System.out.println("Sinu kinnisvarad on: ");
                    for (Kinnisvara kv: ((Omanik)aktiivnekasutaja).getOmanikukinnisvarad()) {
                        System.out.println(kv);
                    }
                    System.out.println("Sisesta kinnisvara id mida soovid kustutada");
                    int kustutaindeks = scan.nextInt();
                    Kinnisvara kustuta = new Kinnisvara();
                    for (Kinnisvara kv: kinnisvarad) {
                        if(kv.getId()==kustutaindeks){
                            kustuta = kv;
                        }
                    }
                    //kustutame portaalist
                    kinnisvarad.remove(kustuta);
                    //kustutame omaiku kinnisvarast
                    ((Omanik) aktiivnekasutaja).kustutaKinnisvara(kustuta);
                    System.out.println("Kinnisvara on kustutatud");

                }
                else if(tegevus == 3){
                    System.out.println(((Omanik) aktiivnekasutaja).getOmanikukinnisvarad());
                }
            }
            //rentniku tegevused
            else if (aktiivnekasutaja instanceof Rentnik){ //ma panin mingi põhja siia , is mul endal tegemuise käigus tuli
                System.out.println("Vali tegevus:");
                System.out.println(
                        "1 - lisa kinnisvara" + "\n" +
                                "2 - kustuta kinnisvara" + "\n" +
                                "3 - vaata oma kinnisvara" + "\n" +
                                "3 - muuda oma kinnisvara" + "\n" );
                int tegevus = scan.nextInt();
                if(tegevus == 1){}
                else if(tegevus == 1){}
                else if(tegevus == 1){}
                else if(tegevus == 1){}
            }




    }

}

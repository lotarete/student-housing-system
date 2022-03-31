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
        Rentnik karl = new Rentnik("Karl", "Kaar", "karl@gmail.com", "5683002", "21/05/2000");
        kasutajad.add(liisa); kasutajad.add(karl);

            System.out.println("Tere tulemast Üliõpilaskodu süsteemi!");
            //KASUTAJA KONTROLL
            System.out.println("Kas olete kinnisvaraomanik (sisesta 0) või rentnik (sisesta 1)?");
            int kasutaja = scan.nextInt();
            System.out.println("Kas teil on juba kasutaja olemas (sisesta 0) või soovite selle luua (sisestage 1)");
            int kasutajaolemas = scan.nextInt();
            if (kasutajaolemas == 1) {
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
            } else if (kasutajaolemas == 0) {
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

            //omaniku tegevused
            if(aktiivnekasutaja instanceof Omanik) {
                System.out.println("Vali tegevus:");
                System.out.println(
                                "0 - kui soovite portaalist lahkuda" + "\n" +
                                "1 - lisa kinnisvara" + "\n" +
                                "2 - kustuta kinnisvara" + "\n" +
                                "3 - vaata oma kinnisvara" + "\n" +
                                "4 - väljasta portaali kinnisvara" + "\n");
                int tegevus = scan.nextInt();
                while (tegevus != 0) {
                    if (tegevus == 1) {
                        Kasutaja omanik = aktiivnekasutaja;
                        System.out.println("Lisame kinnisvara." + "\n" + "Kas tegu on maja (sistage 0) või korteriga (sisetage 1)");
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
                        int tube = scan.nextInt();
                        System.out.println("Sisetage magamistubade arv");
                        double magamistube = scan.nextDouble();
                        System.out.println("Sisetage vannitubade arv");
                        double vannitube = scan.nextDouble();
                        System.out.println("Kas üüripinnal on aed? Sisetage \"jah\", \"ei\"");
                        scan.nextLine();
                        String aed = scan.nextLine();
                        System.out.println("Lisage lühike kirjeldus");
                        String kirjeldus = scan.nextLine();
                        if (kvtyyp == 0)
                            kinnisvarad.add(new Maja(omanik, hindkuus, m2, maakond, linn, tänav, majanumber, korrus, tube, magamistube, vannitube, aed, kirjeldus));
                        else if (kvtyyp == 1)
                            kinnisvarad.add(new Korter(omanik, hindkuus, m2, maakond, linn, tänav, majanumber, korrus, tube, magamistube, vannitube, aed, kirjeldus));
                        System.out.println("Kas korteril on erilisi lisasid nagu näiteks garaaž, saun, terass jne? Sistage 0, kui soovite sisetada kuulutusele lisasid, 1 kui soovite kinnisvara portaali lisada");
                        int lisasidsistema = scan.nextInt();
                        if (lisasidsistema == 0) {
                            System.out.println("Sisetage lisad kujul: lisa, lisa, lisa jne");
                            scan.nextLine();
                            String lisarida = scan.nextLine();
                            List<String> lisad = new ArrayList<String>(Arrays.asList(lisarida.strip().split(", ")));
                            for (String Lisa : lisad) {
                                kinnisvarad.get(kinnisvarad.size() - 1).lisaLisa(Lisa);
                            }
                            //lisame kinnisvara omaniku kinnisvaradele
                            ((Omanik) aktiivnekasutaja).lisaKinnisvara(kinnisvarad.get(kinnisvarad.size() - 1));
                            System.out.println("Kinnisvara on lisatud!");
                            System.out.println("Sinu kinnisvarad on: ");
                            for (Kinnisvara kv : ((Omanik) aktiivnekasutaja).getOmanikukinnisvarad()) {
                                System.out.println(kv);
                            }
                        }
                    } else if (tegevus == 2) {
                        System.out.println("Sinu kinnisvarad on: ");
                        for (Kinnisvara kv : ((Omanik) aktiivnekasutaja).getOmanikukinnisvarad()) {
                            System.out.println(kv);
                        }
                        System.out.println("Sisesta kinnisvara id, mida soovid kustutada");
                        int kustutaindeks = scan.nextInt();
                        Kinnisvara kustuta = new Kinnisvara();
                        for (Kinnisvara kv : kinnisvarad) {
                            if (kv.getId() == kustutaindeks) {
                                kustuta = kv;
                            }
                        }
                        //kustutame portaalist
                        kinnisvarad.remove(kustuta);
                        //kustutame omaiku kinnisvarast
                        ((Omanik) aktiivnekasutaja).kustutaKinnisvara(kustuta);
                        System.out.println("Kinnisvara on kustutatud");

                    } else if (tegevus == 3) {
                        System.out.println(((Omanik) aktiivnekasutaja).getOmanikukinnisvarad());
                    }
                    else if(tegevus == 4){
                        System.out.println("Saadaolevad kinnisvarad on järgmised: ");
                        for(Kinnisvara kinnisvara : kinnisvarad){
                            System.out.println(kinnisvara);
                        }
                    }
                    System.out.println("Vali uuesti tegevus:");
                    System.out.println(
                                    "0 - kui soovite portaalist lahkuda" + "\n" +
                                    "1 - lisa kinnisvara" + "\n" +
                                    "2 - kustuta kinnisvara" + "\n" +
                                    "3 - vaata oma kinnisvara" + "\n" +
                                    "4 - väljasta oma kinnisvara" + "\n");
                    tegevus = scan.nextInt();

                }
            }

            //rentniku tegevused
            else if (aktiivnekasutaja.getClass() == Rentnik.class ){
                System.out.println("Vali tegevus:");
                System.out.println(
                                "0 - kui soovite portaalist lahkuda" + "\n" +
                                "1 - otsi kinnisvara" + "\n" +
                                "2 - loo endale kaust" + "\n" +
                                "3 - vaata enda kaustasid" + "\n" +
                                "4 - lisa sõber kausta" + "\n" +
                                "5 - eemalda end kaustast" + "\n" );
                int tegevus = scan.nextInt();
                while(tegevus!=0){
                if(tegevus == 1){ //hetkel väljastab kõik saadaolevad pakkumised, ei tee suuremat filtreerimist, hiljem teen täpsemaks
                    System.out.println("Mille üürimisest oleksite huvitatud – maja (sisestage 0), korteri (sisestage 1), mõlema (sisestage 2)");
                    int valik1= scan.nextInt();
                    if(valik1 == 0){
                        System.out.println("Saadaolevad majad on järgmised: ");
                        for(Kinnisvara kinnisvara : kinnisvarad){
                            if (kinnisvara instanceof Maja){
                                System.out.println(kinnisvara);
                            }
                        }
                    }
                    else if(valik1 == 1){
                        System.out.println("Saadaolevad korterid on järgmised: ");
                        for(Kinnisvara kinnisvara : kinnisvarad){
                            if (kinnisvara instanceof Korter){
                                System.out.println(kinnisvara);
                            }
                        }
                    }
                    else if(valik1 == 2){
                        System.out.println("Saadaolevad kinnisvarad on järgmised: ");
                        for(Kinnisvara kinnisvara : kinnisvarad){
                            System.out.println(kinnisvara);
                        }
                    }

                    //kinnisvara lisamine kausta otse majade juurest
                    List<Integer> meeldivad = new ArrayList<>();
                    while (true) {
                        Kinnisvara abikv = new Kinnisvara();
                        System.out.println("Kas midagi jäi silma? Sisesta meeldiva kinnisvara id, et seda kausta lisada. (sisesta 0 kui soovid edasi liikuda)");
                        int meeldiv = scan.nextInt();
                        if (meeldiv != 0) {
                            if(((Rentnik) aktiivnekasutaja).getKaustad().size()==0){
                                System.out.println("NB! Kuna sul veel ühtegi kausta pole, mine loo endale enne kaust");
                                break;
                            }
                            System.out.println("Sinu kaustad: ");
                            System.out.println(((Rentnik) aktiivnekasutaja).getKaustad());
                            System.out.println("Sisesta kausta nimi, kuhu soovid salestatud kinnisvara lisada: ");
                            scan.nextLine();
                            String kaustanimi = scan.nextLine();
                            //võtab kinnisvara
                            for(Kinnisvara kv:kinnisvarad) {
                                if(kv.getId() == meeldiv){
                                    abikv = kv;
                                }
                            }
                            System.out.println("Lisage kinnisvarale id-ga "+meeldiv+" hinnang 1-10: ");
                            double hinnang=scan.nextDouble();
                            //loome hashmapi
                            if(1 <= hinnang && hinnang <= 10){
                                for (Kaust i: ((Rentnik) aktiivnekasutaja).getKaustad()) {
                                   if(i.getNimi().equals(kaustanimi)){
                                       i.lisaHinnang(abikv,hinnang);
                                   }
                                }
                            }




                            //
                        }
                        else if (meeldiv == 0){
                            break;
                        }
                    }

                }
                else if(tegevus == 2){ //loome kausta
                    System.out.println("Loome kausta: ");
                    System.out.println("Pange enda kaustale nimi: ");
                    scan.nextLine();
                    String kaustaNimi=scan.nextLine();
                    System.out.println("Sisestage kinnisvarade arv, mida soovite kausta lisada: ");
                    int n= scan.nextInt();

                    Kinnisvara abiks = new Kinnisvara();
                    Kaust abi = new Kaust();


                    ((Rentnik) aktiivnekasutaja).getKaustad().add(new Kaust(kaustaNimi, (Rentnik) aktiivnekasutaja));
                    for(Kaust kaust: ((Rentnik) aktiivnekasutaja).getKaustad()){
                        if(kaust.getNimi().equals(kaustaNimi)){
                            abi=kaust;
                        }
                    }

                    System.out.println("Portaalis olevad kinnisvarad: ");
                    for(Kinnisvara kinnisvara : kinnisvarad){
                        System.out.println(kinnisvara);
                    }

                    while(n > 0) {
                        System.out.println("Sisestage kinnisvara id, mida soovite kausta lisada: ");
                        int id=scan.nextInt();
                        //võtab kinnisvara
                        for(Kinnisvara kv:kinnisvarad) {
                            if(kv.getId() == id){
                                abiks = kv;
                            }
                        }
                        if (abiks.getId() != 0){
                            System.out.println("Lisage kinnisvarale id-ga "+id+" hinnang 1-10: ");
                            double hinnang=scan.nextDouble();
                            //loome hashmapi
                            if(1 <= hinnang && hinnang <= 10){
                                abi.lisaHinnang(abiks,hinnang);
                            }
                        }
                        else{
                            System.out.println("Sellise id-ga kinnisvara ei ole!");
                        }
                        n--;

                    }
                    System.out.println("Kaust on loodud");
                    System.out.println("Teie kaust: ");
                    System.out.println(abi);

                }
                else if(tegevus == 3){ //väljasta oma kaustad
                    System.out.println("Sinu kaustad: ");
                    System.out.println(((Rentnik) aktiivnekasutaja).getKaustad());
                }
                else if(tegevus == 4){ //lisame inimesi kausta juurde
                    System.out.println("Lisame kausta inimese juurde");
                    System.out.println("Sisestage kausta nimi: ");
                    String nimiK = scan.nextLine();
                    Kaust abiKaust = null;
                    Rentnik abiksKasutaja = null;
                    for(Kaust kaust: ((Rentnik) aktiivnekasutaja).getKaustad()){
                        if(nimiK.equals(kaust.getNimi())){
                            abiKaust=kaust;
                        }
                    }
                    System.out.println("Sisestage inimese eesnimi, keda soovite lisada: ");
                    String enimi = scan.nextLine();
                    System.out.println("Sisestage inimese perekonnanimi, keda soovite lisada: ");
                    String pnimi = scan.nextLine();

                    for(Kasutaja inimene : kasutajad){
                        if(inimene instanceof Rentnik) {
                            if (enimi.equals(inimene.getEesnimi()) && pnimi.equals(inimene.getPerenimi())) {
                                abiksKasutaja=(Rentnik) inimene;
                            }
                        }
                    }
                    abiKaust.getKaustaKasutajad().add(abiksKasutaja);
                    System.out.println("Kasutaja "+enimi+" "+pnimi+"on lisatud kausta "+nimiK+".");
                }
                else if(tegevus == 5){ //eemaldame inimese kaustast
                    System.out.println("Eemaldame kaustast kasutaja: ");
                    System.out.println("Sisestage kausta nimi: ");
                    String kaustNimi = scan.nextLine();
                    Kaust abiKaust = null;
                    Rentnik abiksKasutaja = null;
                    for(Kaust kaust: ((Rentnik) aktiivnekasutaja).getKaustad()){
                        if(kaustNimi.equals(kaust.getNimi())){
                            abiKaust=kaust;
                        }
                    }
                    System.out.println("Sisestage inimese eesnimi, keda soovite eemaldada: ");
                    String enimi = scan.nextLine();
                    System.out.println("Sisestage inimese perekonnanimi, keda soovite eemaldada: ");
                    String pnimi = scan.nextLine();


                    for(Kasutaja inimene : kasutajad){
                        if(inimene instanceof Rentnik) {
                            if (enimi.equals(inimene.getEesnimi()) && pnimi.equals(inimene.getPerenimi())) {
                                abiksKasutaja=(Rentnik) inimene;
                            }
                        }
                    }
                    abiKaust.getKaustaKasutajad().remove(abiksKasutaja);
                    System.out.println("Kasutaja "+enimi+" "+pnimi+"on eemaldatud kaustast "+kaustNimi+".");

                }
                System.out.println("Vali uuesti tegevus:");
                System.out.println(
                        "0 - kui soovite portaalist lahkuda" + "\n" +
                                "1 - otsi kinnisvara" + "\n" +
                                "2 - loo endale kaust" + "\n" +
                                "3 - vaata enda kaustasid" + "\n" +
                                "4 - lisa sõber kausta" + "\n" +
                                "5 - eemalda end kaustast" + "\n" );
                tegevus = scan.nextInt();

                }
            }
    }
}

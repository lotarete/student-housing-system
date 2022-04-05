import java.util.Scanner;

public class InputScan {
    Scanner scan = new Scanner(System.in);

    public int IntScan(){
        while(true){
            String sisend = scan.nextLine();
        try{
            if(sisend.equals("Lõpp")){
                return -98765;
            }
            else{
                int number = Integer.parseInt(sisend);
                return number;
            }
        }
        catch(Exception e){
            System.out.println("Palun sisesta korrektne täisarv!");
        }
        continue;

        }
    }

    public Double DoublScan(){
        while(true){
            String sisend = scan.nextLine();
            try{
                if(sisend.equals("Lõpp")){
                    return -98765.0;
                }
                else{
                    Double number = Double.parseDouble(sisend);
                    return number;
                }
            }
            catch(Exception e){
                System.out.println("Palun sisesta korrektne arv!");
            }
            continue;
        }
    }

    public String StringScan(){
        String sisend = scan.nextLine();
        if(sisend.equals("Lõpp")){
            return "-98765";
        }
        else{
            return sisend;
        }
        }




}

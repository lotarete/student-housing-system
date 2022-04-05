public class testscan {
    public static void main(String[] args) {
        while(true){
            InputScan scan = new InputScan();
            int test;
            System.out.println("siseta arv");
            test= scan.IntScan();
            if(test == -98765){
                break;
            }
            int i = test;
            System.out.println(i);



        }

    }
}

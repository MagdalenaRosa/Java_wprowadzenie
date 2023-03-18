public class suma_liczb_calkowitych {
    public static void main(String[] args) {
        int i=1;
        int suma =0;
        do{
            suma+=i;
//            System.out.println(suma);
            i++;
        }while(i<=100);
        System.out.println("Suma koncowa wynosi: "+suma);
    }

    }

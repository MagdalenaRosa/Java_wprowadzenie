import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 1 bok");
       double a = scan.nextDouble();

        System.out.println("Podaj 2 bok");
        double b = scan.nextDouble();

        double pole=a*b;
        double obw=2*a+2*b;
        System.out.println("Pole prostokąta wynosi:"+pole+'\n'+ "obwod wynosi: "+ obw);



    }
}

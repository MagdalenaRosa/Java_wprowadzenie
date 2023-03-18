
import java.util.Random;
import java.util.Arrays;

public class liczby_losowe {
    public static void main(String[] args) {
        Random random= new Random();

        int [] tab= new int[10] ;

        for (int i = 9; i >=0; i--){
            tab[i] =(random.nextInt(41)-20);
            System.out.printf("%d, ",tab[i]);

        }
        Arrays.sort(tab);
        System.out.println();
        int min =tab[0];
        System.out.println("min:"+min);

        int max= tab[tab.length-1];
        System.out.println("max:"+max);

        double srednia= Arrays.stream(tab).sum()/ tab.length;
        int el_min =0;
        int el_max = 0;
        for (int i = 9; i >=0; i--){

            if (tab[i]<= srednia){
                el_min+=1;
            }
            else
                el_max+=1;
        }

        System.out.println("średnia liczb w tablicy wynosi :"+ srednia);
        System.out.println("liczba elementów mniejszych od sredniej:"+ el_min);
        System.out.println("liczba elementów wiekszych od sredniej:"+ el_max);

        for (int i = 0; i < tab.length; i++)
        {
            for (int j = i + 1 ; j < tab.length; j++)
            {
                if(tab[i]==tab[j])
                {
                    int l= 1;
                    int liczba_pow=tab[j];
                    if(tab[i]==liczba_pow){
                        l +=1;
                        System.out.println("Znalazłes powtarzający się element: "+tab[i]+" i liczba powtórzeń wyniosła: "+l);

                    }

                }


        }

        }
    }}

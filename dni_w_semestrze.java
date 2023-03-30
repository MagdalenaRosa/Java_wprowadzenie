import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class dni_w_semestrze {
    public static void main(String[] args) throws ParseException {

           SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ROOT);
           SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
           Date date = new Date();
           Date secondDate = sdf.parse("09/30/2023");

           long diffInMillies = Math.abs(secondDate.getTime() - date.getTime());
           long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

           System.out.println("Liczba dni w semestrze: "+diff);

}}



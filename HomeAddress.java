import java.util.Scanner;

public class HomeAddress {
    public String homeAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("wprowadź nowy adres");
        String newHomeAddres = myObj.nextLine();
        this.homeAddress = newHomeAddres;
    }
}

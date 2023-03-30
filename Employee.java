import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private String homeAddress;
    private String hireDate;


    Employee(String name, int salary, String homeAddress , String hireDate){
        this.name=name;
        this.salary=salary;
        this.homeAddress= String.valueOf(homeAddress);
        this.hireDate=hireDate;
    }
    public void getInfo(){
        System.out.println("imie: "+ name+
               " pensja: "+ salary+
                " adres: "+ homeAddress);

    }
    Employee(String name,String homeAddress , String hireDate){
        this.name=name;
        this.salary=1000;
        this.homeAddress= String.valueOf(homeAddress);
        this.hireDate=hireDate;
    }

    public void setHomeAddress() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("wprowadź nowy adres");
        String newHomeAddres = myObj.nextLine();
        this.homeAddress = newHomeAddres;

    }
    public void raiseSalary(double percent){
        this.salary=salary+salary*percent/100;
    }
}

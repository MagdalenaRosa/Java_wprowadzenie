public class Main{
    public static void main(String[] args) {

        Person p1 = new Person(18);
        p1.yearPasess();
        p1.amIOld();
        p1.yearPasess();
        p1.amIOld();

        System.out.println("-------------------------------------");
        Student s1= new Student("Jan",23,1.8);
        Student s2 =new Student();
        System.out.println("Imie: "+s1.getName()+"\nwiek: "+ s1.getAge()+"\nwzrost w m: "+s1.getHeight());
        System.out.println("Imie: "+s2.getName()+"\nwiek: "+ s2.getAge()+"\nwzrost w m: "+s2.getHeight());
        System.out.println("-------------------------------------");

        Employee e1= new Employee("Jan",1000,"Krakow","23-03-2023");


        Employee tab_pracownikow[]= new Employee[3];
        tab_pracownikow[0]=e1;
        e1.getInfo();
        e1.setHomeAddress();
        e1.getInfo();
        e1.raiseSalary(2.5);
        e1.getInfo();
        System.out.println("-------------------------------------");

        tab_pracownikow[1]=new Employee("Józef",3456,"krk","23-03-23");
        tab_pracownikow[1].getInfo();
        tab_pracownikow[1].raiseSalary(3.4);
        tab_pracownikow[1].getInfo();
        System.out.println("-------------------------------------");

        tab_pracownikow[2]=new Employee("Anna","Waw","23-03-23");
        tab_pracownikow[2].getInfo();
        tab_pracownikow[2].raiseSalary(5);
        tab_pracownikow[2].getInfo();




    }

}

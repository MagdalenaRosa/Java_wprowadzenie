public class Person {
    private int age;

    Person(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public int yearPasess(){
        age=age+1;
        return age;
    }
    public void amIOld(){
        if (getAge()<=19){
            System.out.println("teenager");
        }
        else{
            System.out.println("Adult");
        }

    }



}


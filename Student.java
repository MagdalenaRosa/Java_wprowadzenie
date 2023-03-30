public class Student {
    int age;
    Double height;
    String name;

    public Student(){
        this.age=0;
        this.height = 0.0;
        this.name="USER1";
    }

    public Student(String name, int age,Double height){
        this.age=age;
        this.height=height;
        this.name=name;
    }

    public Double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}

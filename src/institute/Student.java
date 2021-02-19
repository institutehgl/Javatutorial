package institute;

public class Student {
    String name;
    int age;
    String[] subjects;

    Student(){
        System.out.println("in constructor");

        name = null;
        age = -1;
        subjects = null;

    }
    Student( String name,int age,String[] subjects){
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(subjects);
    }


}

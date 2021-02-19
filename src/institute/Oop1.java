package institute;

public class Oop1 {
    public static void main(String[] args){
        //class-name objectvariablename
        //object declaration
        int var=10;
        String[] subjects = {"maths","computers"};

        //student1
        Student student1;//declaration
        student1 = new Student();//initialisation
        student1.print();

        //student2
        Student student2;//declaration
        student2 = new Student("raj",25,subjects);//initialisation
        student2.print1();

    }
}

package institute;

public class Oop {
    //class variables
    String st ;
    String st1 ;

    //constructor
    //default
    Oop(){
        System.out.println("in constructor");
    }
    //paramiterised constructor
    Oop(String str){
        System.out.println("in param constructor");
        this.st = str;
        this.st1 = str;
    }
    void greet(){
        System.out.println(st);

    }
}

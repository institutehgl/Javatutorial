public class Compoundstypes implements Myinterface {

    String s ;

    Compoundstypes(){
        s = "hello world!";
    }
    void greetings(){
        System.out.println(s);
    }

    public static void main(String[] args) {

        //compound variables


        //arrays
        //datatype[] variable-name = {value1,value2};

        //1d array
        int[] array1 ={1,2,3};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        //2d array
        int[][] array2 ={{1,2},{1,2}};
        System.out.println(array2[0][0]);
        System.out.println(array2[0][1]);
        System.out.println(array2[1][0]);
        System.out.println(array2[1][1]);

        //strings
        String st = "hello";
        System.out.println(st);
        //helper functions
        System.out.println(st.toUpperCase());
        System.out.println(st.length());

        //enums
        Level  level = Level.HIGH;
        System.out.println(level);

        Compoundstypes c = new Compoundstypes();
        c.greets();

    }
    public void greets() {
        System.out.println("Myinterface function");
    }
}


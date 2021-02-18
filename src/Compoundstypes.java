public class Compoundstypes implements Myinterface {

    String s;

    Compoundstypes() {
        s = "hello world!";
    }

    void greetings() {
        System.out.println(s);
    }

    public static void main(String[] args) {

        //compound variables


        //arrays
        //datatype[] variable-name = {value1,value2};

        //1d array
        char[] array1 = {'a','b', 'c'};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        //2d array
        int[][] array2 = {{1, 2},
                          {1, 2}};

        System.out.print(array2[0][0]+" ");
        System.out.println(array2[0][1]);
        System.out.print(array2[1][0]+" ");
        System.out.println(array2[1][1]);

        //strings
        String st = "hello ";
        String raj="world";
        String combined= st+raj;
        System.out.println(st);
        //helper functions
        System.out.println(st.charAt(4));
        System.out.println(st.length());
        System.out.println(st.trim());
        System.out.println(combined);


        //enums
        Level level = Level.HIGH;
        System.out.println(level);

        Compoundstypes c = new Compoundstypes();
        c.greets();

    }

    public void greets() {
        System.out.println("Myinterface function");
    }
}


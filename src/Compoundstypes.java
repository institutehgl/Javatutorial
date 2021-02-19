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
        //prints arrays

        System.out.print(array2[0][0]+" ");
        System.out.println(array2[0][1]);
        System.out.print(array2[1][0]+" ");
        System.out.println(array2[1][1]);

        //3d array

        int[][][] array3d =
                {   {   {1,2,3},
                        {1,2,3},
                        {1,2,3}
                        }
                            ,{
                        {1,2,3},
                        {1,2,3},
                        {1,2,3}
                        }
                            ,{
                        {1,2,3},
                        {1,2,3},
                        {1,2,3}
                            }
            };
        System.out.println(array3d[2][2][2]);



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
        Level l = Level.MEDIUM;
        System.out.println(l);
        
        Compoundstypes c = new Compoundstypes();
        c.greets();

    }

    public void greets() {
        System.out.println("Myinterface function");
    }
}



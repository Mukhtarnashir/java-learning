public class array {
    public static void main(String[] args) {

        String[] stringsArray;
        stringsArray = new String[4];

        
        stringsArray[0] = "pondok";
        stringsArray[1] = "pesantren";
        stringsArray[2] = "khas";
        stringsArray[3] = "kempek";

        System.out.println(stringsArray[0]);
        System.out.println(stringsArray[1]);
        System.out.println(stringsArray[2]);
        System.out.println(stringsArray[3]);

        stringsArray[0] = "nashir";

        System.out.println(stringsArray[0]);

        String[] stringsArray2 = new String[4];

        System.out.println(stringsArray2);


        String[] namaNama = {
            "pondok","pesantren", "khas", "kempek"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 
        };  

        System.out.println(arrayInt);
        
        long[] arrayLong = {
            10L, 20L, 30L,
        };

        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        String[][] members = {
           {"mukhtar", "nashir"},
           {"jully", "firmansyyah"},
           {"kamu"}

        };

        

        System.out.println( members[0][1]);
        System.out.println( members[1][0]);

   

    }
    
}

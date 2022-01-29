public class MethodParameter {
    public static void main(String[] args) {
        
        sayHello ("Mukhtar","Nashir");
        sayHello ("Pondok", "Pesantren");
        sayHello ("Khas", "Kempek" );

    }

    static void sayHello (String fristName, String lastName){
        System.out.println("Hello" + fristName + " " + lastName);
    }
    
}

public class MethodOverLoading {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Nashir");
        sayHello("Nashir","Mukhtar");
    }
    
    static void sayHello(){
        System.out.println("hello");
    }

    static void sayHello(String name){
        System.out.println("Hello" + name);

    }

    static void sayHello(String fristName, String lastName){
        System.out.println("Hello" + fristName + " " + lastName);
    }
}

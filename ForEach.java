public class ForEach {
    public static void main(String[] args) {
        
        String[] names = {
            "Mukhtar", "Nashir", "Bin",
            "Rohman", "Bin", "Wayad"
        };

        for (int index = 0; index < names.length; index++) {
            System.out.println(names [index]);


            
        
        }

        System.out.println("FOR EACH");
        for (String name : names){
            System.out.println(name);
        }
    }
    
}

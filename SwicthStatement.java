public class SwicthStatement {
   public static void main(String[] args) {
    
    var nilai = "A";

    switch (nilai){
        case "A":
           System.out.println(" Wow,Anda Lulus Dengan Baik");
           break;
        case "B":
        case "c":
           System.out.println(" Nilai Anda Cukup Baik");
           break;
        case "D":
           System.out.println("Anda Tidak Lulus");
           break;
        default:
         System.out.println(" Anda Salah Jurusan");  
            
        }
      
        switch ("B") {
           case "A"-> System.out.println( "Wow,Anda Lulus Dengan Baik");
           case "B","C" -> System.out.println("Nilai Anda Cukup Baik"); 
           case "D" -> System.out.println( "Anda Tidak Lulus");
           default -> {
            System.out.println (" Anda Salah Jurusan");

           String ucapan;
           switch (nilai) {
               case "A"-> ucapan = "Wow,Anda Lulus Dengan Baik";
               case "B","C" -> ucapan ="Nilai Anda Cukup Baik"; 
               case "D" -> ucapan ="Anda Tidak Lulus";
               default -> {
                ucapan =" Anda Salah Jurusan";
                System.out.println( ucapan);
               }
             }
         }
      }
   }
}
   
        
    
    
       
   

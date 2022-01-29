public class IfStatement {
    public static void main(String[] args) {
        
        var nilai = 95 ;
        var absen = 94 ;

        var lulusNilai = nilai >=75;
        var lulusAbsen = absen >=75;

        var lulus = lulusNilai && lulusAbsen;
        System.out.println(lulus);

        if (nilai >= 75 && absen >=50){
            System.out.println("Selamat Anda Lulus");

        }else {
            System.out.println("Anda Tidak Lulus");

         } if ( nilai >=100 && absen >= 100) {
            System.out.println("Nilai Anda AB");

         }  if ( nilai >= 90 && absen >= 90) {
            System.out.println( "Nilai Anda A ");

         }  if (nilai >= 80 && nilai >= 80) {
            System.out.println("Nilai Anda B");

         } if ( nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda C");

        } else {
            System.out.println("Nilai anda D");


            
        }

    }
    
}

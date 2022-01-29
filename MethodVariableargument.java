public class MethodVariableargument {
    public static void main(String[] args) {

        int [] values = {80, 50,50,80};
        sayCongrats("Nashir", values);

        sayCongrats("Mukhtar", 100, 100, 100,100);
        
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values) {
            total +=value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat "+ name + ", Anda Lulus");
        } else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}


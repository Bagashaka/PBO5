package bagasmuhammadshaka_praktikum5;
import java.util.Scanner;

public class BagasMuhammadShaka_praktikum5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstName = "Bagas";
        String lastName = "Shaka";
        
        System.out.println(firstName);
        System.out.println(lastName);
        
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        
        String fullName2 = "Bagas"+ " " +"Shaka";
        System.out.println(fullName2);
        
        String Upper = fullName.toUpperCase();
        String Lower = fullName.toLowerCase();
        
        System.out.println(Upper);
        System.out.println(Lower);
        
        int Panjang = fullName.length();
        System.out.println(Panjang);
        
        System.out.println(fullName.substring(2,5)); //indeks ke 2 sampai 5
        
        int idx = fullName.indexOf("gas");
        System.out.println(idx);
        
//        int n = input.nextInt();
//        for(int i = 0; i < n; i++){
//         String
//        }
    }
    
}

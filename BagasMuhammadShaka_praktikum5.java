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
        
// package com.mycompany.bagasmuhammadshaka_praktikum5;
// import java.util.Scanner;

// public class BagasMuhammadShaka_praktikum5 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner (System.in);       
//         int n = input.nextInt();

//         String[] arr;
//         arr = new String[n];
               
//         for(int i = 0; i < n; i++){
//         arr[i] = input.next();
//         }
        
//         String kalimat="";
//         for(int i = 0; i < n; i++){
//             kalimat =kalimat+arr[i]+" ";
//         }     
//         System.out.println(kalimat);
//No 2
//        String str = input.nextLine();
//        
//        int x = input.nextInt();
//        int y = input.nextInt();
//        
//        System.out.println(str.substring(x, y));
//No 3
//        String str1 = input.nextLine();
//        String str2 = input.nextLine();
//        
//        if(str1.contains(str2) == true){
//          System.out.println("Ya");
//        }
//        else{
//          System.out.println("Tidak");
//        }
//        
    }
}

    }
    
}

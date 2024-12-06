import java.util.Random;
import java.util.Scanner;
public class soalukl3sdg {

    public static void main (String [] args){
        
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 
        String lanjut; 

        do {
            
            int bilanganPertama = random.nextInt(100); 
            int bilanganKedua = random.nextInt(99) + 1; 

            int operasi = random.nextInt(3); 
            String operator; 
            double jawabanBenar; 

            if (operasi == 0) {
                operator = "*"; 
                jawabanBenar = bilanganPertama * bilanganKedua; 
            } else if (operasi == 1) {
                operator = "/"; 
                jawabanBenar = (double) bilanganPertama / bilanganKedua; 
            } else {
                operator = "%"; 
                jawabanBenar = bilanganPertama % bilanganKedua; 
            }

            
            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ");
            double jawabanUser  = scanner.nextDouble(); 

           
            if (jawabanUser  == jawabanBenar) {
                System.out.println("Selamat! Jawaban Anda benar!"); 
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar); 
            }

            
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            lanjut = scanner.next(); 
        } while (lanjut.equalsIgnoreCase("ya")); 

        System.out.println("Terima kasih telah mengikuti kuis!"); 
        scanner.close(); 
    }
}
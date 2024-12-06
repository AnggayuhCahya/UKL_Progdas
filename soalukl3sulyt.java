import java.util.Scanner;
public class soalukl3sulyt {

    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int c = input.nextInt();
        
        int[] arr = new int[c];
        
        for(int i = 0; i < c; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        boolean[] sudahDihitung = new boolean[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(sudahDihitung[i])
                continue;
                
            int frekuensi = 1;
            
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    frekuensi++;
                    sudahDihitung[j] = true;
                }
            }
            
            System.out.println(arr[i] + " muncul " + frekuensi + " kali");
        }
        
        input.close();
    }
}

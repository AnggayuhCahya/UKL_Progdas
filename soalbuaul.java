public class soalbuaul {

    public static void tampilkanArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        int[] angka = {10, 20, 30, 40, 50};

        
        System.out.println("Isi array adalah:");
        tampilkanArray(angka);  
    }
}

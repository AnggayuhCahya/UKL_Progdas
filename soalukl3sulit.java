import java.util.HashMap;
import java.util.Map;

public class soalukl3sulit {
    public static void main (String [] args){

        int[] array = {1, 2, 2, 34, 1, 34, 34, 2};
                                            
        Map<Integer, Integer> frekuensiMap = new HashMap<>(); // menyimpan pasagan ke key value
        for (int elemen : array) {

            // memasukkan elemen sebagai kunci
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1); // untuk mengecek elemen
        }

        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) { // mengembalikan semua pasangan ke frekuensiMap
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali"); //untuk  mengambil elemen & 
        }
    }
}
// key elemen dari array
// value frekuensi kemunculan elemen

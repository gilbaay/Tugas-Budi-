// Nama file: array2.java

public class array2 {
    public static void main(String args[]) {
        // Mendeklarasikan array dengan nilai langsung
        int a[] = {10, 20, 30, 40, 50};

        System.out.println("Index\tNilai");

        // Menampilkan index dan nilai array
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "\t" + a[i]);
        }
    }
}
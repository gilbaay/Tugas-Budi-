// Nama file: append1.java

public class append1 {
    public static void main(String args[]) {
        StringBuffer c;
        c = new StringBuffer("Belajar Java");

        String b = "Programming";

        System.out.println("c: " + c);
        System.out.println("b: " + b);
        System.out.println("Setelah dikenai perintah append(b), c menjadi:");
        System.out.println(c.append(b));
    }
}
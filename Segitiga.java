class Segitiga {
    int panjang, lebar;

    Segitiga() {
        panjang = 5;
        lebar = 3;
    }

    void setPanjang(int x) {
        panjang = x;
    }

    void setLebar(int y) {
        lebar = y;
    }

    double Luas() {
        // Fix: Use 0.5 for double division, or cast to double
        return (double) panjang * lebar * 0.5;
    }
}

class Prisma extends Segitiga {
    int tinggi;

    void setTinggi(int z) {
        tinggi = z;
    }

    double Volume() {
        // Fix: Ensure Luas() returns a double and then multiply
        return Luas() * tinggi; // Volume of a prism is Base Area * height, not Base Area * height * 1/3
    }
}

class PanggilTurunan {
    public static void main(String[] args) {
        Segitiga obj1 = new Segitiga();
        System.out.println("Luas Segitiga I = " + obj1.Luas()); // Should be 5 * 3 * 0.5 = 7.5

        obj1.setPanjang(10);
        obj1.setLebar(5);
        System.out.println("Luas Segitiga II = " + obj1.Luas()); // Should be 10 * 5 * 0.5 = 25.0

        Prisma obj2 = new Prisma();
        obj2.setPanjang(7);
        obj2.setLebar(4);
        obj2.setTinggi(5);
        System.out.println("Volume Prisma = " + obj2.Volume()); // Should be (7 * 4 * 0.5) * 5 = 14 * 5 = 70.0
    }
}
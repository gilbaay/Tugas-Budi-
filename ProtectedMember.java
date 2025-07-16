class Segitiga {
    protected int panjang, lebar;

    void setPanjang(int x) {
        panjang = x;
    }

    void setLebar(int y) {
        lebar = y;
    }

    double Luas() {
        return (panjang * lebar * 1/2);
    }
}

class Prisma extends Segitiga {
    int tinggi;

    void setNilai(int x, int y, int z) {
        super.panjang = x;
        super.lebar = y;
        tinggi = z;
    }

    double Volume() {
        return (Luas()) * tinggi * 1/3;
    }
}
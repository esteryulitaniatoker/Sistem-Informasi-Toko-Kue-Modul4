package Entity;

public class Ester07131_DaftarkueEntity {
    private Ester07131_PembeliEntity pembeli;
    private int indexKue;

    public Ester07131_DaftarkueEntity(Ester07131_PembeliEntity pembeli, int indexKue) {
        this.pembeli = pembeli;
        this.indexKue = indexKue;
    }

    public Ester07131_PembeliEntity getPembeli() {
        return pembeli;
    }

    public void setPembeli(Ester07131_PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }

    public int getIndexKue() {
        return indexKue;
    }

    public void setIndexKue(int indexKue) {
        this.indexKue = indexKue;
    }
}
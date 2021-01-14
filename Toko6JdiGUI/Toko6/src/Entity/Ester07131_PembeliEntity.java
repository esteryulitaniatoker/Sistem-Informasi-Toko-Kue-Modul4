package Entity;

public class Ester07131_PembeliEntity extends Ester07131_TokokueAbstractEntity {
    private String alamat;

    public Ester07131_PembeliEntity(String notelp, String password, String nama, String alamat) {
        super(notelp, password, nama);
        this.alamat = alamat;
    }

    @Override
    public String getNotelp() {
        return notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
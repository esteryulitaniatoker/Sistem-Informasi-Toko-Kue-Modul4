package Entity;

public class Ester07131_PegawaiEntity extends Ester07131_TokokueAbstractEntity {
    private String jabatan;

    public Ester07131_PegawaiEntity(String jabatan, String notelp, String nama, String password) {
        super(notelp, nama, password);
        this.jabatan = jabatan;
    }

    @Override
    public String getNotelp() {
        return notelp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}
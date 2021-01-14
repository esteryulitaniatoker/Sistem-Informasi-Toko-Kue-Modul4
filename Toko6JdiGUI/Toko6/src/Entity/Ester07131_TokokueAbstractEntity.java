package Entity;

public abstract class Ester07131_TokokueAbstractEntity {
    protected String notelp,nama;
    public String password;

    public Ester07131_TokokueAbstractEntity(String notelp, String nama, String password) {
        this.notelp = notelp;
        this.nama = nama;
        this.password = password;
    }

    public Ester07131_TokokueAbstractEntity() {
    }

    public abstract String getNotelp();
    
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
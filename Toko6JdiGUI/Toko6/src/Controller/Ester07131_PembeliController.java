package Controller;

import Entity.Ester07131_DaftarkueEntity;
import Entity.Ester07131_KueEntity;
import Entity.Ester07131_PembeliEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ester07131_PembeliController implements Ester07131_ControllerInterfaces {
    int indexLogin = 0;
    public Ester07131_PembeliController() {
    }
    public Ester07131_PembeliEntity getData() {
        return Ester07131_AllObjectModel.pembeliModel.showDtPembeli(indexLogin);
    }
    public void dftarPembeli(int indexKue,Ester07131_PembeliEntity pembeli) {
        Ester07131_AllObjectModel.daftarkueModel.insertDtDftrKue(new Ester07131_DaftarkueEntity(pembeli,indexKue));
    }
    public void remove(int index) {
        Ester07131_AllObjectModel.daftarkueModel.remove(index);
    }
    public int size() {
        return Ester07131_AllObjectModel.daftarkueModel.size();
    }
    
    @Override
    public void login(String notelp, String password) {
        indexLogin = Ester07131_AllObjectModel.pembeliModel.cekData(notelp, password);
    }
    public void insert(String notelp,String password,String nama,String alamat) {
        Ester07131_AllObjectModel.pembeliModel.insert(new Ester07131_PembeliEntity(notelp,nama,password,alamat));
    }
    public Ester07131_PembeliEntity pembeliEntity() {
        return Ester07131_AllObjectModel.pembeliModel.showDtPembeli(indexLogin);
    }
    public Ester07131_DaftarkueEntity showDftrkue(int index) {
        return Ester07131_AllObjectModel.daftarkueModel.showDaftarkue(index);
    }
    public int cekPembeli(String notelp,String password) {
        int cek = Ester07131_AllObjectModel.pembeliModel.cekData(notelp, password);
        return cek;
    }
}
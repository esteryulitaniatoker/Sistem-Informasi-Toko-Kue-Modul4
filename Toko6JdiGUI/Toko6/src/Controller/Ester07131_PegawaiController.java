
package Controller;

import Entity.Ester07131_PegawaiEntity;
import java.util.ArrayList;

public class Ester07131_PegawaiController implements Ester07131_ControllerInterfaces {
    int indexLogin = 0;
    int cek;
    public Ester07131_PegawaiController() {
    }
    public int cekData(String notelp,String password) {
        cek = Ester07131_AllObjectModel.pegawaiModel.cekData(notelp, password);
        return cek;
    }
    public void viewPegawai() {
        Ester07131_AllObjectModel.pegawaiModel.showDtPtgs(indexLogin);
    }

    @Override
    public void login(String notelp, String password) {
        indexLogin = Ester07131_AllObjectModel.pegawaiModel.cekData(notelp, password);
    }
    public Ester07131_PegawaiEntity pegawaiEntity(int indexLogin) {
        return Ester07131_AllObjectModel.pegawaiModel.showDtPtgs(indexLogin);
    }
    public ArrayList <Ester07131_PegawaiEntity> pegawaiEntity() {
        return Ester07131_AllObjectModel.pegawaiModel.pegawaiEntity();
    }
}
package Model;

import Entity.Ester07131_PegawaiEntity;
import java.util.ArrayList;

public class Ester07131_PegawaiModel implements Ester07131_ModelInterfaces {
    private ArrayList <Ester07131_PegawaiEntity> pegawaiEntityArrayList;
    public Ester07131_PegawaiEntity showDtPtgs(int index) {
        return pegawaiEntityArrayList.get(index);
    }
    public ArrayList <Ester07131_PegawaiEntity> pegawaiEntity() {
        return pegawaiEntityArrayList;
    }
    public Ester07131_PegawaiModel() {
        pegawaiEntityArrayList = new ArrayList <Ester07131_PegawaiEntity>();
    }
    public void insertPegawai(Ester07131_PegawaiEntity pegawai) {
        pegawaiEntityArrayList.add(pegawai);
    }

    @Override
    public int cekData(String notelp, String password) {
        int loop = -1;
        for(int i=0;i<pegawaiEntity().size();i++) {
            if(notelp.equals(pegawaiEntity().get(i).getNotelp())&&password.equals(pegawaiEntity().get(i).getPassword())) {
                loop = i;
            }
        }return loop;
    }
}
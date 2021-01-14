package Model;

import Entity.Ester07131_DaftarkueEntity;
import java.util.ArrayList;

public class Ester07131_DaftarkueModel implements Ester07131_ModelInterfaces {
    private ArrayList <Ester07131_DaftarkueEntity> daftarkueEntityArrayList;
    public Ester07131_DaftarkueModel() {
        daftarkueEntityArrayList = new ArrayList <Ester07131_DaftarkueEntity>();
    }
    public void insertDtDftrKue(Ester07131_DaftarkueEntity daftarkue) {
        daftarkueEntityArrayList.add(daftarkue);
    }
    public ArrayList <Ester07131_DaftarkueEntity> getDaftarkueArrayList() {
        return daftarkueEntityArrayList;
    }
    public void remove(int index) {
        daftarkueEntityArrayList.remove(index);
    }
    public int size() {
        return daftarkueEntityArrayList.size();
    }
    public ArrayList <Ester07131_DaftarkueEntity> DaftarkueEntity() {
        return daftarkueEntityArrayList;
    }

    @Override
    public int cekData(String notelp, String password) {
        int loop = 0;
        if(daftarkueEntityArrayList.size()==0) {
            loop = -1;
        }else {
            for(int i=0;i<daftarkueEntityArrayList.size();i++) {
                if(showDaftarkue(i).getPembeli().getNotelp().equals(notelp)) {
                    loop = i;
                    break;
                }else {
                    loop = -2;
                }
            }
        }return loop;
    }
    public Ester07131_DaftarkueEntity showDaftarkue(int index) {
        return daftarkueEntityArrayList.get(index);
    }
}
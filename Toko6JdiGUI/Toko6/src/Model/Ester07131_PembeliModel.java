package Model;

import Entity.Ester07131_PembeliEntity;
import java.util.ArrayList;

public class Ester07131_PembeliModel implements Ester07131_ModelInterfaces {
    private ArrayList <Ester07131_PembeliEntity> pembeliEntityArrayList;
    public Ester07131_PembeliModel() {
        pembeliEntityArrayList = new ArrayList <Ester07131_PembeliEntity>();
    }
    public void insert(Ester07131_PembeliEntity pembeliEntity) {
        pembeliEntityArrayList.add(pembeliEntity);
    }
    public int size() {
        return pembeliEntityArrayList.size();
    }
    public void remove(int index) {
        pembeliEntityArrayList.remove(index);
    }
    public ArrayList <Ester07131_PembeliEntity> pembeliEntity() {
        return pembeliEntityArrayList;
    }

    @Override
    public int cekData(String notelp, String password) {
        int loop = 0;
        while(!pembeliEntityArrayList.get(loop).getNotelp().equals(notelp)&&!pembeliEntityArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }
    public Ester07131_PembeliEntity showDtPembeli(int index) {
        return pembeliEntityArrayList.get(index);
    }
}
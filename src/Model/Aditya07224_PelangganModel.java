package Model;

import Entity.Aditya07224_pelangganEntity;
import java.util.ArrayList;
public class Aditya07224_PelangganModel implements Aditya07224_ModelInterfaces{
    private static ArrayList<Aditya07224_pelangganEntity> pelangganArraylist;

    public Aditya07224_PelangganModel() {
        pelangganArraylist = new ArrayList<Aditya07224_pelangganEntity>();
    }
    public Aditya07224_pelangganEntity getPelangganArraylist(int index) {
        return pelangganArraylist.get(index);
    }
    public ArrayList<Aditya07224_pelangganEntity> getPelangganArraylist() {
        return pelangganArraylist;
    }
    public void InsertData(Aditya07224_pelangganEntity pelangganEntity){
        pelangganArraylist.add(pelangganEntity);
    }
    public void HapusData(int index){
            pelangganArraylist.remove(index);
    }

    @Override
    public int cekData(String kode, String pass) {
        int index = -1;
        for(int i=0; i<pelangganArraylist.size();i++){
            if(kode.equals(getPelangganArraylist(i).getId())){
                index = i;
            }
        }return index;
    }
}
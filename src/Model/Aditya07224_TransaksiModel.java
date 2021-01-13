package Model;

import Entity.Aditya07224_TransaksiEntity;

import java.util.ArrayList;

public class Aditya07224_TransaksiModel implements Aditya07224_ModelInterfaces {
    private ArrayList <Aditya07224_TransaksiEntity> transaksiEntityArrayList;

    public Aditya07224_TransaksiModel(){
        transaksiEntityArrayList = new ArrayList<>();
    }

    public void InsertDataTransaksi(Aditya07224_TransaksiEntity transaksiEntity){
        transaksiEntityArrayList.add(transaksiEntity);
    }
    public Aditya07224_TransaksiEntity getTransaksiEntityArrayList(int index){
        return transaksiEntityArrayList.get(index);
    }
    public ArrayList<Aditya07224_TransaksiEntity> getTransaksiEntityArrayList(){
        return transaksiEntityArrayList;
    }

    @Override
    public int cekData(String kode, String pass) {
        int index = -1;
        for(int i=0; i<getTransaksiEntityArrayList().size();i++){
            if(kode.equals(getTransaksiEntityArrayList(i).getIdtrx())){
                index = i;
            }
        }return index;
    }

    public void updateIsverified(int index, Aditya07224_TransaksiEntity transaksiEntity){
        transaksiEntityArrayList.set(index, transaksiEntity);
    }
}
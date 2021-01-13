package Model;

import Entity.Aditya07224_PegawaiEntity;

import java.util.ArrayList;
public class Aditya07224_PegawaiModel implements Aditya07224_ModelInterfaces{
    private static ArrayList <Aditya07224_PegawaiEntity> pegawaiArraylist;

    public Aditya07224_PegawaiModel() {
        pegawaiArraylist = new ArrayList<Aditya07224_PegawaiEntity>();
    }
    public Aditya07224_PegawaiEntity getPegawaiArraylist(int index) {
        return pegawaiArraylist.get(index);
    }
    public ArrayList <Aditya07224_PegawaiEntity> getPegawaiArraylist() {
        return pegawaiArraylist;
    }
    public void InsertData(Aditya07224_PegawaiEntity pegawaiEntity){
        pegawaiArraylist.add(pegawaiEntity);
    }
    public void HapusData(int index){
        pegawaiArraylist.remove(index);
    }

    @Override
    public int cekData(String kode, String pass) {
        int cekpegawai = -1;
        for(int i=0; i<pegawaiArraylist.size();i++){
            if(kode.equals(pegawaiArraylist.get(i).getId()) && pass.equals(pegawaiArraylist.get(i).getPassword())){
                cekpegawai = i;
            }
        }return cekpegawai;
    }

    public int cekData(String id){
        int cek = -1;
        for(int i=0; i<pegawaiArraylist.size();i++){
            if(id.equals(pegawaiArraylist.get(i).getId())){
                cek = i;
            }
        }return cek;
    }
}
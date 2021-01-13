package Model;

import java.util.ArrayList;

import Entity.Aditya07224_SepedaMotorEntity;

public class Aditya07224_SepedaMotorModel implements Aditya07224_ModelInterfaces{
    private static ArrayList <Aditya07224_SepedaMotorEntity> sepedaMotorEntityArrayList;
    
    public Aditya07224_SepedaMotorModel(){
        sepedaMotorEntityArrayList = new ArrayList<Aditya07224_SepedaMotorEntity>();
    }
    public Aditya07224_SepedaMotorEntity getsepedaArraylist(int index){
        return sepedaMotorEntityArrayList.get(index);
    }
    public static ArrayList<Aditya07224_SepedaMotorEntity> getsepedaArraylist() {
        return sepedaMotorEntityArrayList;
    }
    public void InsertData(Aditya07224_SepedaMotorEntity sepedaMotorEntity){
        sepedaMotorEntityArrayList.add(sepedaMotorEntity);
    }
    public void DeleteData(int index){
            sepedaMotorEntityArrayList.remove(index);
    }
    public void RubahWarna(int index, String data){
        sepedaMotorEntityArrayList.get(index).setWarna(data);
    }
    public void RubahTahun(int index, String data){
        sepedaMotorEntityArrayList.get(index).setTahun(data);
    }
    public int cekData(String kode, String pass) {
        int index = -1;
        for(int i=0; i<sepedaMotorEntityArrayList.size();i++){
            if(kode.equals(getsepedaArraylist(i).getKode())){
                index = i;
            }
        }return index;
    }
}
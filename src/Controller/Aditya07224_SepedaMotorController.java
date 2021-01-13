package Controller;

import Entity.Aditya07224_MerkSepedaEntity;
import Entity.Aditya07224_SepedaMotorEntity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Aditya07224_SepedaMotorController {
    int index;
    public Aditya07224_SepedaMotorController(){
    }

    public Aditya07224_SepedaMotorEntity GetData(int index){
        return Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist(index);
    }
    public ArrayList<Aditya07224_SepedaMotorEntity> GetallSepeda(){
        return Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist();
    }
    public void InsertSepeda(String kode,int merk, String varian, String warna, String tahun){
        Aditya07224_SepedaMotorEntity sepedaMotorEntity = new Aditya07224_SepedaMotorEntity();
        sepedaMotorEntity.setKode(kode);
        sepedaMotorEntity.setMerk(merk);
        sepedaMotorEntity.setVarian(varian);
        sepedaMotorEntity.setWarna(warna);
        sepedaMotorEntity.setTahun(tahun);
        Aditya07224_AllObjectModel.sepedaMotorModel.InsertData(sepedaMotorEntity);
    }
    public int CekData(String id,String pass){
        index = Aditya07224_AllObjectModel.sepedaMotorModel.cekData(id, null);
        return index;
    }
    public void UpdateDataSepeda(int urut, int index,String Data){
        switch (urut){
            case 0:
                Aditya07224_AllObjectModel.sepedaMotorModel.RubahWarna(index,Data);
                break;
            case 1:
                Aditya07224_AllObjectModel.sepedaMotorModel.RubahTahun(index,Data);
                break;
            case 2:
                DeleteSepeda(index);
        }
    }
    public void DeleteSepeda(int index){
        Aditya07224_AllObjectModel.sepedaMotorModel.DeleteData(index);
    }

    public DefaultTableModel daftarstok(){
        DefaultTableModel datastoksepedamotor = new DefaultTableModel();
        Object[] kolom = {"KODE","MERK","VARIAN","WARNA","TAHUN"};
        datastoksepedamotor.setColumnIdentifiers(kolom);
            int size = Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().size();
            for (int i = 0; i<size;i++){
                Object[] data = new Object[5];
                data[0] = Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().get(i).getKode();
                data[1] = Aditya07224_MerkSepedaEntity.merk[Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().get(i).getMerk()];
                data[2] = Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().get(i).getVarian();
                data[3] = Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().get(i).getWarna();
                data[4] = Aditya07224_AllObjectModel.sepedaMotorModel.getsepedaArraylist().get(i).getTahun();
                datastoksepedamotor.addRow(data);
            }
        return datastoksepedamotor;
    }
}

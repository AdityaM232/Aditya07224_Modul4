package Controller;

import Entity.Aditya07224_MerkSepedaEntity;
import Entity.Aditya07224_SepedaMotorEntity;
import Entity.Aditya07224_TransaksiEntity;
import Entity.Aditya07224_pelangganEntity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Aditya07224_TransaksiController {
    int index;
    public Aditya07224_TransaksiController(){
    }
    public Aditya07224_TransaksiEntity getData(int index){
        return Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(index);
    }
    public ArrayList<Aditya07224_TransaksiEntity> GetAllTransaksi(){
        return Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList();
    }
    public void InsertTransaksi(String idtrx, Aditya07224_SepedaMotorEntity sepedaMotor, Aditya07224_pelangganEntity pelanggan, boolean verified){
        Aditya07224_AllObjectModel.transaksiModel.InsertDataTransaksi(new Aditya07224_TransaksiEntity(idtrx,sepedaMotor,pelanggan,verified));
    }
    public int CekData(String kode, String pass){
        index = Aditya07224_AllObjectModel.transaksiModel.cekData(kode, pass);
        return index;
    }

    public void updateIsverified(int index, Aditya07224_TransaksiEntity transaksiEntity){
        Aditya07224_AllObjectModel.transaksiModel.updateIsverified(index,transaksiEntity);
    }
    public DefaultTableModel daftartransaksi(){
        DefaultTableModel datadaftartransaksi = new DefaultTableModel();
        Object[] kolom = {"TRX","ID","NAMA","PEMBELIAN","MERK","VARIAN","WARNA","TAHUN","STATUS"};
        datadaftartransaksi.setColumnIdentifiers(kolom);
        int size = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList().size();
        String verif = null;
        for (int i = 0; i<size;i++){
            if(!Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList().get(i).isVerified()){
                verif = "NO";
            }else {
                verif = "YES";
            }
            Object[] data = new Object[9];
            data[0] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getIdtrx();
            data[1] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getPelanggan().getId();
            data[2] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getPelanggan().getNama();
            data[3] = java.time.LocalDate.now();
            data[4] = Aditya07224_MerkSepedaEntity.merk[Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).
                    getSepedaMotor().getMerk()];
            data[5] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getSepedaMotor().getVarian();
            data[6] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getSepedaMotor().getWarna();
            data[7] = Aditya07224_AllObjectModel.transaksiModel.getTransaksiEntityArrayList(i).getSepedaMotor().getTahun();
            data[8] = verif;
            datadaftartransaksi.addRow(data);
        }
        return datadaftartransaksi;
    }
}

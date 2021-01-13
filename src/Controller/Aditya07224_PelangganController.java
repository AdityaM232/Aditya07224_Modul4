package Controller;

import Entity.Aditya07224_pelangganEntity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Aditya07224_PelangganController {
    int indexLogin=0;

    public Aditya07224_PelangganController() {
    }
    public Aditya07224_pelangganEntity GetData(int cek){
        return Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist(cek);
    }
    public Aditya07224_pelangganEntity GetData(){
        return Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist(indexLogin);
    }
    public ArrayList<Aditya07224_pelangganEntity> GetAllPelanggan(){
        return Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist();
    }
    public void DeletePelanggan(int indexLogin){
        Aditya07224_AllObjectModel.pelangganModel.HapusData(indexLogin);
    }
    public void InsertPelanggan(String id,String nama,String pass,String notelp,String alamat,String noktp, String jeniskelamin){
        Aditya07224_pelangganEntity pelangganEntity = new Aditya07224_pelangganEntity();
        pelangganEntity.setId(id);
        pelangganEntity.setNama(nama);
        pelangganEntity.setPassword(pass);
        pelangganEntity.setNo_telp(notelp);
        pelangganEntity.setAlamat(alamat);
        pelangganEntity.setNoktp(noktp);
        pelangganEntity.setJenisKelamin(jeniskelamin);
        Aditya07224_AllObjectModel.pelangganModel.InsertData(pelangganEntity);
    }
    public void Login(String id, String pass){
        indexLogin = Aditya07224_AllObjectModel.pelangganModel.cekData(id,null);
    }
    public int CekData(String id,String pass){
        indexLogin = Aditya07224_AllObjectModel.pelangganModel.cekData(id,null);
        return indexLogin;
    }
    public DefaultTableModel daftarpelanggan(){
        DefaultTableModel datadaftarpelanggan = new DefaultTableModel();
        Object[] kolom = {"ID","NAMA","NO TELP","ALAMAT","NO KTP","JENIS KELAMIN"};
        datadaftarpelanggan.setColumnIdentifiers(kolom);
        int size = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().size();
        for (int i = 0; i<size;i++){
            Object[] data = new Object[6];
            data[0] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getId();
            data[1] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getNama();
            data[2] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getNo_telp();
            data[3] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getAlamat();
            data[4] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getNoktp();
            data[5] = Aditya07224_AllObjectModel.pelangganModel.getPelangganArraylist().get(i).getJenisKelamin();
            datadaftarpelanggan.addRow(data);
        }
        return datadaftarpelanggan;
    }
}

package Controller;

import Entity.Aditya07224_PegawaiEntity;
import Gui.AllObjCtrl;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Aditya07224_PegawaiController {
    int indexLogin;
    int cek;

    public Aditya07224_PegawaiController() {
    }
    public Aditya07224_PegawaiEntity getData(int cek){
        return Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist(cek);
    }
    public ArrayList<Aditya07224_PegawaiEntity> GetAllPegawai(){
        return Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist();
    }
    public void DeletePegawai(int cek){
        Aditya07224_AllObjectModel.pegawaiModel.HapusData(cek);
    }
    public void InsertPegawai(String id,String nama,String pass,String notelp,String alamat,String noktp, String jeniskelamin){
        Aditya07224_PegawaiEntity pegawaiEntity = new Aditya07224_PegawaiEntity();
        pegawaiEntity.setId(id);
        pegawaiEntity.setNama(nama);
        pegawaiEntity.setPassword(pass);
        pegawaiEntity.setNo_telp(notelp);
        pegawaiEntity.setAlamat(alamat);
        pegawaiEntity.setNoktp(noktp);
        pegawaiEntity.setJenisKelamin(jeniskelamin);
        Aditya07224_AllObjectModel.pegawaiModel.InsertData(pegawaiEntity);
    }
    public void Login(String id, String pass){
        indexLogin = Aditya07224_AllObjectModel.pegawaiModel.cekData(id,pass);
    }
    public int CekData(String id){
        cek = Aditya07224_AllObjectModel.pegawaiModel.cekData(id);
        return cek;
    }
    public int CekData(String id,String pass){
        cek = Aditya07224_AllObjectModel.pegawaiModel.cekData(id,pass);
        return cek;
    }
    public DefaultTableModel daftarkaryawan(){
        DefaultTableModel datadaftarkaryawan = new DefaultTableModel();
        Object[] kolom = {"ID","NAMA","PASSWORD","NO TELP","ALAMAT","NO KTP","JENIS KELAMIN"};
        datadaftarkaryawan.setColumnIdentifiers(kolom);
            int size = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().size();
            for (int i = 0; i<size;i++){
                Object[] data = new Object[7];
                data[0] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getId();
                data[1] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getNama();
                data[2] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getPassword();
                data[3] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getNo_telp();
                data[4] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getAlamat();
                data[5] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getNoktp();
                data[6] = Aditya07224_AllObjectModel.pegawaiModel.getPegawaiArraylist().get(i).getJenisKelamin();
                datadaftarkaryawan.addRow(data);
            }
        return datadaftarkaryawan;

    }
}

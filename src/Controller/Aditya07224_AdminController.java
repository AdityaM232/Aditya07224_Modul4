package Controller;

import Entity.Aditya07224_AdminEntity;

import java.util.ArrayList;

public class Aditya07224_AdminController{
    int indexLogin=0;

    public Aditya07224_AdminController() {
    }
    public Aditya07224_AdminEntity getData(int cek){
        return Aditya07224_AllObjectModel.adminModel.getAdminArrayList(cek);
    }
    public ArrayList<Aditya07224_AdminEntity> GetAllAdmin(){
        return Aditya07224_AllObjectModel.adminModel.getAdminArrayList();
    }
    public void InsertAdmin(String id,String nama,String pass,String notelp,String alamat,String noktp, String jeniskelamin){
        Aditya07224_AdminEntity adminEntity = new Aditya07224_AdminEntity();
        adminEntity.setId(id);
        adminEntity.setNama(nama);
        adminEntity.setPassword(pass);
        adminEntity.setNo_telp(notelp);
        adminEntity.setAlamat(alamat);
        adminEntity.setNoktp(noktp);
        adminEntity.setJenisKelamin(jeniskelamin);
        Aditya07224_AllObjectModel.adminModel.InsertData(adminEntity);
    }

    public void Login(String npm, String pass){
        indexLogin = Aditya07224_AllObjectModel.adminModel.cekData(npm,pass);
    }
    public int cekadmin(String nip, String pass){
        int cek = Aditya07224_AllObjectModel.adminModel.cekData(nip,pass);
        return cek;
    }
}

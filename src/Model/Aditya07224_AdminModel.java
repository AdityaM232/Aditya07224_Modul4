package Model;

import Entity.Aditya07224_AdminEntity;

import java.util.ArrayList;
public class Aditya07224_AdminModel implements Aditya07224_ModelInterfaces{
    private ArrayList <Aditya07224_AdminEntity> adminArrayList;

    public Aditya07224_AdminModel() {
        adminArrayList = new ArrayList<Aditya07224_AdminEntity>();
    }

    public Aditya07224_AdminEntity getAdminArrayList(int index) {
        return adminArrayList.get(index);
    }
    public ArrayList<Aditya07224_AdminEntity> getAdminArrayList() {
        return adminArrayList;
    }
    
    public void InsertData(Aditya07224_AdminEntity admin){
        adminArrayList.add(admin);
    }

    @Override
    public int cekData(String kode, String pass){
        int loop = 0;
        if(adminArrayList.size()==0){
            loop = -1;
        }else{
            for(int i=0; i<adminArrayList.size();i++){
                if(kode.equals(getAdminArrayList(i).getId()) && pass.equals(getAdminArrayList(i).getPassword())){
                    loop = i;
                }else{
                    loop = -2;
                }
            }
        }return loop;
    }
}
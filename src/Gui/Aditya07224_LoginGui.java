package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aditya07224_LoginGui extends Aditya07224_ComponentGui {
    int cekAdmin;
    int cekPegawai;
    int cekPelanggan;
    JLabel labelloginas = new JLabel("LOGIN as");
    Object[] pilihan ={"ADMIN","PEGAWAI","PELANGGAN"};
    JComboBox pilih = new JComboBox(pilihan);
    public Aditya07224_LoginGui() {
        initComponent();
    }

    public void initComponent() {
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setLocationRelativeTo(null);
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0x27ae60));

        labellogin.setBounds(75,10, 450, 50);
        labellogin.setFont(new Font("Times new roman",Font.BOLD,24));

        labelid.setBounds(10, 60, 200, 30);
        fieldid.setBounds(10, 90, 200, 30);

        labelpassword.setBounds(10, 120, 200, 30);
        fieldpassword.setBounds(10, 150, 200, 30);

        labelloginas.setBounds(310, 80, 200, 30);
        pilih.setBounds(250,120,200,30);

        Login.setBounds(250,160,200,30);
        Login.setBackground(new Color(41, 128, 185));
        Login.setFocusPainted(false);
        Login.setForeground(Color.white);
        Login.setBorder(null);

        AdminReg.setBounds(10,190,200,30);
        AdminReg.setBackground(new Color(142, 68, 173));
        AdminReg.setFocusPainted(false);
        AdminReg.setForeground(Color.white);
        AdminReg.setBorder(null);

        add(labellogin);
        add(labelid);
        add(fieldid);
        add(labelpassword);
        add(fieldpassword);
        add(pilih);
        add(Login);
        add(labelloginas);
        add(AdminReg);

        AdminReg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                AdminReg.setBackground(new Color(0x9b59b6));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                AdminReg.setBackground(new Color(0x8e44ad));
            }
        });

        Login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Login.setBackground(new Color(0x3498db));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Login.setBackground(new Color(0x2980b9));
            }
        });
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pilih.getSelectedIndex()==0){
                    try{
                        AllObjCtrl.admin.Login(fieldid.getText(),fieldpassword.getText());
                        cekAdmin = AllObjCtrl.admin.cekadmin(fieldid.getText(),fieldpassword.getText());
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+AllObjCtrl.admin.getData(cekAdmin).getNama());
                        Aditya07224_AdminMenuGui adminMenuGui = new Aditya07224_AdminMenuGui();
                        dispose();
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"GAGAL LOGIN");
                        kosong();
                    }
                }
                else if(pilih.getSelectedIndex()==1){
                    try{
                        AllObjCtrl.pegawai.Login(fieldid.getText(),fieldpassword.getText());
                        cekPegawai = AllObjCtrl.pegawai.CekData(fieldid.getText(),fieldpassword.getText());
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+AllObjCtrl.pegawai.getData(cekPegawai).getNama());
                        Aditya07224_PegawaiMenuGui pegawaiMenuGui = new Aditya07224_PegawaiMenuGui();
                        dispose();
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"GAGAL LOGIN");
                        kosong();
                    }
                }
                else{
                    try{
                        AllObjCtrl.pelanggan.Login(fieldid.getText(),null);
                        cekPelanggan = AllObjCtrl.pelanggan.CekData(fieldid.getText(),null);
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+AllObjCtrl.pelanggan.
                                GetData(cekPelanggan).getNama());
                        Aditya07224_PelangganGui pelangganGui = new Aditya07224_PelangganGui();
                        dispose();
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"GAGAL LOGIN");
                        kosong();
                    }
                }
            }
        });
        AdminReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aditya07224_RegisterAdminGui registerAdmin = new Aditya07224_RegisterAdminGui();
            }
        });
     }
}

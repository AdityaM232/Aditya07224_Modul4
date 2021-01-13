package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Entity.Aditya07224_MerkSepedaEntity;
public class Aditya07224_StokSepedaGui extends Aditya07224_ComponentGui{
    Object[] rubah={"WARNA","TAHUN","HAPUS"};
    JButton ubah = new JButton("UBAH");
    JButton tambah = new JButton("TAMBAH STOK");
    JComboBox comboBoxmerk = new JComboBox(Aditya07224_MerkSepedaEntity.merk);
    JComboBox comboBoxrubah = new JComboBox(rubah);
    JTable tabelstoksepeda = new JTable();
    JScrollPane spsepeda = new JScrollPane(tabelstoksepeda);
    JTextField textpilih = new JTextField();
    public Aditya07224_StokSepedaGui(){ InitComponent();}

    public void InitComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024,610);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0x27ae60));

        labeldatasepeda.setBounds(280,40,1000,30);
        labeldatasepeda.setFont(new Font("Times new Roman",Font.BOLD,40));

        labelkode.setBounds(10,90,250,30);
        fieldkode.setBounds(10,120,250,30);

        labelmerk.setBounds(10,160, 70,30);
        comboBoxmerk.setBounds(80,160, 180,30);

        labelvarian.setBounds(10,190,250,30);
        fieldvarian.setBounds(10,220,250,30);

        labelwarna.setBounds(10,250,250,30);
        fieldwarna.setBounds(10,280,250,30);

        labeltahun.setBounds(10,310,250,30);
        fieldtahun.setBounds(10,340,250,30);

        spsepeda.setBounds(330,90,650,400);
        tabelstoksepeda.setModel(AllObjCtrl.sepedaMotor.daftarstok());
        comboBoxrubah.setBounds(760,530,100,30);

        tambah.setBounds(130,430,130,30);
        tambah.setBackground(new Color(0xf39c12));
        tambah.setFocusPainted(false);
        tambah.setBorder(null);

        Back.setBounds(10,430,100,30);
        Back.setBackground(new Color(0xc0392b));
        Back.setForeground(Color.white);
        Back.setFocusPainted(false);
        Back.setBorder(null);

        ubah.setBounds(875,530,100,30);
        ubah.setBackground(new Color(0xd35400));
        ubah.setFocusPainted(false);
        ubah.setForeground(Color.white);
        ubah.setBorder(null);

        add(labeldatasepeda);add(labelkode);add(fieldkode);add(labelmerk);
        add(comboBoxmerk);add(labelvarian);add(fieldvarian);add(labelwarna);
        add(fieldwarna);add(labeltahun);add(fieldtahun);add(tambah);add(Back);
        add(spsepeda);add(ubah);;add(comboBoxrubah);

        tambah.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                tambah.setBackground(new Color(0xf1c40f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tambah.setBackground(new Color(0xf39c12));
            }
        });
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kode = fieldkode.getText().toUpperCase();
                int merk = comboBoxmerk.getSelectedIndex();
                String varian = fieldvarian.getText().toUpperCase();
                String warna = fieldwarna.getText().toUpperCase();
                String tahun = fieldtahun.getText();
                AllObjCtrl.sepedaMotor.InsertSepeda(kode,merk,varian,warna,tahun);
                JOptionPane.showMessageDialog(null,"SEPEDA "+Aditya07224_MerkSepedaEntity.merk[merk]+" "+varian+" TELAH DITAMBAHKAN");
                kosong();
                tabelstoksepeda.setModel(AllObjCtrl.sepedaMotor.daftarstok());
            }
        });

        Back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Back.setBackground(new Color(0xe74c3c));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Back.setBackground(new Color(0xc0392b));
            }
        });
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Aditya07224_AdminMenuGui().setVisible(true);
            }
        });
        tabelstoksepeda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelstoksepeda.getSelectedRow();
                textpilih.setText(AllObjCtrl.sepedaMotor.daftarstok().getValueAt(i,0).toString());
            }
        });

        ubah.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ubah.setBackground(new Color(0xe67e22));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ubah.setBackground(new Color(0xd35400));
            }
        });
        ubah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kode = textpilih.getText();
                int rubah = comboBoxrubah.getSelectedIndex();
                int cek = AllObjCtrl.sepedaMotor.CekData(kode,null);

                if(rubah==0||rubah==1){
                    if(rubah==0){
                        String inputan = JOptionPane.showInputDialog("Masukkan Warna Baru");
                        AllObjCtrl.sepedaMotor.UpdateDataSepeda(rubah,cek,inputan.toUpperCase());
                    }else if(rubah==1){
                        String inputan = JOptionPane.showInputDialog("Masukkan Tahun Baru");
                        AllObjCtrl.sepedaMotor.UpdateDataSepeda(rubah,cek,inputan.toUpperCase());
                    }
                }
                else {
                    AllObjCtrl.sepedaMotor.UpdateDataSepeda(rubah,cek,null);
                }
                tabelstoksepeda.setModel(AllObjCtrl.sepedaMotor.daftarstok());

            }
        });
    }
}

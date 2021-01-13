package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aditya07224_KepegawaianGui extends Aditya07224_ComponentGui {
    JTable tabelkaryawan = new JTable();
    JScrollPane spkaryawan = new JScrollPane(tabelkaryawan);
    JTextField texthapus = new JTextField();
    public Aditya07224_KepegawaianGui(){
        initComponent();
    }
    public void initComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024,610);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0x27ae60));

        labeldatapegawai.setBounds(250,40,1000,30);
        labeldatapegawai.setFont(new Font("Times new Roman",Font.BOLD,40));

        labelid.setBounds(10,90,250,30);
        fieldid.setBounds(10,120,250,30);

        labelnama.setBounds(10,150,250,30);
        fieldnama.setBounds(10,180,250,30);

        labelpassword.setBounds(10,210,250,30);
        fieldpassword.setBounds(10,240,250,30);

        labelnotelp.setBounds(10,270,250,30);
        fieldnotelp.setBounds(10,300,250,30);

        labelalamat.setBounds(10,330,250,30);
        fieldalamat.setBounds(10,360,250,30);

        labelnoktp.setBounds(10,390,250,30);
        fieldnoktp.setBounds(10,420,250,30);

        labeljeniskelamin.setBounds(10,450,250,30);
        lk.setBounds(10,480,90,30);
        lk.setBackground(new Color(0x27ae60));
        lk.setForeground(Color.white);
        pr.setBounds(150,480,110,30);
        pr.setBackground(new Color(0x27ae60));
        pr.setForeground(Color.white);

        Daftar.setBounds(150,530,110,30);
        Daftar.setBackground(new Color(0xf39c12));
        Daftar.setFocusPainted(false);
        Daftar.setForeground(Color.white);
        Daftar.setBorder(null);

        Back.setBounds(10,530,90,30);
        Back.setBackground(new Color(0xc0392b));
        Back.setFocusPainted(false);
        Back.setForeground(Color.white);
        Back.setBorder(null);

        hapus.setBounds(875,530,100,30);
        hapus.setBackground(new Color(0xd35400));
        hapus.setFocusPainted(false);
        hapus.setForeground(Color.white);
        hapus.setBorder(null);

        spkaryawan.setBounds(330,120,650,400);
        tabelkaryawan.setModel(AllObjCtrl.pegawai.daftarkaryawan());

        add(labeldatapegawai);;add(labelid);add(fieldid);add(labelnama);add(fieldnama);
        add(labelpassword);add(fieldpassword);add(labelnotelp);add(fieldnotelp);
        add(labelalamat);add(fieldalamat);add(labelnoktp);add(fieldnoktp);
        add(labeljeniskelamin);add(lk);add(pr);add(Daftar);add(Back);add(spkaryawan);
        add(hapus);

        lk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lk.isSelected()){
                    pr.setSelected(false);
                    fieldjeniskelamin.setText("Laki-Laki");
                }
            }
        });

        pr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pr.isSelected()){
                    lk.setSelected(false);
                    fieldjeniskelamin.setText("perempuan");
                }
            }
        });

        Daftar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Daftar.setBackground(new Color(0xf1c40f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Daftar.setBackground(new Color(0xf39c12));
            }
        });
        Daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                String id = fieldid.getText();
                String nama = fieldnama.getText().toUpperCase();
                String pass = fieldpassword.getText();
                String notelp = fieldnotelp.getText();
                String alamat = fieldalamat.getText().toUpperCase();
                String noktp = fieldnoktp.getText();
                String jeniskelamin = fieldjeniskelamin.getText().toUpperCase();
                AllObjCtrl.pegawai.InsertPegawai(id,nama,pass,notelp,alamat,noktp,jeniskelamin);
                JOptionPane.showMessageDialog(null,"user "+nama+" telah terdaftar");
                kosong();
                tabelkaryawan.setModel(AllObjCtrl.pegawai.daftarkaryawan());

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

        tabelkaryawan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelkaryawan.getSelectedRow();
                texthapus.setText(AllObjCtrl.pegawai.daftarkaryawan().getValueAt(i,0).toString());
            }
        });

        hapus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hapus.setBackground(new Color(0xe67e22));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hapus.setBackground(new Color(0xd35400));
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = texthapus.getText();
                int cek = AllObjCtrl.pegawai.CekData(id);
                AllObjCtrl.pegawai.DeletePegawai(cek);
                tabelkaryawan.setModel(AllObjCtrl.pegawai.daftarkaryawan());
            }
        });
    }

}

package Gui;

import Entity.Aditya07224_TransaksiEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aditya07224_VerifTransaksiGui extends Aditya07224_ComponentGui{
    public Aditya07224_VerifTransaksiGui(){InitComponent();}
    JTable tabelverif = new JTable();
    JScrollPane spverif = new JScrollPane(tabelverif);
    JTextField textpilih = new JTextField();
    public void InitComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(0x27ae60));

        labelverif.setBounds(100,20,500,70);
        labelverif.setFont(new Font("Times new Roman",Font.BOLD,40));

        Back.setBounds(10,500,100,30);
        Back.setBackground(new Color(0xc0392b));
        Back.setFocusPainted(false);
        Back.setForeground(Color.white);
        Back.setBorder(null);

        Verif.setBounds(650,100,100,30);
        Verif.setBackground(new Color(0x2c3e50));
        Verif.setFocusPainted(false);
        Verif.setForeground(Color.white);
        Verif.setBorder(null);

        spverif.setBounds(50,100,570,350);
        tabelverif.setModel(AllObjCtrl.transaksi.daftartransaksi());

        add(labelverif);
        add(Back);
        add(Verif);
        add(spverif);

        tabelverif.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelverif.getSelectedRow();
                textpilih.setText(AllObjCtrl.transaksi.daftartransaksi().getValueAt(i,0).toString());
            }
        });

        Verif.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Ajukan.setBackground(new Color(0x34495e));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Ajukan.setBackground(new Color(0x2c3e50));
            }
        });
        Verif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idtrx = textpilih.getText();
                int i = AllObjCtrl.transaksi.CekData(idtrx,null);
                AllObjCtrl.transaksi.updateIsverified(i, new Aditya07224_TransaksiEntity(idtrx,AllObjCtrl.transaksi.getData(i).getSepedaMotor(),AllObjCtrl.transaksi.getData(i).getPelanggan(),true));
                tabelverif.setModel(AllObjCtrl.transaksi.daftartransaksi());
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
                Aditya07224_PegawaiMenuGui pegawaiMenuGui = new Aditya07224_PegawaiMenuGui();
            }
        });
    }
}

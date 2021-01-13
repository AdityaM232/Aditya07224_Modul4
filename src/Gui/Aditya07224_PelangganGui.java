package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Aditya07224_PelangganGui extends Aditya07224_ComponentGui{
    JTable tabelverif = new JTable();
    JScrollPane spverif = new JScrollPane(tabelverif);
    JTable tabelstoksepeda = new JTable();
    JScrollPane spsepeda = new JScrollPane(tabelstoksepeda);
    Random ran = new Random();

    public Aditya07224_PelangganGui(){InitComponent();}
    public void InitComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(0x27ae60));

        labeltransaksi.setBounds(100,20,500,70);
        labeltransaksi.setFont(new Font("Times new Roman",Font.BOLD,40));

        Back.setBounds(10,500,100,30);
        Back.setBackground(new Color(0xc0392b));
        Back.setFocusPainted(false);
        Back.setForeground(Color.white);
        Back.setBorder(null);

        Ajukan.setBounds(650,100,100,30);
        Ajukan.setBackground(new Color(0x2c3e50));
        Ajukan.setFocusPainted(false);
        Ajukan.setForeground(Color.white);
        Ajukan.setBorder(null);

        spsepeda.setBounds(10,90,630,150);
        tabelstoksepeda.setModel(AllObjCtrl.sepedaMotor.daftarstok());
        labeldatatransaksi.setBounds(210,270,300,60);
        labeldatatransaksi.setFont(new Font("Times new roman",Font.BOLD,20));
        spverif.setBounds(10,320,630,150);
        tabelverif.setModel(AllObjCtrl.transaksi.daftartransaksi());

        add(labeltransaksi);
        add(Back);
        add(Ajukan);
        add(spsepeda);
        add(spverif);
        add(labeldatatransaksi);
        Ajukan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Ajukan.setBackground(new Color(0x34495e));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Ajukan.setBackground(new Color(0x2c3e50));
            }
        });
        Ajukan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idtrx = String.format("%04d", ran.nextInt(10000));
                int i = tabelstoksepeda.getSelectedRow();
                AllObjCtrl.transaksi.InsertTransaksi(idtrx,AllObjCtrl.sepedaMotor.GetData(i),AllObjCtrl.pelanggan.GetData(),false);
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
                Aditya07224_LoginGui loginGui = new Aditya07224_LoginGui();
            }
        });
    }
}

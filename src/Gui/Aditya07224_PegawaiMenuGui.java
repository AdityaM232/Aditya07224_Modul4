package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aditya07224_PegawaiMenuGui extends Aditya07224_ComponentGui{
    ImageIcon iconpelanggan = new ImageIcon("Assets/motocross.png");
    ImageIcon iconverif = new ImageIcon("Assets/verify.png");
    JButton btnpelanggan = new JButton();
    JButton btnverif = new JButton();
    public Aditya07224_PegawaiMenuGui(){InitComponent();}
    public void InitComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setSize(335,280);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(0x27ae60));

        btnpelanggan.setText("PELANGGAN");
        btnpelanggan.setBounds(20,20,130,150);
        btnpelanggan.setBackground(new Color(0x2980b9));
        btnpelanggan.setIcon(iconpelanggan);
        btnpelanggan.setHorizontalTextPosition(JButton.CENTER);
        btnpelanggan.setVerticalTextPosition(JButton.BOTTOM);
        btnpelanggan.setFocusPainted(false);
        btnpelanggan.setForeground(Color.white);
        btnpelanggan.setBorder(null);

        btnverif.setText("VERIFIKASI");
        btnverif.setBounds(170,20,130,150);
        btnverif.setBackground(new Color(0xf39c12));
        btnverif.setIcon(iconverif);
        btnverif.setHorizontalTextPosition(JButton.CENTER);
        btnverif.setVerticalTextPosition(JButton.BOTTOM);
        btnverif.setFocusPainted(false);
        btnverif.setForeground(Color.white);
        btnverif.setBorder(null);

        Back.setBounds(20,190,280,30);
        Back.setBackground(Color.red);
        Back.setFocusPainted(false);
        Back.setForeground(Color.white);
        Back.setBorder(null);
        Back.setBackground(new Color(0xc0392b));
        add(btnpelanggan);
        add(btnverif);
        add(Back);

        btnpelanggan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnpelanggan.setBackground(new Color(0x3498db));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnpelanggan.setBackground(new Color(0x2980b9));
            }
        });
        btnpelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aditya07224_KepelanggananGui kepelanggananGui = new Aditya07224_KepelanggananGui();
            }
        });

        btnverif.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnverif.setBackground(new Color(0xf1c40f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnverif.setBackground(new Color(0xf39c12));
            }
        });
        btnverif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aditya07224_VerifTransaksiGui transaksiGui = new Aditya07224_VerifTransaksiGui();
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

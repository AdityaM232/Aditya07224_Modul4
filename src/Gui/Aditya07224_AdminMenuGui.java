package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aditya07224_AdminMenuGui extends Aditya07224_ComponentGui{
    ImageIcon iconpegawai = new ImageIcon("Assets/pegawai.jpg");
    ImageIcon iconsepeda = new ImageIcon("Assets/motorcycle.png");
    JButton btnpegawai = new JButton();
    JButton btnstoksepeda = new JButton();
    public Aditya07224_AdminMenuGui(){initComponent();}
    public void initComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setSize(335,280);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(0x27ae60));

        btnpegawai.setText("KEPEGAWAIAN");
        btnpegawai.setBounds(20,20,130,150);
        btnpegawai.setIcon(iconpegawai);
        btnpegawai.setBackground(new Color(0x2980b9));
        btnpegawai.setForeground(Color.white);
        btnpegawai.setHorizontalTextPosition(JButton.CENTER);
        btnpegawai.setVerticalTextPosition(JButton.BOTTOM);
        btnpegawai.setFocusPainted(false);
        btnpegawai.setBorder(null);

        btnstoksepeda.setText("STOCK SEPEDA");
        btnstoksepeda.setBounds(170,20,130,150);
        btnstoksepeda.setIcon(iconsepeda);
        btnstoksepeda.setBackground(new Color(0xf39c12));
        btnstoksepeda.setForeground(Color.white);
        btnstoksepeda.setHorizontalTextPosition(JButton.CENTER);
        btnstoksepeda.setVerticalTextPosition(JButton.BOTTOM);
        btnstoksepeda.setFocusPainted(false);
        btnstoksepeda.setBorder(null);

        Back.setBounds(20,190,280,30);
        Back.setBackground(new Color(0xc0392b));
        Back.setForeground(Color.white);
        Back.setFocusPainted(false);
        Back.setBorder(null);

        add(btnpegawai);
        add(btnstoksepeda);
        add(Back);

        btnpegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aditya07224_KepegawaianGui kepegawaianGui = new Aditya07224_KepegawaianGui();
            }
        });
        btnpegawai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnpegawai.setBackground(new Color(0x3498db));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnpegawai.setBackground(new Color(0x2980b9));
            }
        });

        btnstoksepeda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aditya07224_StokSepedaGui stokSepedaGui = new Aditya07224_StokSepedaGui();
            }
        });

        btnstoksepeda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnstoksepeda.setBackground(new Color(0xf1c40f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnstoksepeda.setBackground(new Color(0xf39c12));
            }
        });

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               Aditya07224_LoginGui loginGui = new Aditya07224_LoginGui();
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
    }
}

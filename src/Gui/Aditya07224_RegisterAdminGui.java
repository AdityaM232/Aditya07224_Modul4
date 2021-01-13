package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aditya07224_RegisterAdminGui extends Aditya07224_ComponentGui {
    Object a;
    Aditya07224_RegisterAdminGui(){
        initComponent();
    }
    public void initComponent(){
        setTitle("SISTEM INFORMASI DEALER MOTOR");
        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(new Color(0x27ae60));

        labelid.setBounds(10,20,250,30);
        fieldid.setBounds(10,50,250,30);

        labelnama.setBounds(10,80,250,30);
        fieldnama.setBounds(10,110,250,30);

        labelpassword.setBounds(10,140,250,30);
        fieldpassword.setBounds(10,170,250,30);

        Daftar.setBounds(90,210,100,30);
        Daftar.setBackground(new Color(0xf39c12));
        Daftar.setBorder(null);

        add(labelid);
        add(fieldid);
        add(labelnama);
        add(fieldnama);
        add(labelpassword);
        add(fieldpassword);
        add(Daftar);

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

                SuksesInsert((MouseEvent) a);

                String id = fieldid.getText();
                String nama = fieldnama.getText();
                String pass = fieldpassword.getText();
                AllObjCtrl.admin.InsertAdmin(id,nama,pass,null,null,null,null);
                dispose();
            }
        });
    }

}

package Gui;

import javax.swing.*;

public class Aditya07224_ComponentGui extends JFrame {

    protected JButton AdminReg = new JButton("REGISTER ADMIN");
    protected JButton Login = new JButton("Login");

    protected JLabel labeldatapegawai = new JLabel("DATA KEPEGAWAIAN");
    protected JLabel labeldatasepeda = new JLabel("DATA STOK SEPEDA");
    protected JLabel labeldatapelanggan = new JLabel("DATA PELANGGAN");
    protected JLabel labeldatatransaksi = new JLabel("DATA TRANSAKSI");
    protected JLabel labelverif = new JLabel("VERIFIKASI TRANSAKSI");
    protected JLabel labeltransaksi = new JLabel("PORTAL TRANSAKSI");

    protected JLabel labellogin = new JLabel("Login");
    protected JLabel labelid = new JLabel("ID");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelpassword = new JLabel("PASSWORD");
    protected JLabel labelnotelp = new JLabel("NO TELP");
    protected JLabel labelalamat = new JLabel("ALAMAT");
    protected JLabel labelnoktp = new JLabel("NO KTP");
    protected JLabel labeljeniskelamin = new JLabel("JENIS KELAMIN");

    protected JLabel labelkode = new JLabel("KODE BARANG");
    protected JLabel labelmerk = new JLabel("Merk");
    protected JLabel labelvarian = new JLabel("VARIAN");
    protected JLabel labelwarna = new JLabel("WARNA");
    protected JLabel labeltahun = new JLabel("TAHUN");

    protected JTextField fieldid = new JTextField();
    protected JTextField fieldnama = new JTextField();
    protected JPasswordField fieldpassword = new JPasswordField();
    protected JTextField fieldnotelp = new JTextField();
    protected JTextField fieldalamat = new JTextField();
    protected JTextField fieldnoktp = new JTextField();
    protected JTextField fieldjeniskelamin = new JTextField();
    protected JTextField fieldkode = new JTextField();
    protected JTextField fieldvarian = new JTextField();
    protected JTextField fieldwarna = new JTextField();
    protected JTextField fieldtahun = new JTextField();

    protected JRadioButton lk = new JRadioButton("LAKI - LAKI");
    protected JRadioButton pr = new JRadioButton("PEREMPUAN");

    protected JButton Daftar = new JButton("DAFTAR");
    protected JButton Verif = new JButton("VERIF");
    protected JButton Back = new JButton("BACK");
    protected JButton Ajukan = new JButton("AJUKAN");
    protected JButton hapus = new JButton("HAPUS");

    void kosong(){
        fieldid.setText(null);
        fieldnama.setText(null);
        fieldpassword.setText(null);
        fieldnotelp.setText(null);
        fieldalamat.setText(null);
        fieldnoktp.setText(null);
        fieldkode.setText(null);
        fieldvarian.setText(null);
        fieldwarna.setText(null);
        fieldtahun.setText(null);
    }
    public void SuksesInsert(java.awt.event.MouseEvent a){
        JOptionPane.showMessageDialog(null,"Sukses Tambah Data");
    }
}

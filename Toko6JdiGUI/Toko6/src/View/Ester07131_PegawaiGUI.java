package View;

import Controller.Ester07131_AllObjectModel;
import Controller.Ester07131_PembeliController;
import Entity.Ester07131_KueEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ester07131_PegawaiGUI {
    private static Ester07131_PembeliController pm = new Ester07131_PembeliController();
    JFrame pgwai = new JFrame();
    JTable tabelpm = new JTable();
    JScrollPane scrolpg = new JScrollPane(tabelpm);
    JLabel lbelnotel,lbelpass,lbelnama,lbelalamat,lbelmenu,lbelharga;
    JButton kembali,hapus,ubah,lihat;
    JTextField tlisnotel,tlisnama,tlisalamat,tlispass,tlishrg,tliskue;
    JLabel dtpm,dftarpm;
    DefaultTableModel model;
    String[] data;
    JComboBox pilmenu = new JComboBox(Ester07131_KueEntity.nama);
    JComboBox pilharga = new JComboBox(Ester07131_KueEntity.harga);
//    int cek = Ester07131_AllObjCtrl.pembeli.dftarPembeli(Ester07131_AllObjCtrl.pembeli.getData()); 
    public Ester07131_PegawaiGUI() {
        pgwai.setSize(720, 800);
        pgwai.setLayout(null);
        pgwai.getContentPane().setBackground(Color.YELLOW);
        
        dtpm = new JLabel("PEMBELI");
        dtpm.setFont(new Font("Times New Roman",Font.BOLD,30));
        dtpm.setBounds(300, 30, 300, 30);
        pgwai.add(dtpm);
//        scrolpg.setBounds(60, 400, 570, 200);
//        tabelpm.setModel(pm.datapm());
//        pgwai.add(scrolpg);
               
        lbelnotel = new JLabel("No Telp");
        lbelnotel.setBounds(100, 90, 200, 30);
        pgwai.add(lbelnotel);
        tlisnotel = new JTextField();
        tlisnotel.setBounds(200, 90, 400, 30);
        pgwai.add(tlisnotel);
        
        lbelpass = new JLabel("Password");
        lbelpass.setBounds(100, 140, 200, 30);
        pgwai.add(lbelpass);
        tlispass = new JTextField();
        tlispass.setBounds(200, 140, 400, 30);
        pgwai.add(tlispass);
        
        lbelnama = new JLabel("Nama");
        lbelnama.setBounds(100, 190, 200, 30);
        pgwai.add(lbelnama);
        tlisnama = new JTextField();
        tlisnama.setBounds(200, 190, 400, 30);
        pgwai.add(tlisnama);
        
        lbelalamat = new JLabel("Alamat");
        lbelalamat.setBounds(100, 240, 200, 30);
        pgwai.add(lbelalamat);
        tlisalamat = new JTextField();
        tlisalamat.setBounds(200, 240, 400, 30);
        pgwai.add(tlisalamat);
        
        lbelmenu = new JLabel("Menu Kue");
        lbelmenu.setBounds(100, 290, 200, 30);
        pgwai.add(lbelmenu);
        pilmenu.setBounds(200, 290, 400, 30);
        pgwai.add(pilmenu);      
        
        lbelharga = new JLabel("Harga Kue");
        lbelharga.setBounds(100, 340, 200, 30);
        pgwai.add(lbelharga);
        pilharga.setBounds(200, 340, 400, 30);
        pgwai.add(pilharga);   
        
        lihat = new JButton("Lihat Data");
        lihat.setBounds(100 , 400, 100, 30);
        lihat.setBackground(Color.WHITE);
        pgwai.add(lihat);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(300 , 400, 100, 30);
        hapus.setBackground(Color.WHITE);
        pgwai.add(hapus);
        
        ubah = new JButton("Ubah");
        ubah.setBounds(500 , 400, 100, 30);
        ubah.setBackground(Color.WHITE);
        pgwai.add(ubah);
        
        kembali = new JButton("Kembali");
        kembali.setBounds(60 , 700, 100, 30);
        kembali.setBackground(Color.RED);
        pgwai.add(kembali);

    pgwai.setVisible(true);
    pgwai.setLocationRelativeTo(null);
    pgwai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    scrolpg.setBounds(60, 450, 570, 200);
    pgwai.add(scrolpg);
    model = new DefaultTableModel();
    data = new String[6];
    model.addColumn("NoTelp");
    model.addColumn("Password");
    model.addColumn("Nama");
    model.addColumn("Alamat");
    model.addColumn("Kue");
    model.addColumn("Harga");
    tabelpm.setModel(model);
    
    kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pgwai.dispose();
                Ester07131_GUI kmbl = new Ester07131_GUI();
            }
        });

    lihat.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                data[0] = tlisnotel.getText();
                data[1] = tlispass.getText();
                data[2] = tlisnama.getText();
                data[3] = tlisalamat.getText();
                data[4] = pilmenu.getItemAt(pilmenu.getSelectedIndex()).toString();
                data[5] = pilharga.getItemAt(pilharga.getSelectedIndex()).toString();
                kosong();
                model.addRow(data);
            }
        });
        ubah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int baris = tabelpm.getSelectedRow();
                data[0] = tlisnotel.getText();
                data[1] = tlispass.getText();
                data[2] = tlisnama.getText();
                data[3] = tlisalamat.getText();
                data[4] = pilmenu.getItemAt(pilmenu.getSelectedIndex()).toString();
                data[5] = pilharga.getItemAt(pilharga.getSelectedIndex()).toString();
                model.setValueAt(data[0], baris, 0);
                model.setValueAt(data[1], baris, 1);
                model.setValueAt(data[2], baris, 2);
                model.setValueAt(data[3], baris, 3);
                model.setValueAt(data[4], baris, 4);
                model.setValueAt(data[5], baris, 5);
                kosong();    
            }
        });
    
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int baris = tabelpm.getSelectedRow();
                model.removeRow(baris);
                kosong();
            }
        });
        
        tabelpm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int baris = tabelpm.getSelectedRow();
                tlisnotel.setText(model.getValueAt(baris,0).toString());
                tlispass.setText(model.getValueAt(baris,1).toString());
                tlisnama.setText(model.getValueAt(baris,2).toString());
                tlisalamat.setText(model.getValueAt(baris,3).toString());
                pilmenu.setSelectedItem(model.getValueAt(baris,4).toString());
                pilharga.setSelectedItem(model.getValueAt(baris,5).toString());
            }
        });
    }
    private void kosong() {
                tlisnotel.setText(null);
                tlispass.setText(null);
                tlisnama.setText(null);
                tlisalamat.setText(null);
                pilmenu.setSelectedItem(null);
                pilharga.setSelectedItem(null);
                
            }
}
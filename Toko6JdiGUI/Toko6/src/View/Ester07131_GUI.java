package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ester07131_GUI {
    JFrame dpn = new JFrame();
    JLabel login,daftar,utma;
    JTextField tlisnotellogin;
    JLabel lbelnotellogin,lbelpasslogin;
    JButton cek,dftr;
    JPasswordField passlogin;
    public Ester07131_GUI() {
        dpn.setSize(600, 500);
        dpn.setLayout(null);
        dpn.getContentPane().setBackground(Color.PINK);
        
        utma = new JLabel("TOKO KUE SEMANGAT");
        utma.setBounds(50, 10, 600, 50);
        utma.setFont(new Font("Times New Roman",Font.BOLD,40));
        dpn.add(utma);
        
        login = new JLabel("Login Admin");
        login.setBounds(50, 50, 200, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        dpn.add(login);
        
        lbelnotellogin = new JLabel("No Telp");
        lbelnotellogin.setBounds(30, 150, 50, 30);
        dpn.add(lbelnotellogin);
        tlisnotellogin = new JTextField();
        tlisnotellogin.setBounds(30, 180, 200, 30);
        dpn.add(tlisnotellogin);
        
        lbelpasslogin = new JLabel("Password");
        lbelpasslogin.setBounds(30, 240, 100, 30);
        dpn.add(lbelpasslogin);
        passlogin = new JPasswordField();
        passlogin.setBounds(30, 270, 200, 30);
        dpn.add(passlogin);
        
        cek = new JButton("Login");
        cek.setBounds(90, 320, 100, 40);
        cek.setBackground(Color.GREEN);
        dpn.add(cek);
        
        dpn.setVisible(true);
        dpn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dpn.setLocationRelativeTo(null);
        
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(tlisnotellogin.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Notelp Belum Di Isi");
                    tlisnotellogin.requestFocus();
                }else if(passlogin.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Belum Di Isi");
                    passlogin.requestFocus();
                }else if(tlisnotellogin.getText().contains("04")&&passlogin.getText().contains("04")) {
                    Ester07131_PegawaiGUI pg = new Ester07131_PegawaiGUI();
                    dpn.dispose();
                }else if(tlisnotellogin.getText().contains("06")&&passlogin.getText().contains("06")){
                    Ester07131_PegawaiGUI pgw = new Ester07131_PegawaiGUI();
                    dpn.dispose();
                }else {
                    JOptionPane.showConfirmDialog(null, "Notelp Dan Password Salah");
                }
            }
        });
    }
    void ksng() {
        tlisnotellogin.setText(null);
        passlogin.setText(null);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopascoa;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author giova
 */


public class FormPascoa extends JFrame {
    protected JTextField txtAno, txtDia, txtMes;
    protected JButton btnCalcular;
    private Color verdeCaneta = new Color(0, 150, 136);

    public FormPascoa() {
        setTitle("xyz - Calculadora");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Label ANO
        JLabel lblAno = new JLabel("ANO");
        lblAno.setBounds(50, 50, 50, 30);
        lblAno.setForeground(verdeCaneta);
        add(lblAno);

        // Input ANO
        txtAno = new JTextField();
        txtAno.setBounds(110, 50, 150, 35);
        txtAno.setBorder(BorderFactory.createLineBorder(verdeCaneta, 2));
        add(txtAno);

        // Botão Estilizado
        btnCalcular = new JButton("CALCULAR PASCOA");
        btnCalcular.setBounds(50, 110, 300, 50);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setForeground(verdeCaneta);
        btnCalcular.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(verdeCaneta, 2),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        add(btnCalcular);

        // Resultados
        JLabel lblDia = new JLabel("DIA:");
        lblDia.setBounds(50, 190, 50, 30);
        lblDia.setForeground(verdeCaneta);
        add(lblDia);

        txtDia = new JTextField();
        txtDia.setBounds(110, 190, 80, 30);
        txtDia.setEditable(false);
        add(txtDia);

        JLabel lblMes = new JLabel("MES:");
        lblMes.setBounds(50, 230, 50, 30);
        lblMes.setForeground(verdeCaneta);
        add(lblMes);

        txtMes = new JTextField();
        txtMes.setBounds(110, 230, 80, 30);
        txtMes.setEditable(false);
        add(txtMes);
    }
}

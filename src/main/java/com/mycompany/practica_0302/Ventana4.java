/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.practica_0302;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author Andy Abad
 */
public class Ventana4 extends JFrame
{
 private JPanel jPanelPrincipal;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JLabel> jLabelList;
    private ArrayList<JButton> jButtonList;
    private JCheckBox jCheckBox;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JTextArea jTextArea;
    private JTextField jTextField1;

    public Ventana4(String title)
    {
        super.setTitle(title);
        this.setSize(500,700);
        this.setLocationRelativeTo(null);
        this.iniciarComponentes();
        this.setContentPane(jPanelPrincipal);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    public void iniciarComponentes()
    {
        jPanelPrincipal=new JPanel();
        this.jPanelPrincipal.setLayout(new BorderLayout());
        this.iniciarPaneles();
    }
    public void iniciarPaneles()
    {
        jPanelList=new ArrayList();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.iniciarJLabelList();
        this.iniciarJTextField();
        this.iniciarJButton();
        this.iniciarJCheckBox();
        this.iniciarJTextArea();
        this.iniciarComboBox();
  
        this.jPanelPrincipal.add(jPanelList.get(0),BorderLayout.NORTH);
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(0).add(jLabelList.get(0));
        
        this.jPanelPrincipal.add(jPanelList.get(1),BorderLayout.CENTER);
        this.jPanelList.get(1).setLayout(new GridLayout(13,2));
        
        this.jPanelList.get(1).add(jLabelList.get(1));
        this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(1).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(1).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(2));
        this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(2).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(2).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(3));
        this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(3).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(3).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(4));
        this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(4).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(5));
        this.jLabelList.get(5).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(5).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(5).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(6));
        this.jLabelList.get(6).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(6).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(6).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(7));
        this.jLabelList.get(7).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(7).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(7).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(8));
        this.jLabelList.get(8).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(8).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(8).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(9));
        this.jLabelList.get(9).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(9).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(9).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(10));
        this.jLabelList.get(10).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(10).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(10).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(11));
        this.jLabelList.get(11).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(11).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(11).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(12));
        this.jLabelList.get(12).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(12).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(12).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(13));
        this.jLabelList.get(13).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(13).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(13).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(14));
        this.jLabelList.get(14).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(14).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(14).setOpaque(true);
        this.jPanelList.get(1).add(jLabelList.get(15));
        this.jLabelList.get(15).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(15).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(15).setOpaque(true);
        this.jPanelList.get(1).add(jTextArea);
        this.jPanelList.get(1).add(jLabelList.get(16));
        this.jLabelList.get(16).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(16).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(16).setOpaque(true);
        this.jPanelList.get(1).add(jTextField1);
        this.jPanelList.get(1).add(jLabelList.get(17));
        this.jLabelList.get(17).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jLabelList.get(17).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(17).setOpaque(true);
        this.jPanelList.get(1).add(jComboBox1);
        this.jPanelList.get(1).add(jLabelList.get(18));
        this.jLabelList.get(18).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jLabelList.get(18).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(18).setOpaque(true);
        this.jPanelList.get(1).add(jComboBox2);
        this.jPanelList.get(1).add(jLabelList.get(19));
        this.jLabelList.get(19).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jLabelList.get(19).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(19).setOpaque(true);
        this.jPanelList.get(1).add(jCheckBox);
        this.jPanelList.get(1).add(jLabelList.get(20));
        this.jLabelList.get(20).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jLabelList.get(20).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(20).setOpaque(true);
        this.jPanelList.get(1).add(jComboBox3);
        
        this.jPanelPrincipal.add(jPanelList.get(2),BorderLayout.SOUTH);
        this.jPanelList.get(2).add(jButtonList.get(0));
        this.jPanelList.get(2).add(jButtonList.get(1));
        
    }
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList();
        this.jLabelList.add(new JLabel("CREAR GRUPO"));
        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("2022 - 2022"));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("MATRIZ CUENCA"));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("EL VECINO"));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("PRESENCIAL"));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("AGROPECUARIA"));
        this.jLabelList.add(new JLabel("Codigo de Proyecto: "));
        this.jLabelList.add(new JLabel("AGROPECUARIO [REDISENIO] - NUEVA O REDISENIO"));
        this.jLabelList.add(new JLabel("Asignatura: "));
        this.jLabelList.add(new JLabel("E-CV-IAG-003 BOTANICA"));
        this.jLabelList.add(new JLabel("Nombre de Grupo: "));
        this.jLabelList.add(new JLabel("Cupos por Grupo: "));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo: "));
        this.jLabelList.add(new JLabel("Ofertas para estudiantes: "));
        this.jLabelList.add(new JLabel("Aplica Cambio de Grupo"));
        
    }
    public void iniciarJTextField()
    {
        jTextField1=new JTextField();
        jTextField1.add(new JTextField(0));
        jTextField1.setColumns(20);
    }
    public void iniciarJButton()
    {
        jButtonList=new ArrayList();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
    }
    public void iniciarComboBox()
    {
        jComboBox1=new JComboBox();
        jComboBox2=new JComboBox();
        jComboBox3=new JComboBox();
        this.jComboBox1.addItem("NO");
        this.jComboBox1.addItem("SI");
        
        this.jComboBox2.addItem("JORNADAS DISPONIBLES");
        this.jComboBox2.addItem("JORDANAS NO DISPONIBLES");
        
        this.jComboBox3.addItem("SI");
        this.jComboBox3.addItem("NO");
    }
    public void iniciarJCheckBox()
    {
        jCheckBox=new JCheckBox("Nuevos");
        
    }
    public void iniciarJTextArea()
    {
        jTextArea=new JTextArea(5,10);
        
    }
}

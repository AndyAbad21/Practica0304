/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.practica_0302;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Andy Abad
 */
public class Ventana5 extends JFrame
{
    private JPanel jPanelPrincipal;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JPanel> jPanelList2;
    private ArrayList<JLabel> jLabelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    private JComboBox jComboBox6;
    
    
    public Ventana5(String title)
    {
        super.setTitle(title);
        this.setLocationRelativeTo(null);
        this.setSize(900,200);
        this.iniciarComponentes();
        this.setContentPane(jPanelPrincipal);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void iniciarComponentes()
    {
        jPanelPrincipal=new JPanel();
        jPanelPrincipal.setBackground(Color.WHITE);
        jPanelPrincipal.setLayout(new GridLayout(3,1));
        this.iniciarPaneles();
    }
    public void iniciarPaneles()
    {
        jPanelList=new ArrayList();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.iniciarJLabelList();
        this.iniciarJComboBox();
        this.iniciarJPanel2();
        
        this.jPanelPrincipal.add(jPanelList.get(0));
        this.jPanelList.get(0).add(jPanelList2.get(0));
        this.jPanelList2.get(0).add(jLabelList.get(0));
        this.jPanelList2.get(0).add(jComboBox1);
        this.jPanelList2.get(0).setOpaque(true);
        
        this.jPanelList.get(0).add(jPanelList2.get(1));
        this.jPanelList2.get(1).add(jLabelList.get(1));
        this.jPanelList2.get(1).add(jComboBox2);
        this.jPanelList2.get(1).setOpaque(true);
        
        this.jPanelList.get(0).add(jPanelList2.get(2));
        this.jPanelList2.get(2).add(jLabelList.get(2));
        this.jPanelList2.get(2).add(jComboBox3);
        this.jPanelList2.get(2).setOpaque(true);
        
        this.jPanelPrincipal.add(jPanelList.get(1));
        this.jPanelList.get(1).add(jPanelList2.get(3));
        this.jPanelList2.get(3).add(jLabelList.get(3));
        this.jPanelList2.get(3).add(jComboBox4);
        this.jPanelList2.get(3).setOpaque(true);
        
        this.jPanelList.get(1).add(jPanelList2.get(4));
        this.jPanelList2.get(4).add(jLabelList.get(4));
        this.jPanelList2.get(4).add(jComboBox5);
        this.jPanelList2.get(4).setOpaque(true);
        
        this.jPanelList.get(1).add(jPanelList2.get(5));
        this.jPanelList2.get(5).add(jLabelList.get(5));
        this.jPanelList2.get(5).add(jComboBox6);
        this.jPanelList2.get(5).setOpaque(true);
        
        this.jPanelPrincipal.add(jPanelList.get(2));
        this.jPanelList.get(2).add(jPanelList2.get(6));
        this.jPanelList2.get(6).add(jLabelList.get(6));
        this.jPanelList2.get(6).setOpaque(true);
        
    }
    public void iniciarJPanel2()
    {
        jPanelList2=new ArrayList();
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        this.jPanelList2.add(new JPanel());
        
        this.jPanelList2.get(0).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(0).setBackground(Color.WHITE);
        this.jPanelList2.get(1).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(1).setBackground(Color.WHITE);
        this.jPanelList2.get(2).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(2).setBackground(Color.WHITE);
        this.jPanelList2.get(3).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(3).setBackground(Color.WHITE);
        this.jPanelList2.get(4).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(4).setBackground(Color.WHITE);
        this.jPanelList2.get(5).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(5).setBackground(Color.WHITE);
        this.jPanelList2.get(6).setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.jPanelList2.get(6).setBackground(Color.WHITE);
    }   
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList();
        jLabelList.add(new JLabel("Sede: "));
        jLabelList.add(new JLabel("Campus/Extension: "));
        jLabelList.add(new JLabel("Carrera: "));
        jLabelList.add(new JLabel("Codigo del Proyecto: "));
        jLabelList.add(new JLabel("Modalidad: "));
        jLabelList.add(new JLabel("Periodo: "));
        jLabelList.add(new JLabel("Fecha Inicio Clases: 28/03/2022 al 06/08/2022"));
    }
    public void iniciarJComboBox()
    {
        jComboBox1=new JComboBox();
        jComboBox2=new JComboBox();
        jComboBox3=new JComboBox();
        jComboBox4=new JComboBox();
        jComboBox5=new JComboBox();
        jComboBox6=new JComboBox();
        
        jComboBox1.addItem("MATRIZ CUENCA");
        jComboBox1.addItem("MATRIZ QUITO");
        jComboBox1.addItem("MATRIZ GUAYAQUIL");
        
        jComboBox2.addItem("El VECINO");
        jComboBox2.addItem("OTROS");
        
        jComboBox3.addItem("COMPUTACION");
        jComboBox3.addItem("AGROPECUARIA");
        jComboBox3.addItem("MEDICINA");
        jComboBox3.addItem("TELECOMUNICACIONES");
        
        jComboBox4.addItem("AGROPECUARIA [REDISENIO] - NUEVA O REDISENIO");
        jComboBox4.addItem("COMPUTACION [REDISENIO] - REDISENIO");
        
        jComboBox5.addItem("PRESENCIAL");
        jComboBox5.addItem("EN LINEA");
        
        jComboBox6.addItem("60");
        jComboBox6.addItem("59");
    }
}

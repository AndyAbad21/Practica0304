/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.practica_0302;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
/**
 * 
 * @author Andy Abad
 */
public class Ventana3 extends JFrame 
{
    private JPanel jPanelPrincipal;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JLabel> jLabelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    public Ventana3(String title)
    {
        super.setTitle(title);
        this.setSize(500,500);
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
        
        this.iniciarJLabelList();
        this.iniciarComboBox();
  
        this.jPanelPrincipal.add(jPanelList.get(0),BorderLayout.NORTH);
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(0).add(jLabelList.get(0));
        
        this.jPanelPrincipal.add(jPanelList.get(1),BorderLayout.CENTER);
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanelList.get(1).setLayout(new GridLayout(7,2));
        
        this.jPanelList.get(1).add(jLabelList.get(1));
        this.jPanelList.get(1).add(jLabelList.get(2));
        this.jPanelList.get(1).add(jLabelList.get(3));
        this.jPanelList.get(1).add(jComboBox1);
        this.jPanelList.get(1).add(jLabelList.get(4));
        this.jPanelList.get(1).add(jComboBox2);
        this.jPanelList.get(1).add(jLabelList.get(5));
        this.jPanelList.get(1).add(jComboBox3);
        this.jPanelList.get(1).add(jLabelList.get(6));
        this.jPanelList.get(1).add(jComboBox4);
        this.jPanelList.get(1).add(jLabelList.get(7));
        this.jPanelList.get(1).add(jComboBox5);
        this.jPanelList.get(1).add(jLabelList.get(8));
        this.jPanelList.get(1).add(jLabelList.get(9));
        
        
    }
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList();
        this.jLabelList.add(new JLabel("INFORMACION DE LA CARRERA"));
        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.get(0).setFont(new Font("Serif", Font.PLAIN, 15));
        this.jLabelList.add(new JLabel("Periodo academico: "));
        this.jLabelList.add(new JLabel("2022 - 2022"));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha de Registro"));
        this.jLabelList.add(new JLabel("29/04/2022"));
    }
    public void iniciarComboBox()
    {
        jComboBox1=new JComboBox();
        jComboBox2=new JComboBox();
        jComboBox3=new JComboBox();
        jComboBox4=new JComboBox();
        jComboBox5=new JComboBox();
        
        this.jComboBox1.addItem("ARQUITECTURA");
        this.jComboBox1.addItem("COMPUTACION");
        this.jComboBox1.addItem("MEDICINA");
        this.jComboBox1.addItem("ELECTROTECNIA");
        
        this.jComboBox2.addItem("PRECENCIAL");
        this.jComboBox2.addItem("EN LINEA");
        this.jComboBox2.addItem("HIBRIDA");
        
        this.jComboBox3.addItem("MATRIZ CUENCA");
        this.jComboBox3.addItem("MATRIZ GUAYAQUIL");
        this.jComboBox3.addItem("MATRIZ QUITO");
        
        this.jComboBox4.addItem("EL VECINO");
        this.jComboBox4.addItem("OTRO");
        
        this.jComboBox5.addItem("MATUTINA");
        this.jComboBox5.addItem("DESPERTINA");
        this.jComboBox5.addItem("VESPERTINA");
    }
}

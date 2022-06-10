/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vista;
import controlador.Formulario5Control;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * 
 * @author Andy Abad
 */
public class Ventana5 extends JFrame implements ActionListener
{
    private Formulario5Control formulario5Control;
    
    private JPanel jPanelPrincipal;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JPanel> jPanelList2;
    private ArrayList<JLabel> jLabelList;
    private ArrayList<JButton> jButtonList;
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
        jPanelPrincipal.setLayout(new GridLayout(4,1));
        this.iniciarPaneles();
    }
    public void iniciarPaneles()
    {
        jPanelList=new ArrayList();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.iniciarJLabelList();
        this.iniciarJComboBox();
        this.iniciarJPanel2();
        this.iniciarJButton();
        
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
        
        this.jPanelPrincipal.add(jPanelList.get(3));
        
        this.jPanelList.get(3).add(jButtonList.get(0));
        this.jButtonList.get(0).addActionListener(this);
        
        this.jPanelList.get(3).add(jButtonList.get(1));
        this.jButtonList.get(1).addActionListener(this);
        
        this.jPanelList.get(3).add(jButtonList.get(2));
        this.jButtonList.get(2).addActionListener(this);
        
        this.jPanelList.get(3).add(jButtonList.get(3));
        this.jButtonList.get(3).addActionListener(this);
       
        this.jPanelList.get(3).setOpaque(true);
        
        
        
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
        jComboBox6.addItem("58");
    }
    public void iniciarJButton()
    {
        jButtonList=new ArrayList();
        
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        
        jButtonList.get(0).setText("Crear");
        jButtonList.get(1).setText("Listar");
        jButtonList.get(2).setText("Modificar");
        jButtonList.get(3).setText("Eliminar");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        formulario5Control=new Formulario5Control();
        //crar
        if(e.getSource().equals(jButtonList.get(0)))
        {
            String sede=(String)jComboBox1.getSelectedItem();
            String campus=(String)jComboBox2.getSelectedItem();
            String carrera=(String)jComboBox3.getSelectedItem();
            String codigoProyecto=(String)jComboBox4.getSelectedItem();
            String modalidad=(String)jComboBox5.getSelectedItem();
            String periodo=(String)jComboBox6.getSelectedItem();
            
            this.formulario5Control.crear(sede, campus, carrera, codigoProyecto,
                    modalidad, periodo);
            
            System.out.println("El formulario se creo correctamente");
        }    
        //listar
        if(e.getSource().equals(jButtonList.get(1)))
        {
            System.out.println("++++++++------------Formularios-----------+++++++++");
            System.out.print(this.imprimir(this.formulario5Control.listar()));
            System.out.println("++++++++----------------------------------+++++++++");
        }
        //modificar
        if(e.getSource().equals(jButtonList.get(2)))
        {
            String sede=(String)jComboBox1.getSelectedItem();
            String campus=(String)jComboBox2.getSelectedItem();
            String carrera=(String)jComboBox3.getSelectedItem();
            String codigoProyecto=(String)jComboBox4.getSelectedItem();
            String modalidad=(String)jComboBox5.getSelectedItem();
            String periodo=(String)jComboBox6.getSelectedItem();
            
            int i=Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Ingrese la posicion donde desea modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE));
            
            this.formulario5Control.modificar(i,sede, campus, carrera, codigoProyecto,
                    modalidad, periodo);
            
            System.out.println("El formulario se modifico correctamente");
        }
        //eliminar
        if(e.getSource().equals(jButtonList.get(3)))
        {
            int i=Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Ingrese la posicion donde desea modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE));
            this.formulario5Control.eliminar(i);
            System.out.println("El formulario se elimino correctamente");
        }
    }
    public String imprimir(ArrayList lista)
    {
        String cadena="";
        for(Object object: lista)
        {
            cadena=cadena+object+"\n";
        }
        return cadena;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vista;
import controlador.Formulario2Control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * 
 * @author Andy Abad
 */
public class Ventana2 extends JFrame implements ActionListener
{
    private Formulario2Control formulario2Control;
    
    private JPanel jPanelPrincipal1;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JLabel> jLabelList;
    private JTextField jTextField1;
    private ArrayList<JButton> jButtonList;

    public Ventana2(String title)
    {
        super.setTitle(title);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.iniciarComponentes();
        this.setContentPane(jPanelPrincipal1);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    public void iniciarComponentes()
    {
        jPanelPrincipal1=new JPanel();
        this.iniciarPaneles();
        this.jPanelPrincipal1.setLayout(new BorderLayout());
        this.jPanelPrincipal1.add(jPanelList.get(0),BorderLayout.NORTH);
        this.jPanelPrincipal1.add(jPanelList.get(1),BorderLayout.CENTER);
    }
    public void iniciarPaneles()
    {
        jPanelList=new ArrayList();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.iniciarJLabelList();
        this.iniciarJTextField();
        this.iniciarJButtonList();
  
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(0).add(jLabelList.get(0));
        
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanelList.get(1).setLayout(new GridLayout(11,2));
        
        this.jPanelList.get(1).add(jLabelList.get(1));
        this.jPanelList.get(1).add(jLabelList.get(2));
        this.jPanelList.get(1).add(jLabelList.get(3));
        this.jPanelList.get(1).add(jLabelList.get(4));
        this.jPanelList.get(1).add(jLabelList.get(5));
        this.jPanelList.get(1).add(jLabelList.get(6));
        this.jPanelList.get(1).add(jLabelList.get(7));
        this.jPanelList.get(1).add(jLabelList.get(8));
        this.jPanelList.get(1).add(jLabelList.get(9));
        this.jPanelList.get(1).add(jLabelList.get(10));
        this.jPanelList.get(1).add(jLabelList.get(11));
        this.jPanelList.get(1).add(jLabelList.get(12));
        this.jPanelList.get(1).add(jLabelList.get(13));
        this.jPanelList.get(1).add(jLabelList.get(14));
        this.jPanelList.get(1).add(jLabelList.get(15));
        this.jPanelList.get(1).add(jLabelList.get(16));
        this.jPanelList.get(1).add(jLabelList.get(17));
        this.jPanelList.get(1).add(jTextField1);
        this.jPanelList.get(1).add(jButtonList.get(0));
        this.jButtonList.get(0).addActionListener(this);
        
        this.jPanelList.get(1).add(jButtonList.get(1));
        this.jButtonList.get(1).addActionListener(this);
        
        this.jPanelList.get(1).add(jButtonList.get(2));
        this.jButtonList.get(2).addActionListener(this);
        
        this.jPanelList.get(1).add(jButtonList.get(3));
        this.jButtonList.get(3).addActionListener(this);
        
    }
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList();
        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.get(0).setFont(new Font("Serif", Font.PLAIN, 15));
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("ORTIZ TERRENOS"));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("JOSUE BENIGNO"));
        this.jLabelList.add(new JLabel("Nacionalidad: "));
        this.jLabelList.add(new JLabel("ECUATORIANA"));
        this.jLabelList.add(new JLabel("Genero: "));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("Correo Electronico personal: "));
        this.jLabelList.add(new JLabel("mortizo@yahoo.com"));
        this.jLabelList.add(new JLabel("Fecha nacimiento: "));
        this.jLabelList.add(new JLabel("01-09-1940"));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("072818314"));
        this.jLabelList.add(new JLabel("Telefono celular: "));
        this.jLabelList.add(new JLabel("0984257604"));
        this.jLabelList.add(new JLabel("Whattsapp: "));
        
    }
    public void iniciarJTextField()
    {
        jTextField1=new JTextField();
        jTextField1.add(new JTextField(0));
        jTextField1.setColumns(20);
    }
    
    public void iniciarJButtonList()
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
        formulario2Control=new Formulario2Control();
        //crear
        if(e.getSource().equals(jButtonList.get(0)))
        {
            formulario2Control.crear(jTextField1.getText());
            jTextField1.setText("");
            System.out.println("El formulario fue guardado con exito");
        }
        //listar
        if(e.getSource().equals(jButtonList.get(1)))
        {
            System.out.println("+++++++-----------Formularios----------++++++++");
            System.out.print(this.imprimir(formulario2Control.listar()));
            System.out.println("+++++++--------------------------------++++++++");
        }
        //modificar
        if(e.getSource().equals(jButtonList.get(2)))
        {
            int i=Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Ingrese la posicion donde desea modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE));   
            formulario2Control.modificar(i,jTextField1.getText());
            jTextField1.setText("");
            System.out.println("El formulario fue modificado con exito");
        }
        //eliminar
        if(e.getSource().equals(jButtonList.get(3)))
        {
            int i=Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Ingrese la posicion del formulario donde desea eliminar",
                    "Eliminar",JOptionPane.PLAIN_MESSAGE));
            formulario2Control.eliminar(i);
            
            System.out.println("El formulario fue eliminado con exito");
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

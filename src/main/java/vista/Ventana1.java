/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vista;
import controlador.Formulario1Control;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * 
 * @author Andy Abad
 */
public class Ventana1 extends JFrame implements ActionListener
{
    private JPanel jPanelPrincipal1;
    private JPanel jPanelPrincipal2;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JLabel> jLabelList;
    private ArrayList<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JTextField jTextField1;
    private Formulario1Control formulario1Control;

    public Ventana1(String title) {
        super.setTitle(title);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.iniciarComponentes();
        this.setContentPane(jPanelPrincipal1);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void iniciarComponentes() {
        //this.iniciarEtiquetas();
        jPanelPrincipal1=new JPanel();
        jPanelPrincipal2=new JPanel();
        this.iniciarPaneles();
        this.jPanelPrincipal1.setLayout(new BorderLayout());
        this.jPanelPrincipal2.setLayout(new GridLayout(4, 1));
        this.jPanelPrincipal1.add(jPanelList.get(0),BorderLayout.NORTH);
        this.jPanelPrincipal1.add(jPanelPrincipal2,BorderLayout.CENTER);
        //this.iniciarPaneles();

    }

    public void iniciarPaneles() {
        jPanelList = new ArrayList<>();
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        this.iniciarEtiquetas();
        this.iniciarJComboBox();
        this.iniciarJTextField();
        this.iniciarJButton();
        
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(0).setOpaque(true);
        this.jPanelList.get(0).add(jLabelList.get(0));

        this.jPanelPrincipal2.add(jPanelList.get(1));
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(1).add(jLabelList.get(1));
        this.jPanelList.get(1).setOpaque(true);
        this.jPanelList.get(1).add(jComboBox1);

        this.jPanelPrincipal2.add(jPanelList.get(2));
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(2).setOpaque(true);
        this.jPanelList.get(2).add(jLabelList.get(2));
        this.jPanelList.get(2).add(jComboBox2);

        this.jPanelPrincipal2.add(jPanelList.get(3));
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(3).add(jLabelList.get(3));
        this.jPanelList.get(3).add(jTextField1);

        this.jPanelPrincipal2.add(jPanelList.get(4));
        this.jPanelList.get(4).setBackground(Color.WHITE);
        
        this.jPanelList.get(4).add(jButtonList.get(0));
        this.jButtonList.get(0).addActionListener(this);
        
        this.jPanelList.get(4).add(jButtonList.get(1));
        this.jButtonList.get(1).addActionListener(this);

        this.jPanelList.get(4).add(jButtonList.get(2));
        this.jButtonList.get(2).addActionListener(this);
        
        this.jPanelList.get(4).add(jButtonList.get(3));
        this.jButtonList.get(3).addActionListener(this);
    }

    public void iniciarEtiquetas() {
        jLabelList = new ArrayList();
        jLabelList.add(new JLabel("INSCRIBETE"));
        jLabelList.add(new JLabel("Selecione una sede: "));
        jLabelList.add(new JLabel("Tipo de documento: "));
        jLabelList.add(new JLabel("Ingrese su identificacion"));
        jLabelList.get(0).setForeground(Color.WHITE);
        jLabelList.get(0).setFont(new Font("Serif", Font.PLAIN, 15));
    }

    public void iniciarJComboBox() {
        jComboBox1 = new JComboBox();
        jComboBox2 = new JComboBox();
        jComboBox1.addItem("MATRIZ CUENCA");
        jComboBox1.addItem("MATRIZ QUITO");
        jComboBox1.addItem("MATRIZ GUAYAQUIL");
        jComboBox2.addItem("CEDULA");
        jComboBox2.addItem("PASAPORTE");
        jComboBox2.addItem("OTROS");
    }

    public void iniciarJTextField() {
        jTextField1 = new JTextField();
        jTextField1.setColumns(20);
    }

    public void iniciarJButton() {
        jButtonList = new ArrayList();
        
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        jButtonList.add(new JButton());
        this.jButtonList.get(0).setText("Crear");
        this.jButtonList.get(1).setText("Listar");
        this.jButtonList.get(2).setText("Modificar");
        this.jButtonList.get(3).setText("Eliminar");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        formulario1Control=new Formulario1Control();
        
        if(e.getSource().equals(jButtonList.get(0)))
        {
            String sede=(String)jComboBox1.getSelectedItem();
            String tipoDocumentacion=(String)jComboBox2.getSelectedItem();
            String documentacion=jTextField1.getText();
            this.formulario1Control.crear(sede, tipoDocumentacion, documentacion);
            this.jTextField1.setText("");
        }
        if(e.getSource().equals(jButtonList.get(1)))
        {
            
            System.out.println(this.Imprimir(this.formulario1Control.listar()));
            //System.out.println(this.formulario1Control.listar());
        }
        if(e.getSource().equals(jButtonList.get(2)))
        {
            String sede=(String)jComboBox1.getSelectedItem();
            String tipoDocumentacion=(String)jComboBox2.getSelectedItem();
            String documentacion=jTextField1.getText();
            int i=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicicion"
                    +" donde desea modificar: ", "Modificar Formulario", 
                    JOptionPane.PLAIN_MESSAGE));
            this.formulario1Control.modificar(i,sede, tipoDocumentacion, documentacion);
        }
        if(e.getSource().equals(jButtonList.get(3)))
        {
            int i=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la"
                    +"posicion de la lista a eliminar: ", "Eliminar Formulario"
                    ,JOptionPane.PLAIN_MESSAGE));
            this.formulario1Control.eliminar(i);
        }
    }
    public String Imprimir(ArrayList lista)
    {
        String cadena="";
        for(Object object: lista)
        {
            cadena=cadena+object+"\n";
        }
        return cadena;
    }
    
    
    
}

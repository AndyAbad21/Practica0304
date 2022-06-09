/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;

/**
 * 
 * @author Andy Abad
 */
public class Ventana2 extends JFrame
{
    private JPanel jPanelPrincipal1;
    private ArrayList<JPanel> jPanelList;
    private ArrayList<JLabel> jLabelList;
    private JTextField jTextField1;

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
  
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(0).add(jLabelList.get(0));
        
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanelList.get(1).setLayout(new GridLayout(9,2));
        
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
}

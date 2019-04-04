package GUI;


import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import Controladores.*;
import Backend.*;
import java.util.ArrayList;


/**
 * Write a description of class BannerFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BannerPanel extends ModelPanel
{
    

    /**
     * Constructor for objects of class BannerFrame
     */
    private JButton buttonCreate;
	private JLabel labelCreateBanner;
	private JLabel label11;
	private JLabel labelField1;
	private JLabel labelField10;
	private JLabel labelField2;
	private JLabel labelField3;
	private JLabel labelField4;
	private JLabel labelField5;
	private JLabel labelField6;
	private JLabel labelField7;
	private JLabel labelField8;
	private JLabel labelField9;	
	private JTextField textfield10;
	private JTextField textfield2;
	private JTextField textfield3;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	private JTextField textfield7;
	private JTextField textfield8;
	private JCheckBox field9;
	private JButton buttonCancel;
	private UsuarioRegistrado usuarioActual;
	private int bannerType;
    public BannerPanel(int userType, UsuarioRegistrado user)
    {  
       super(false);
       
       
       this.setBorder(BorderFactory.createEtchedBorder(1));
	   this.setBounds(25,27,752,541);
	   this.setBackground(new Color(214,217,223));
	   this.setForeground(new Color(0,0,0));
	   this.setEnabled(true);
	   this.setFont(new Font("sansserif",0,12));
	   this.setVisible(true);
	   
	   usuarioActual=user;
	   bannerType=userType;
	   
       buttonCreate = new JButton();
       buttonCreate.setBounds(276,491,90,35);
       buttonCreate.setBackground(new Color(214,217,223));
       buttonCreate.setForeground(new Color(0,0,0));
       buttonCreate.setEnabled(true);
       buttonCreate.setFont(new Font("sansserif",0,12));
       buttonCreate.setText("Crear");
       buttonCreate.setVisible(true);
       
       buttonCancel = new JButton();
       buttonCancel.setBounds(372,492,90,35);
       buttonCancel.setBackground(new Color(214,217,223));
       buttonCancel.setForeground(new Color(0,0,0));
       buttonCancel.setEnabled(true);
       buttonCancel.setFont(new Font("sansserif",0,12));
       buttonCancel.setText("Button2");
       buttonCancel.setVisible(true);
       
       labelCreateBanner = new JLabel();
       labelCreateBanner.setBounds(307,21,114,34);
       labelCreateBanner.setBackground(new Color(214,217,223));
       labelCreateBanner.setForeground(new Color(0,0,0));
       labelCreateBanner.setEnabled(true);
       labelCreateBanner.setFont(new Font("SansSerif",0,16));
       labelCreateBanner.setText("Crear Banner:");
       labelCreateBanner.setVisible(true);
       
       label11 = new JLabel();
       label11.setBounds(172,129,90,35);
       label11.setBackground(new Color(214,217,223));
       label11.setForeground(new Color(0,0,0));
       label11.setEnabled(true);
       label11.setFont(new Font("sansserif",0,12));
       label11.setText(user.getNombreUsuario());
       label11.setVisible(true);

       labelField1 = new JLabel();
       labelField1.setBounds(92,129,90,35);
       labelField1.setBackground(new Color(214,217,223));
       labelField1.setForeground(new Color(0,0,0));
       labelField1.setEnabled(true);
       labelField1.setFont(new Font("sansserif",0,12));
       labelField1.setText("UserName:");
       labelField1.setVisible(true);

       labelField10 = new JLabel();
       labelField10.setBounds(429,368,90,35);
       labelField10.setBackground(new Color(214,217,223));
       labelField10.setForeground(new Color(0,0,0));
       labelField10.setEnabled(true);
       labelField10.setFont(new Font("sansserif",0,12));		
       labelField10.setVisible(true);

       labelField2 = new JLabel();
       labelField2.setBounds(101,189,90,35);
       labelField2.setBackground(new Color(214,217,223));
       labelField2.setForeground(new Color(0,0,0));
       labelField2.setEnabled(true);
       labelField2.setFont(new Font("sansserif",0,12));
       labelField2.setText("Materia:");
       labelField2.setVisible(true);

       labelField3 = new JLabel();
       labelField3.setBounds(100,253,90,35);
       labelField3.setBackground(new Color(214,217,223));
       labelField3.setForeground(new Color(0,0,0));
       labelField3.setEnabled(true);
       labelField3.setFont(new Font("sansserif",0,12));
       labelField3.setText("Rama:");
       labelField3.setVisible(true);

       labelField4 = new JLabel();
       labelField4.setBounds(99,313,90,35);
       labelField4.setBackground(new Color(214,217,223));
       labelField4.setForeground(new Color(0,0,0));
       labelField4.setEnabled(true);
       labelField4.setFont(new Font("sansserif",0,12));
       labelField4.setText("Tema:");
       labelField4.setVisible(true);

       labelField5 = new JLabel();
       labelField5.setBounds(99,364,90,35);
       labelField5.setBackground(new Color(214,217,223));
       labelField5.setForeground(new Color(0,0,0));
       labelField5.setEnabled(true);
       labelField5.setFont(new Font("sansserif",0,12));
       labelField5.setText("Fecha:");
       labelField5.setVisible(true);

       labelField6 = new JLabel();
       labelField6.setBounds(428,130,90,35);
       labelField6.setBackground(new Color(214,217,223));
       labelField6.setForeground(new Color(0,0,0));
       labelField6.setEnabled(true);
       labelField6.setFont(new Font("sansserif",0,12));
       labelField6.setText("Lugar:");
       labelField6.setVisible(true);

       labelField7 = new JLabel();
       labelField7.setBounds(428,193,90,35);
       labelField7.setBackground(new Color(214,217,223));
       labelField7.setForeground(new Color(0,0,0));
       labelField7.setEnabled(true);
       labelField7.setFont(new Font("sansserif",0,12));		
       labelField7.setVisible(true);

       labelField8 = new JLabel();
       labelField8.setBounds(431,250,90,35);
       labelField8.setBackground(new Color(214,217,223));
       labelField8.setForeground(new Color(0,0,0));
       labelField8.setEnabled(true);
       labelField8.setFont(new Font("sansserif",0,12));
       labelField8.setVisible(true);

       labelField9 = new JLabel();
       labelField9.setBounds(429,308,90,35);
       labelField9.setBackground(new Color(214,217,223));
       labelField9.setForeground(new Color(0,0,0));
       labelField9.setEnabled(true);
       labelField9.setFont(new Font("sansserif",0,12));
       labelField9.setText("Visibilidad:");
       labelField9.setVisible(true);
		

       textfield10 = new JTextField();
       textfield10.setBounds(496,368,90,35);
       textfield10.setBackground(new Color(255,255,255));
       textfield10.setForeground(new Color(0,0,0));
       textfield10.setEnabled(true);
       textfield10.setFont(new Font("sansserif",0,12));
       textfield10.setText("");
       textfield10.setVisible(true);

       textfield2 = new JTextField();
       textfield2.setBounds(169,185,90,35);
       textfield2.setBackground(new Color(255,255,255));
       textfield2.setForeground(new Color(0,0,0));
       textfield2.setEnabled(true);
       textfield2.setFont(new Font("sansserif",0,12));
       textfield2.setText("");
       textfield2.setVisible(true);

       textfield3 = new JTextField();
       textfield3.setBounds(171,254,90,35);
       textfield3.setBackground(new Color(255,255,255));
       textfield3.setForeground(new Color(0,0,0));
       textfield3.setEnabled(true);
       textfield3.setFont(new Font("sansserif",0,12));
       textfield3.setText("");
       textfield3.setVisible(true);

       textfield4 = new JTextField();
       textfield4.setBounds(173,315,90,35);
       textfield4.setBackground(new Color(255,255,255));
       textfield4.setForeground(new Color(0,0,0));
       textfield4.setEnabled(true);
       textfield4.setFont(new Font("sansserif",0,12));
       textfield4.setText("");
       textfield4.setVisible(true);
       
       textfield5 = new JTextField();
       textfield5.setBounds(175,365,90,35);
       textfield5.setBackground(new Color(255,255,255));
       textfield5.setForeground(new Color(0,0,0));
       textfield5.setEnabled(true);
       textfield5.setFont(new Font("sansserif",0,12));
       textfield5.setText("");
       textfield5.setVisible(true);

       textfield6 = new JTextField();
       textfield6.setBounds(500,129,90,35);
       textfield6.setBackground(new Color(255,255,255));
       textfield6.setForeground(new Color(0,0,0));
       textfield6.setEnabled(true);
       textfield6.setFont(new Font("sansserif",0,12));
       textfield6.setText("");
       textfield6.setVisible(true);

       textfield7 = new JTextField();
       textfield7.setBounds(501,191,90,35);
       textfield7.setBackground(new Color(255,255,255));
       textfield7.setForeground(new Color(0,0,0));
       textfield7.setEnabled(true);
       textfield7.setFont(new Font("sansserif",0,12));
       textfield7.setText("");
       textfield7.setVisible(true);

       textfield8 = new JTextField();
       textfield8.setBounds(498,249,90,35);
       textfield8.setBackground(new Color(255,255,255));
       textfield8.setForeground(new Color(0,0,0));
       textfield8.setEnabled(true);
       textfield8.setFont(new Font("sansserif",0,12));
       textfield8.setText("");
       textfield8.setVisible(true);

       field9 = new JCheckBox();
       field9.setBounds(501,308,90,35);
       field9.setBackground(new Color(214,217,223));
       field9.setForeground(new Color(0,0,0));
       field9.setEnabled(true);
       field9.setFont(new Font("sansserif",0,12));
       field9.setText("Visible");
       field9.setVisible(true);
       
		//adding components to contentPane panel
		
       switch(userType){
           case 1:
           //Aprendiz
           labelField7.setText("Pago Max/h:");
           labelField8.setText("Horas Req:");           
           labelField10.setText("repMin:");           
           
           break;
           case 2:
           labelField7.setText("Horas min:");
           labelField8.setText("Descuento:");           
           labelField10.setText("Descripcion:");   
           break;
        }
				
		//adding components to contentPane panel
		this.add(buttonCreate);
		this.add(buttonCancel);
		this.add(labelCreateBanner);
		this.add(label11);
		this.add(labelField1);
		this.add(labelField10);
		this.add(labelField2);
		this.add(labelField3);
		this.add(labelField4);
		this.add(labelField5);
		this.add(labelField6);
		this.add(labelField7);
		this.add(labelField8);
		this.add(labelField9);		
		this.add(textfield10);
		this.add(textfield2);
		this.add(textfield3);
		this.add(textfield4);
		this.add(textfield5);
		this.add(textfield6);
		this.add(textfield7);
		this.add(textfield8);
		this.add(field9);
       

		
		
	  	
    }    
    public JButton getBotonCrear(){
        return this.buttonCreate;
    }
    public JButton getBotonCancelar(){
        return this.buttonCancel;
    }
    public UsuarioRegistrado getUsuario(){
        return this.usuarioActual;
    }
    public int getBannerType(){
    return this.bannerType;
    }
    public ArrayList getDatos(){
        ArrayList datos = new ArrayList<Object>();
        datos.add(textfield2.getText());
        datos.add(textfield3.getText());
        datos.add(textfield4.getText());
        datos.add(textfield5.getText());
        datos.add(textfield6.getText());
        datos.add(textfield7.getText());
        datos.add(textfield8.getText());
        if(this.bannerType==1){
         datos.add(field9.isSelected());
         datos.add(textfield10.getText());   
        }
        else{
         datos.add(textfield10.getText());   
         datos.add(field9.isSelected());            
        }
        
        return datos;
    }
		
        
        
}
    


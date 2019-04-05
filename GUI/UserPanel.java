package GUI;

import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
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
import java.net.URL;
import java.io.IOException;
import java.util.StringTokenizer;
import Backend.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class UserPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserPanel extends ModelPanel
{
  private JButton buttonDeleteBanner;
  private JButton buttonEdit;
  private JButton buttonCrear;  
  private JButton buttonEditData;
  private JButton buttonRefresh;
  private JButton botonVolver;
  private JLabel labelBienvenido;
  private JLabel labelMyBanners;
  private JLabel labelName;
  private JLabel labelOtherBanners;
  private JLabel labelType;
  private JLabel labelUserType;
  private JList listMyBanners;
  private JList listOtherBanners;  
  private UsuarioRegistrado actualUser;
  private BannerPanel panelBaner;
  private ArrayList<Banner> misBanners = null;
  public UserPanel(){
      super(false); 
      buttonDeleteBanner = new JButton();
      buttonDeleteBanner.setBounds(630,299,83,23);
      buttonDeleteBanner.setBackground(new Color(214,217,223));
      buttonDeleteBanner.setForeground(new Color(0,0,0));
      buttonDeleteBanner.setEnabled(true);
      buttonDeleteBanner.setFont(new Font("sansserif",0,12));
      buttonDeleteBanner.setText("Eliminar");
      buttonDeleteBanner.setVisible(true);
      
      
      buttonCrear = new JButton();
      buttonCrear.setBounds(630,245,79,23);
      buttonCrear.setBackground(new Color(214,217,223));
      buttonCrear.setForeground(new Color(0,0,0));
      buttonCrear.setEnabled(true);
      buttonCrear.setFont(new Font("sansserif",0,12));
      buttonCrear.setText("Crear");
      buttonCrear.setVisible(true);
      
      buttonEdit = new JButton();
      buttonEdit.setBounds(630,265,79,23);
      buttonEdit.setBackground(new Color(214,217,223));
      buttonEdit.setForeground(new Color(0,0,0));
      buttonEdit.setEnabled(true);
      buttonEdit.setFont(new Font("sansserif",0,12));
      buttonEdit.setText("Ver");
      buttonEdit.setVisible(true);
      
      /*
      buttonCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {         
                  
            
            
            }
        });
      */      
      

      buttonEditData = new JButton();
      buttonEditData.setBounds(299,135,97,23);
      buttonEditData.setBackground(new Color(214,217,223));
      buttonEditData.setForeground(new Color(0,0,0));
      buttonEditData.setEnabled(true);
      buttonEditData.setFont(new Font("sansserif",0,12));
      buttonEditData.setText("Editar Datos");
      buttonEditData.setVisible(false);      

      buttonRefresh = new JButton();
      buttonRefresh.setBounds(632,399,76,24);
      buttonRefresh.setBackground(new Color(214,217,223));
      buttonRefresh.setForeground(new Color(0,0,0));
      buttonRefresh.setEnabled(true);
      buttonRefresh.setFont(new Font("sansserif",0,12));
      buttonRefresh.setText("Ver");
      buttonRefresh.setVisible(true);

      labelBienvenido = new JLabel();
      labelBienvenido.setBounds(241,70,135,34);
      labelBienvenido.setBackground(new Color(214,217,223));
      labelBienvenido.setForeground(new Color(0,0,0));
      labelBienvenido.setEnabled(true);
      labelBienvenido.setFont(new Font("SansSerif",0,25));
      labelBienvenido.setText("Bienvenido:");
      labelBienvenido.setVisible(true);

      labelMyBanners = new JLabel();
      labelMyBanners.setBounds(278,203,150,34);
      labelMyBanners.setBackground(new Color(214,217,223));
      labelMyBanners.setForeground(new Color(0,0,0));
      labelMyBanners.setEnabled(true);
      labelMyBanners.setFont(new Font("SansSerif",0,20));
      labelMyBanners.setText("MIS BANNERS:");
      labelMyBanners.setVisible(true);

      labelName = new JLabel();
      labelName.setBounds(372,71,300,35);
      labelName.setBackground(new Color(214,217,223));
      labelName.setForeground(new Color(0,0,0));
      labelName.setEnabled(true);
      labelName.setFont(new Font("SansSerif",0,25));
      labelName.setText("label");
      labelName.setVisible(true);

      labelOtherBanners = new JLabel();
      labelOtherBanners.setBounds(256,348,187,29);
      labelOtherBanners.setBackground(new Color(214,217,223));
      labelOtherBanners.setForeground(new Color(0,0,0));
      labelOtherBanners.setEnabled(true);
      labelOtherBanners.setFont(new Font("SansSerif",0,20));
      labelOtherBanners.setText("OTROS BANNERS:");
      labelOtherBanners.setVisible(true);

      labelType = new JLabel();
      labelType.setBounds(338,101,150,35);
      labelType.setBackground(new Color(214,217,223));
      labelType.setForeground(new Color(0,0,0));
      labelType.setEnabled(true);
      labelType.setFont(new Font("sansserif",0,12));
      labelType.setText("label");
      labelType.setVisible(true);

      labelUserType = new JLabel();
      labelUserType.setBounds(242,101,96,33);
      labelUserType.setBackground(new Color(214,217,223));
      labelUserType.setForeground(new Color(0,0,0));
      labelUserType.setEnabled(true);
      labelUserType.setFont(new Font("sansserif",0,12));
      labelUserType.setText("Tipo de Usuario:");
      labelUserType.setVisible(true);

      listMyBanners = new JList();
      listMyBanners.setBounds(89,239,534,100);
      listMyBanners.setBackground(new Color(255,255,255));
      listMyBanners.setForeground(new Color(0,0,0));
      listMyBanners.setEnabled(true);
      listMyBanners.setFont(new Font("sansserif",0,12));
      listMyBanners.setVisible(true);
      

      listOtherBanners = new JList();
      listOtherBanners.setBounds(88,382,534,177);
      listOtherBanners.setBackground(new Color(255,255,255));
      listOtherBanners.setForeground(new Color(0,0,0));
      listOtherBanners.setEnabled(true);
      listOtherBanners.setFont(new Font("sansserif",0,12));
      listOtherBanners.setVisible(true);
      
      botonVolver = new JButton();
      botonVolver.setBounds(632,504,90,35);
      botonVolver.setBackground(new Color(214,217,223));
      botonVolver.setForeground(new Color(0,0,0));
      botonVolver.setEnabled(true);
      botonVolver.setFont(new Font("sansserif",0,12));
      botonVolver.setText("Volver");
      botonVolver.setVisible(true);
      botonVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {   
                misBanners=null;      
            
            
            }
        });
      
      this.add(buttonDeleteBanner);
      this.add(buttonEdit);
      this.add(buttonEditData);
      this.add(buttonRefresh);
      this.add(labelBienvenido);
      this.add(labelMyBanners);
      this.add(labelName);
      this.add(labelOtherBanners);
      this.add(labelType);
      this.add(labelUserType);
      this.add(listMyBanners);
      this.add(listOtherBanners);
      this.add(botonVolver);
      this.add(buttonCrear);
    }
  public String getUserData(){
        return labelType.getText()+"/"+labelName.getText();
    }
  
  public ArrayList<Banner> getMisBanners(){
     return this.misBanners;
    }
  
  public JButton getBotonCrear(){
      return this.buttonCrear;
      
    }
  public JButton getBotonVolver(){
      return this.botonVolver;
    }
  public void actualizar(String datos, ConexionBD c){  
      
      if(datos.isEmpty()){
          labelType.setText("");
          labelName.setText("Por favor Ingrese Un Usuario");          
        }
      else{
      StringTokenizer tokens=new StringTokenizer(datos,"/");
      String userType=tokens.nextToken();
      String userName=tokens.nextToken();      
      labelType.setText(userType);
      labelName.setText(userName);
      buttonDeleteBanner.setVisible(true);
      buttonCrear.setVisible(true);      
      DefaultListModel listModel1 = new DefaultListModel();      
      listMyBanners.setModel(listModel1);
      buttonEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(!labelType.equals("UsuarioRegistrado")){                    
                 JOptionPane.showMessageDialog(null, getMisBanners().get(listMyBanners.getSelectedIndex()).toString(), " ", JOptionPane.INFORMATION_MESSAGE);
                 } 
            }
        });      
      
      
      switch(userType){
       
       case "UsuarioRegistrado":
          buttonDeleteBanner.setVisible(false);
          buttonCrear.setVisible(false);          
          listModel1.addElement("No se Puede Añadir/Modificar/Eliminar Banners siendo un Usuario Registrado.");
          actualUser = ControladorUsuarios.getUsuario(c,userName);
          break;
        
       case "Aprendiz":
        actualUser = (Aprendiz)ControladorUsuarios.getUsuario(c,userName);
        Aprendiz aprendiz =(Aprendiz)actualUser;
        misBanners= aprendiz.getBanners();
        
        
        break;
      
       case "Tutor":
        actualUser = (Tutor)ControladorUsuarios.getUsuario(c,userName);    
        Tutor tutor =(Tutor)actualUser;
        misBanners= tutor.getBanners();
        break;
      }
      
      
      if(actualUser !=null){
          DefaultListModel listModel2 = new DefaultListModel();
          listOtherBanners.setModel(listModel2); 
          
          if(misBanners!=null){
              for(Banner banner : misBanners){
                  HashMap contenido = banner.verBanner();      
                  listModel1.addElement(contenido.get("E_MATERIA")+" "+contenido.get("E_RAMA")+" "+contenido.get("E_TEMA"));
                  
                }  
            }
            else {
                if(!userType.equals("UsuarioRegistrado")){
                    listModel1.addElement("El Usuario No tiene Banners");
                }
            }    
          
          ArrayList<Banner> OtrosBanners = ControladorBanners.verBanners(c, actualUser);
          if(OtrosBanners.size()>0){
              for(Banner banner : OtrosBanners){
                  HashMap contenido = banner.verBanner();
                  listModel2.addElement(contenido.get("C_AUTOR")+" "+contenido.get("E_MATERIA")+" "+contenido.get("E_RAMA")+" "+contenido.get("E_TEMA"));
                }
            }       
            else {
                listModel2.addElement("No hay banners disponibles");
            }
            buttonRefresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {    
                JOptionPane.showMessageDialog(null, OtrosBanners.get(listOtherBanners.getSelectedIndex()).toString(), " ", JOptionPane.INFORMATION_MESSAGE);              
            
            
            }
           });          
        }
     }
     this.buttonDeleteBanner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ControladorBanners.eliminarBanner(c,getMisBanners().get(listMyBanners.getSelectedIndex()));    
                actualizar(labelType.getText()+"/"+labelName.getText(),c);
                
            
            }
        });     
      
      
      
    }
}

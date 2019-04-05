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
import java.util.ArrayList;
/**
 * 
 * @author Lokuest-Pecons
 * @version 0.8
 */
public class PanelCrearUsuario extends ModelPanel
{
    private JButton botonCrear;
    private JButton botonVolver;
    private JButton botonSelec;
    private JComboBox comboBoxTipoUsuario;   
    private JLabel labelTipoUsuario;
    private JLabel labelTitle;    
    private Formulario formulario1;
    private Formulario formulario2;
    private Formulario formulario3;
    private int tipo;
    private ArrayList queryData;
    
    public PanelCrearUsuario(boolean isPrincipal)
    {
        super(isPrincipal);
        queryData = new ArrayList<Object>();
        //Creo Label Principal-----------------------------------------------
        
        labelTitle = new JLabel();
        labelTitle.setBounds(30,15,387,61);
        labelTitle.setBackground(new Color(214,217,223));
        labelTitle.setForeground(new Color(0,0,0));
        labelTitle.setEnabled(true);
        labelTitle.setFont(new Font("SansSerif",0,40));
        labelTitle.setText("TeachApp : Create");
        labelTitle.setVisible(true);
        
        //-------------------------------------------------------------------
        
        //Creo Boton de Crear ------------------------------------------------
        
        botonCrear = new JButton();
        botonCrear.setBounds(194,512,90,35);
        botonCrear.setBackground(new Color(214,217,223));
        botonCrear.setForeground(new Color(0,0,0));
        botonCrear.setEnabled(true);
        botonCrear.setFont(new Font("sansserif",0,12));
        botonCrear.setText("Crear");
        botonCrear.setVisible(true);  
        
        //--------------------------------------------------------------------
        
        //Creo Boton de Volver -----------------------------------------------
        
        botonVolver = new JButton();
        botonVolver.setBounds(489,512,90,35);
        botonVolver.setBackground(new Color(214,217,223));
        botonVolver.setForeground(new Color(0,0,0));
        botonVolver.setEnabled(true);
        botonVolver.setFont(new Font("sansserif",0,12));
        botonVolver.setText("Volver");
        botonVolver.setVisible(true);
        
        //-------------------------------------------------------------------
        //Creo Label Tipo de Usuario-------------------------------------------
        
        labelTipoUsuario = new JLabel();
        labelTipoUsuario.setBounds(185,120,152,23);
        labelTipoUsuario.setBackground(new Color(214,217,223));
        labelTipoUsuario.setForeground(new Color(0,0,0));
        labelTipoUsuario.setEnabled(true);
        labelTipoUsuario.setFont(new Font("SansSerif",0,20));
        labelTipoUsuario.setText("Tipo de Usuario:");
        labelTipoUsuario.setVisible(true);
        
        //----------------------------------------------------------------------
        //Creo ComboBox -----------------------------------------------------
        comboBoxTipoUsuario = new JComboBox();
        comboBoxTipoUsuario.setBounds(335,120,150,30);
        comboBoxTipoUsuario.setBackground(new Color(214,217,223));
        comboBoxTipoUsuario.setForeground(new Color(0,0,0));
        comboBoxTipoUsuario.setEnabled(true);
        comboBoxTipoUsuario.setFont(new Font("sansserif",0,12));
        comboBoxTipoUsuario.setVisible(true);
        
        comboBoxTipoUsuario.addItem("Tutor");
        comboBoxTipoUsuario.addItem("Aprendiz");
        comboBoxTipoUsuario.addItem("None");
        //-------------------------------------------------------------------
        
        //Crear Boton Selec --------------------------------------------------
        botonSelec = new JButton();
        botonSelec.setBounds(500,120,120,32);
        botonSelec.setBackground(new Color(214,217,223));
        botonSelec.setForeground(new Color(0,0,0));
        botonSelec.setEnabled(true);
        botonSelec.setFont(new Font("sansserif",0,12));
        botonSelec.setText("Seleccionar");
        botonSelec.setVisible(true);
        
        botonSelec.addActionListener(new ActionListener()          
        {
            public void actionPerformed(ActionEvent evt) {                
               if(comboBoxTipoUsuario.getSelectedItem().equals("Tutor")){
                    formulario1.setVisible(true);
                    formulario2.setVisible(false);
                    formulario3.setVisible(false);                    
                    setTipo(1);
               } 
               if(comboBoxTipoUsuario.getSelectedItem().equals("Aprendiz")){
                    formulario1.setVisible(false);
                    formulario2.setVisible(true);
                    formulario3.setVisible(false);                    
                    setTipo(2);
               }                          
               if(comboBoxTipoUsuario.getSelectedItem().equals("None")){
                    formulario1.setVisible(false);
                    formulario2.setVisible(false);
                    formulario3.setVisible(true);                    
                    setTipo(3);
               } 
               
            }
        });
        //--------------------------------------------------------------------
        
        
        
        
        
        //adding components to contentPane panel
        this.add(botonCrear);
        this.add(botonVolver);
        this.add(botonSelec);
        this.add(comboBoxTipoUsuario);        
        this.add(labelTipoUsuario);
        this.add(labelTitle);        
        agregarFormularios();
        
        
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public JButton getBotonVolver(){
        return this.botonVolver;
    }
    public JButton getBotonCrear(){
        return this.botonCrear;
    }
    public void agregarFormularios(){
        formulario1 = new FormularioTutor();
        formulario2 = new FormularioAprendiz();
        formulario3 = new Formulario();
        this.add(formulario1);
        this.add(formulario2);
        this.add(formulario3);
    }
    public int getTipoFormulario(){
        return this.tipo;
    }
    public ArrayList obtenerQueryData(){        
        queryData.clear();
        switch (getTipoFormulario()){
            case 1:
                queryData.addAll(formulario1.getDatos());                
                break;
            case 2:
                queryData.addAll(formulario2.getDatos());
                break;
            case 3:
                queryData.addAll(formulario3.getDatos());
                break;
        }
        return queryData;
    }
    public void limpiarForms(){
        switch(getTipoFormulario()){
            case 1:
            formulario1.limpiar();
            break;
            case 2:
            formulario2.limpiar();
            break;
            case 3:
            formulario3.limpiar();
            break; 
        }
    }
}

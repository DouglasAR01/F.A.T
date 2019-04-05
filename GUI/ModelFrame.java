package GUI;


/**
 * 
 * @author Lokuest-Pecons
 * @version 0.8
 */
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
import java.io.*;

public abstract class ModelFrame extends JFrame {
    
    private JMenuBar menuBar;
    
    /**
     * Constructor for objects of class ModelFrame
     */
    public ModelFrame(boolean haveMenu)
    {
        this.setTitle("F.A.T");
        this.setSize(800,600);       
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getPath()+"icon.png");
        this.setIconImage(icon);
        //Generar menú.
        if(haveMenu){
        generateMenu();
        this.setJMenuBar(menuBar);        
       }
        
        
        añadirComponentes();        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        
    }

    //Métodos:
    public abstract void añadirComponentes();
    
    //Este metodo guarda la bd
    public void guardarBD(){
        try{
            FileOutputStream fs = new FileOutputStream("bd.ser");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            os.writeObject(ControladorDeEventos.query.BASE_DATOS);
            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");        
        JMenu help = new JMenu("Help");

        
        
        JMenuItem exit = new JMenuItem("Save and Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                  salir();
            }
        });
        JMenuItem about = new JMenuItem("About   ");
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PanelBox.mostrarMensaje("Proyecto de Ingenieria de Software 2 \n Realizado por :\n\t -Douglas Ramirez\n\t -Henry Peña", "Acerca de:");
            }
        });

        
        
        file.add(exit);
        
        help.add(about);

        menuBar.add(file);        
        menuBar.add(help);
    }
    public void salir(){
        guardarBD();
        dispose();
        System.exit(1);
    }
    public String getPath(){
        String filePath=System.getProperty("user.dir");       
        filePath+="\\misc\\";
       return filePath;
    }

    
    
}
